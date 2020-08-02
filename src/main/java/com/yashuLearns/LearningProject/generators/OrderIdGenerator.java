package com.yashuLearns.LearningProject.generators;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        String prefix="ORD";
        String suffix="";
        Connection connection=sharedSessionContractImplementor.connection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select orderid.nextval from dual");
            while(resultSet.next()){
                int seqval=resultSet.getInt(1);
                suffix=String.valueOf(seqval);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prefix+suffix;
    }
}

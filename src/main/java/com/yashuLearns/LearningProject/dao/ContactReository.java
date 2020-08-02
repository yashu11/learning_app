package com.yashuLearns.LearningProject.dao;

import com.yashuLearns.LearningProject.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactReository extends JpaRepository<Contact,Integer> {


}

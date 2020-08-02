package com.yashuLearns.LearningProject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ContactDetails")
@ApiModel
public class Contact {
    @Id
    @Column(name="Id")
    @ApiModelProperty("id of the user")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="contactNumber")
    private String contactNumber;

}

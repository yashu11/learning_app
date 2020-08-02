package com.yashuLearns.LearningProject.service;

import com.yashuLearns.LearningProject.dao.ContactReository;
import com.yashuLearns.LearningProject.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactReository contactReository;

    public Contact getDetails(Integer id) {
        return contactReository.findById(id).get();
    }

    public List<Contact> getAllDetails() {
        return contactReository.findAll();
    }
}

package com.yashuLearns.LearningProject.controller;

import com.yashuLearns.LearningProject.model.Contact;
import com.yashuLearns.LearningProject.model.ContactDto;
import com.yashuLearns.LearningProject.service.ContactService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactController {
    @Autowired
    ContactService contactService;

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Finds Contact by Id")
    //This is for path param (https://localhost:8081/api/1)
    public Contact getContact(@ApiParam(value = "Id of the contact",required = true) @PathVariable Integer id) {
    //This is for query param (https://localhost:8081/api?id=1)
//    public Contact getContact(@ApiParam(value = "Id of the contact",required = true) @RequestParam("id") Integer id) {

        return contactService.getDetails(id);
    }

    @GetMapping(value = "/findAll")
    @ApiOperation(value = "Finds All contacts")
    public List<Contact> getContacts() {
        return contactService.getAllDetails();
    }
//    @PostMapping("/saveContact")
//    public ResponseEntity<MappingJacksonValue> saveContact(@RequestBody List<ContactDto> contactDtoList){
//
//    }
}

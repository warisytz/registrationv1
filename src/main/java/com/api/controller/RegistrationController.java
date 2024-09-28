package com.api.controller;

import com.api.entity.Registration;
import com.api.payload.RegistrationDto;
import com.api.service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registraton")        //API helps us to exchange the data b/w  2 diff. software
public class RegistrationController {

    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }


    @GetMapping      //help us to read all the data from database via API     will convert java obj. into jasson obj.
    public ResponseEntity<List<RegistrationDto>>getAllRegistrations(){

        List<RegistrationDto> dtos = registrationService.getRegistrations();
        return new ResponseEntity<>(dtos, HttpStatus.OK) ;     //to read  data 200


    }
    @PostMapping    //help us to save the record in database via API
    public ResponseEntity<RegistrationDto>createRegistration(
        @RequestBody RegistrationDto registrationDto     //@requestBOdy will copy jason content to given entity obj.like dto
    ){

        RegistrationDto regDto = registrationService.createRegistration(registrationDto);
        return new ResponseEntity<>(regDto,HttpStatus.CREATED);   //created 201 if we want to insert in database
    }
    @DeleteMapping   //help us to delete the record in database via API
    public ResponseEntity<String>deleteRegistration(
           @RequestParam long id      //to read value from url and initialize to given variable like id

    ){
        registrationService.deleteRegistration(id);
        return new ResponseEntity<>("Deleted" , HttpStatus.OK);  //200

    }
    @PutMapping("/{id}")  //help us to update the data in database via API
    public ResponseEntity<Registration>updateRegistration(
            @PathVariable long id,      // similar to @request param to read value from url and initialize to given variable
            @RequestBody Registration registration


    ){
        Registration updateReg=registrationService.updateRegistration(id,registration);
        return new ResponseEntity<>(updateReg,HttpStatus.OK);    //200
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistrationDto>getRegistrationById(
            @PathVariable() Long id

    ) {
        RegistrationDto dto = registrationService.getRegistrationById(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
    }

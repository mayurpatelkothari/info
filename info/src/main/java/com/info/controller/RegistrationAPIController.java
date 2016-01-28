package com.info.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.info.model.Registration;
import com.info.repository.RegistrationRepository;

@RestController
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class RegistrationAPIController
{
    @Inject
    private RegistrationRepository registrationRepository;

    @RequestMapping(value = "/test/data", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void create(@RequestBody Registration registration)
    {
        registrationRepository.save(registration);
    }
}

package com.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long>
{
    public Registration findByuid(String uid);
}

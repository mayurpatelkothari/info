package com.info.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@Entity
@Table(name = "registration")
@JsonSerialize(include = Inclusion.NON_NULL)
public class Registration extends Basemodel
{
    private String uid;

    private String password;
    @Enumerated(EnumType.STRING)
    private Role   role;

    public enum Role
    {
        ROLE_USER, ROLE_ADMIN
    }

    public String getUid()
    {
        return uid;
    }

    public void setUid(String uid)
    {
        this.uid = uid;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Role getRole()
    {
        return role;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }
}

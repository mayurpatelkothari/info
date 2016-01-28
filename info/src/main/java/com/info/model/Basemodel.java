package com.info.model;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
@MappedSuperclass
public class Basemodel
{
    @Id
    private String id;
    

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @PrePersist
    public void gnreatedId()
    {
        this.id = UUID.randomUUID().toString();
    }
}

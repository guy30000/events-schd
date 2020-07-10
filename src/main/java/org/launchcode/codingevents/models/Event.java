package org.launchcode.codingevents.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;
import javax.persistence.*;
//
//
@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @Size(min = 3, max = 20, message = "Name must be 3 - 20 characters")
    @NotBlank(message = "Name is required")
    private String name;

    @Size(max = 500, message = "Desc must be less than 500 characters")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email")
    private String contactEmail;

    private EventType type;

    public Event(){}

    public Event(String name, String description, String contactEmail) {
        this.name= name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type= type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
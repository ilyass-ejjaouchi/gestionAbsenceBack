package com.ensa.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Component
@Entity
public class Topic {
    @Id
    private String subject;
    @ManyToMany
    private List<ConferenceEvent> conferenceEvent;

    public Topic() {

    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

}

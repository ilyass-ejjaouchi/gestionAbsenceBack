package com.ensa.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Component
@Entity
public class Contribution {
    @Id
    private String title;
    @ManyToOne
    private ConferenceEvent conferenceEvent;
    @ManyToMany
    private List<Speaker> speaker;
    public Contribution() {

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public ConferenceEvent getConferenceEvent() {
        return conferenceEvent;
    }
    public void setConferenceEvent(ConferenceEvent conferenceEvent) {
        this.conferenceEvent = conferenceEvent;
    }
    public List<Speaker> getSpeaker() {
        return speaker;
    }
    public void setSpeaker(List<Speaker> speaker) {
        this.speaker = speaker;
    }

}

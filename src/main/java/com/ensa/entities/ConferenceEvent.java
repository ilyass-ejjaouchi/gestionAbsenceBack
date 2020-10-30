package com.ensa.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
public class ConferenceEvent {
    @Id
    private Long id;
    private String title;
    private Date date;
    @ManyToOne
    @JsonIgnore
    private Conference conference;
    @ManyToMany
    private List<Topic> topic;
    @OneToMany(mappedBy = "conferenceEvent")
    private List<Contribution> contribution;
    public ConferenceEvent() {

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Conference getConference() {
        return conference;
    }
    public void setConference(Conference conference) {
        this.conference = conference;
    }
    public List<Topic> getTopic() {
        return topic;
    }
    public void setTopic(List<Topic> topic) {
        this.topic = topic;
    }
    public List<Contribution> getContribution() {
        return contribution;
    }
    public void setContribution(List<Contribution> contribution) {
        this.contribution = contribution;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


}

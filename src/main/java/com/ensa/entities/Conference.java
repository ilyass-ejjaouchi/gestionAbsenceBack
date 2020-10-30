package com.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Conference {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idConference;
	private String titre;
	private Long periode;
	@OneToMany(mappedBy = "conference", fetch = FetchType.LAZY)
	private List<ConferenceEvent> conferenceEvent;
	public Conference() {
		super();
	}
	public Conference(String conferenceName) {
		super();
		this.titre = conferenceName;
	}
	public Conference(String title, int periode) {
	}
	public Long getIdConference() {
		return idConference;
	}
	public void setIdConference(Long idConference) {
		this.idConference = idConference;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String conferenceName) {
		this.titre = conferenceName;
	}

	public List<ConferenceEvent> getConferenceEvent() {
		return conferenceEvent;
	}

	public void setConferenceEvent(List<ConferenceEvent> conferenceEvent) {
		this.conferenceEvent = conferenceEvent;
	}
	public Long getPeriode() {
		return periode;
	}
	public void setPeriode(Long periode) {
		this.periode = periode;
	}
}

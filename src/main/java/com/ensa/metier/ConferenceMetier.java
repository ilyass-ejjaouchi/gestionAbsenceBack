package com.ensa.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ensa.dao.ConferenceEventJpaRepository;
import com.ensa.dao.ConferenceJpaRepository;
import com.ensa.entities.Conference;
import com.ensa.entities.ConferenceEvent;

@Service
public class ConferenceMetier {
	@Autowired
	ConferenceJpaRepository conferenceJpaRepository;
	@Autowired
	ConferenceEventJpaRepository confEventRepo;

	public List<Conference> getConferences() {
		return conferenceJpaRepository.findAll();
	}
	
	public Conference getConference(Long id) {
		Conference conference = conferenceJpaRepository.findByIdConference(id).get();
		return conference;
	}
	public void supprimerConference(Long id) {
		conferenceJpaRepository.deleteById(id);
	}
	
	public Conference modifierConference(Conference c, Long idConf) {
		c.setIdConference(idConf);
		return conferenceJpaRepository.save(c);
	}
	public void ajouterConference(Conference c) {
		conferenceJpaRepository.save(c);
	}
	
	public void ajouterConferenceEvent(ConferenceEvent confEvent, Long idConf) {
		confEvent.setConference(getConference(idConf));
		confEventRepo.save(confEvent);
	}
	public List<ConferenceEvent> getConferenceEvents(Long idConf) {
		Conference conference = conferenceJpaRepository.findByIdConference(idConf).get();
		return conference.getConferenceEvent();
	}
	/*public void supprimerEvent(Long idEvent, long idConf) {
		ConferenceEvent conferenceEvent = confEventRepo.findByTitleAndConf(idEvent, getConference(idConf));
		confEventRepo.deleteById(conferenceEvent.getId());
	}*/
}

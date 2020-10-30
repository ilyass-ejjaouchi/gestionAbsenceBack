package com.ensa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ensa.entities.Conference;
import com.ensa.entities.ConferenceEvent;
import com.ensa.metier.ConferenceMetier;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("")
public class RestController {
	@Autowired
	ConferenceMetier confMetier;
	
	@RequestMapping(value = "conferences", method = RequestMethod.POST)
	public void ajouterConference(@RequestBody Conference c) {
		  confMetier.ajouterConference(c);
	}
	
	@RequestMapping(value = "conferences", method = RequestMethod.GET)
	public List<Conference> getConferences() {
		 return confMetier.getConferences();
	}
	
	@RequestMapping(value = "conferences/{id}", method = RequestMethod.GET)
	public Conference getConference(@PathVariable Long id) {
		  return confMetier.getConference(id);
	}
	
	@RequestMapping(value = "conferences/{id}", method = RequestMethod.DELETE)
	public void supprimerConference(@PathVariable Long id) {
		  confMetier.supprimerConference(id);
	}
	
	@RequestMapping(value = "conferences/{id}", method = RequestMethod.PUT)
	public void modifierConference(@PathVariable Long id, @RequestBody Conference c) {
		  confMetier.modifierConference(c, id);
	}
	
	@RequestMapping(value = "conferences/{id}/events", method = RequestMethod.POST)
	public void ajouterConferenceEvents(@PathVariable Long id,@RequestBody ConferenceEvent confEvent) {
		   confMetier.ajouterConferenceEvent(confEvent, id);
	}
	
	@RequestMapping(value = "conferences/{id}/events", method = RequestMethod.GET)
	public List<ConferenceEvent> getConferenceEvents(@PathVariable Long id) {
		  return confMetier.getConferenceEvents(id);
	}
	
	/*@RequestMapping(value = "conferences/{idconf}/events/{idEvent}", method = RequestMethod.DELETE)
	public void supprimerEvent(@PathVariable Long idConf, @PathVariable Long idEvent) {
		   confMetier.supprimerEvent(idEvent, idConf);
	}*/
}

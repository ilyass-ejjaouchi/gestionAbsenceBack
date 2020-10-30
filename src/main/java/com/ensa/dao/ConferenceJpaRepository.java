package com.ensa.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.entities.Conference;


@Repository(value="conferenceJpaRepository")
public interface ConferenceJpaRepository extends JpaRepository<Conference, Long>{
	public Conference save(Conference conference);
	public Optional<Conference> findByIdConference(Long id);
	public List<Conference> findAll(); 
	 @Transactional
	public void deleteAll();
}

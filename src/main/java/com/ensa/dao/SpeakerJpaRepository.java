package com.ensa.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.entities.Speaker;

@Repository
public interface SpeakerJpaRepository extends JpaRepository<Speaker,String> {
	public Speaker save(Speaker speaker);
	public List<Speaker> findAll(); 
	public Optional<Speaker> findByMail(String mail);
	 @Transactional
	public void deleteByMail(String title);
	public void deleteAll();
}

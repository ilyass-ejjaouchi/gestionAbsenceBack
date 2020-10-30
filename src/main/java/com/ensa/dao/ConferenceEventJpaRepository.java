package com.ensa.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.entities.ConferenceEvent;


@Repository
public interface ConferenceEventJpaRepository extends JpaRepository<ConferenceEvent,String> {
	@Transactional
	/*@Query(value = "SELECT confEvent FROM ConferenceEvent confEvent where id =: id Conference = :conference")
	public ConferenceEvent findByTitleAndConf(@Param("conference") Long id, @Param("conference") Conference conference);*/
	public void deleteById(Long id);
}

package com.ensa.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.entities.Topic;


@Repository
public interface TopicJpaRepository extends JpaRepository<Topic,String> {
	public Topic save(Topic topic);
	public List<Topic> findAll(); 
	public Optional<Topic> findBySubject(String subject);
	 @Transactional
	public void deleteBySubject(String subject);
	public void deleteAll();
}

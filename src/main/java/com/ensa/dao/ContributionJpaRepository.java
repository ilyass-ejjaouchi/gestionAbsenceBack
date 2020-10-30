package com.ensa.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.entities.Contribution;

@Repository
public interface ContributionJpaRepository extends JpaRepository<Contribution,String > {
	public Contribution save(Contribution contribution);
	public List<Contribution> findAll(); 
	public Optional<Contribution> findByTitle(String title);
	 @Transactional
	public void deleteByTitle(String title);
	public void deleteAll();
}

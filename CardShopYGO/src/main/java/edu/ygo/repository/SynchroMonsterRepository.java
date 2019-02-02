package edu.ygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ygo.domain.SynchroMonster;

public interface SynchroMonsterRepository extends JpaRepository<SynchroMonster, Integer> {}
package edu.ygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ygo.domain.Monster;

public interface MonsterRepository extends JpaRepository<Monster, Integer> {}
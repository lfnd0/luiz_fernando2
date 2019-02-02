package edu.ygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ygo.domain.NormalMonster;

public interface NormalMonsterRepository extends JpaRepository<NormalMonster, Integer> {}
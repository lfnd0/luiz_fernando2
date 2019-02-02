package edu.ygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ygo.domain.Trap;

public interface TrapRepository extends JpaRepository<Trap, Integer> {}
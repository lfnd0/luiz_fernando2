package edu.ygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ygo.domain.Spell;

public interface SpellRepository extends JpaRepository<Spell, Integer> {}
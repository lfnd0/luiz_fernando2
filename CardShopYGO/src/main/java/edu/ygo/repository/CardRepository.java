package edu.ygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ygo.domain.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {}
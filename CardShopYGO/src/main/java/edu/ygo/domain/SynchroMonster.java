package edu.ygo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class SynchroMonster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "monster_id")
	private Monster monster;
	
	private int level;
	
	private int defense;
	
	private String summonedSynchro;
	
	public SynchroMonster() {}
	
	public SynchroMonster(int level, int defense, String summonedSynchro) {
		this.level = level;
		this.defense = defense;
		this.summonedSynchro = summonedSynchro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public String getSummonedSynchro() {
		return summonedSynchro;
	}

	public void setSummonedSynchro(String summonedSynchro) {
		this.summonedSynchro = summonedSynchro;
	}
}
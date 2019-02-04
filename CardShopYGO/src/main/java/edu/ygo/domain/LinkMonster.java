package edu.ygo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LinkMonster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "monster_id")
	private Monster monster;
	
	private int linkRank;
	
	private String summonedLink;
	
	public LinkMonster() {}
	
	public LinkMonster(int linkRank, String summonedLink) {
		this.linkRank = linkRank;
		this.summonedLink = summonedLink;
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

	public int getLinkRank() {
		return linkRank;
	}

	public void setLinkRank(int linkRank) {
		this.linkRank = linkRank;
	}

	public String getSummonedLink() {
		return summonedLink;
	}

	public void setSummonedLink(String summonedLink) {
		this.summonedLink = summonedLink;
	}
}
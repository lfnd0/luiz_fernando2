package edu.ygo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ygo.domain.Monster;
import edu.ygo.repository.MonsterRepository;

@RestController
public class MonsterResource {
	
	@Autowired
	private MonsterRepository monsterRepository;
	
	@GetMapping("/cards/monsters")
	public List<Monster> getAllEffectMonster(){
		List <Monster> monster = monsterRepository.findAll();
		return monster;
	}
}
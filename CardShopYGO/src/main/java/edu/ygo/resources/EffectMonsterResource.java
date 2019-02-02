package edu.ygo.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.ygo.domain.EffectMonster;
import edu.ygo.repository.EffectMonsterRepository;

@RestController
public class EffectMonsterResource {
	
	@Autowired
	private EffectMonsterRepository effectMonsterRepository;
	
	@GetMapping("/cards/monsters/effects")
	public List<EffectMonster> getAllEffectMonster(){
		List <EffectMonster> effectMonster = effectMonsterRepository.findAll();
		return effectMonster;
	}
	
	@DeleteMapping("/cards/monsters/effects/{id}")
	public void deleteEffectMonster(@PathVariable int id) {
		Optional<EffectMonster> effectMonsterFound = effectMonsterRepository.findById(id);
		
		if(effectMonsterFound.isPresent()) {
			effectMonsterRepository.deleteById(id);
		}
	}
	
	@PostMapping("/cards/monsters/effects")
	public ResponseEntity<?>saveEffectMonster(@RequestBody EffectMonster effectMonster) {
		EffectMonster savedEffectMonster = effectMonsterRepository.save(effectMonster);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(savedEffectMonster.getId()).toUri();;
		
		return ResponseEntity.created(uri).body("Success!");
	}
	
	@PutMapping("/cards/monsters/effects/{id}")
	public ResponseEntity<?> updateEffectMonster(@RequestBody EffectMonster effectMonster, @PathVariable int id) {
		Optional<EffectMonster> effectMonsterFound = effectMonsterRepository.findById(id);
		
		if(!effectMonsterFound.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		effectMonster.setId(id);
		effectMonsterRepository.save(effectMonster);
		
		return ResponseEntity.noContent().build();
	}
}
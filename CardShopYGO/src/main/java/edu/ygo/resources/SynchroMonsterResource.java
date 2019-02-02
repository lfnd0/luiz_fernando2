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

import edu.ygo.domain.SynchroMonster;
import edu.ygo.repository.SynchroMonsterRepository;

@RestController
public class SynchroMonsterResource {
	
	@Autowired
	private SynchroMonsterRepository synchroMonsterRepository;
	
	@GetMapping("cards/monsters/synchros")
	public List<SynchroMonster> getAllSynchroMonster() {
		List<SynchroMonster> synchroMonster = synchroMonsterRepository.findAll();
		return synchroMonster;
	}
	
	@DeleteMapping("cards/monsters/synchros/{id}")
	public void deleteSychroMonster(@PathVariable int id) {
		Optional<SynchroMonster> sychroMonsterFound = synchroMonsterRepository.findById(id);
		
		if(sychroMonsterFound.isPresent()) {
			synchroMonsterRepository.deleteById(id);
		}
	}
	
	@PostMapping("card/monsters/synchros")
	public ResponseEntity<?> saveSynchroMonster(@RequestBody SynchroMonster synchroMonster) {
		SynchroMonster savedSynchroMonster = synchroMonsterRepository.save(synchroMonster);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(savedSynchroMonster.getId()).toUri();
		
		return ResponseEntity.created(uri).body("Success!");
	}
	
	@PutMapping("cards/monsters/synchros/{id}")
	public ResponseEntity<?> updateSynchroMonster(@RequestBody SynchroMonster synchroMonster, @PathVariable int id) {
		Optional<SynchroMonster> synchroMonsterFound = synchroMonsterRepository.findById(id);
		
		if(!synchroMonsterFound.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		synchroMonster.setId(id);
		synchroMonsterRepository.save(synchroMonster);
		
		return ResponseEntity.noContent().build();
	}
}
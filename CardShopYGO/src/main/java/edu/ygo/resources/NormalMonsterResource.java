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

import edu.ygo.domain.NormalMonster;
import edu.ygo.repository.NormalMonsterRepository;

@RestController
public class NormalMonsterResource {
	
	@Autowired
	private NormalMonsterRepository normalMonsterRepository;
	
	@GetMapping("cards/monsters/normals")
	public List<NormalMonster> getAllNormalMonster() {
		List<NormalMonster> normalMonster = normalMonsterRepository.findAll();
		return normalMonster;
	}
	
	@DeleteMapping("cards/monsters/normals/{id}")
	public void deleteNormalMonster(@PathVariable int id) {
		Optional<NormalMonster> normalMonsterFound = normalMonsterRepository.findById(id);
		
		if(normalMonsterFound.isPresent()) {
			normalMonsterRepository.deleteById(id);
		}
	}
	
	@PostMapping("/cards/monsters/normals")
	public ResponseEntity<?> saveNormalMonster(@RequestBody NormalMonster normalMonster) {
		NormalMonster savedNormalMonster = normalMonsterRepository.save(normalMonster);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(savedNormalMonster.getId()).toUri();
		
		return ResponseEntity.created(uri).body("Success!");
	}
	
	@PutMapping("/cards/monsters/normals/{id}")
	public ResponseEntity<?> updateNormalMonster(@RequestBody NormalMonster normalMonster, @PathVariable int id) {
		Optional<NormalMonster> normalMonsterFound = normalMonsterRepository.findById(id);
		
		if(!normalMonsterFound.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		normalMonster.setId(id);
		normalMonsterRepository.save(normalMonster);
		
		return ResponseEntity.noContent().build();
	}
}
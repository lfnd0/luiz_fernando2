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

import edu.ygo.domain.LinkMonster;
import edu.ygo.repository.LinkMonsterRepository;

@RestController
public class LinkMonsterResource {
	
	@Autowired
	private LinkMonsterRepository linkMonsterRepository;
	
	@GetMapping("/cards/monsters/links")
	public List<LinkMonster> getAllEffectMonster(){
		List <LinkMonster> linkMonster = linkMonsterRepository.findAll();
		return linkMonster;
	}
	
	@DeleteMapping("/cards/monsters/links/{id}")
	public void deleteLinkMonster(@PathVariable int id) {
		Optional<LinkMonster> linkMonsterFound = linkMonsterRepository.findById(id);
		
		if(linkMonsterFound.isPresent()) {
			linkMonsterRepository.deleteById(id);
		}
	}
	
	@PostMapping("/cards/monsters/links")
	public ResponseEntity<?>saveLinkMonster(@RequestBody LinkMonster linkMonster) {
		LinkMonster savedLinkMonster = linkMonsterRepository.save(linkMonster);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(savedLinkMonster.getId()).toUri();
		
		return ResponseEntity.created(uri).body("Success!");
	}
	
	@PutMapping("/cards/monsters/links/{id}")
	public ResponseEntity<?> updateLinkMonster(@RequestBody LinkMonster linkMonster, @PathVariable int id) {
		Optional<LinkMonster> linkMonsterFound = linkMonsterRepository.findById(id);
		
		if(!linkMonsterFound.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		linkMonster.setId(id);
		linkMonsterRepository.save(linkMonster);
		
		return ResponseEntity.noContent().build();
	}
	
}
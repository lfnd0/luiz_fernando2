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

import edu.ygo.domain.Spell;
import edu.ygo.repository.SpellRepository;

@RestController
public class SpellResource {
	
	@Autowired
	private SpellRepository spellRepository;
	
	@GetMapping("cards/spells")
	public List<Spell> getAllSpell() {
		List<Spell> spell = spellRepository.findAll();
		return spell;
	}
	
	@DeleteMapping("cards/spells/{id}")
	public void deleteSpell(@PathVariable int id) {
		Optional<Spell> spellFound = spellRepository.findById(id);
		
		if(spellFound.isPresent()) {
			spellRepository.deleteById(id);
		}
	}
	
	@PostMapping
	public ResponseEntity<?> saveSpell(@RequestBody Spell spell) {
		Spell savedSpell = spellRepository.save(spell);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("{id}").buildAndExpand(savedSpell.getId()).toUri();
		
		return ResponseEntity.created(uri).body("Success!");
	}
	
	@PutMapping("cards/spells/{id}")
	public ResponseEntity<?> updateSpell(@RequestBody Spell spell, @PathVariable int id) {
		Optional<Spell> spellFound = spellRepository.findById(id);
		
		if(!spellFound.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		spell.setId(id);
		spellRepository.save(spell);
		
		return ResponseEntity.noContent().build();
	}	
}
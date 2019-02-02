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

import edu.ygo.domain.Trap;
import edu.ygo.repository.TrapRepository;

@RestController
public class TrapResource {
	
	@Autowired
	private TrapRepository trapRepository;
	
	@GetMapping("cards/traps")
	public List<Trap> getAllTrap() {
		List<Trap> trap = trapRepository.findAll();
		return trap;
	}
	
	@DeleteMapping("cards/traps/{id}")
	public void deleteTrap(@PathVariable int id) {
		Optional<Trap> trapFound = trapRepository.findById(id);
		
		if(trapFound.isPresent()) {
			trapRepository.deleteById(id);
		}
	}
	
	@PostMapping("cards/traps")
	public ResponseEntity<?> saveTrap(@RequestBody Trap trap) {
		Trap savedTrap = trapRepository.save(trap);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("{id}").buildAndExpand(savedTrap.getId()).toUri();
		
		return ResponseEntity.created(uri).body("Success!");
	}
	
	@PutMapping("cards/traps/{id}")
	public ResponseEntity<?> updateTrap(@RequestBody Trap trap, @PathVariable int id) {
		Optional<Trap> trapFound = trapRepository.findById(id);
		
		if(!trapFound.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		trap.setId(id);
		trapRepository.save(trap);
		
		return ResponseEntity.noContent().build();
	}
}
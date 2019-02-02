package edu.ygo.resources;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.ygo.domain.Card;
import edu.ygo.repository.CardRepository;

@RestController
public class CardResource {
	
	@Autowired
	private CardRepository cardRepository;
	
	@GetMapping("/cards")
	public List<Card> getAllCard(){
		List <Card> card = cardRepository.findAll();
		return card;
	}
	
	/*
	 * @DeleteMapping("cards/{id}") public void deleteCard(@PathVariable int id) {
	 * Optional<Card> cardFound = cardRepository.findById(id);
	 * 
	 * if(cardFound.isPresent()) { cardRepository.deleteById(id); } }
	 */
}
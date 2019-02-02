package edu.ygo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
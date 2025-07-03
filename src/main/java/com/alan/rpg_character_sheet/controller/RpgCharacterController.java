package com.alan.rpg_character_sheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alan.rpg_character_sheet.model.RpgCharacter;
import com.alan.rpg_character_sheet.service.RpgCharacterService;


@RestController
@RequestMapping("/api/characters")
public class RpgCharacterController {

	@Autowired
	private RpgCharacterService characterService;

	@GetMapping
	public List<RpgCharacter> getAllCharacters() {
		return characterService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<RpgCharacter> getCharacterById(@PathVariable Long id) {
		return characterService.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public RpgCharacter createCharacter(@RequestBody RpgCharacter character) {
		return characterService.create(character);
	}

	@PutMapping("/{id}")
	public ResponseEntity<RpgCharacter> updateCharacter(@PathVariable Long id, @RequestBody RpgCharacter updated) {
		return characterService.update(id, updated)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCharacter(@PathVariable Long id) {
		return characterService.delete(id)
	            ? ResponseEntity.noContent().build()
	            : ResponseEntity.notFound().build();
	}
}

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
import com.alan.rpg_character_sheet.repository.RpgCharacterRepository;

@RestController
@RequestMapping("/api/characters")
public class RpgCharacterController {

	@Autowired
	private RpgCharacterRepository characterRepository;

	@GetMapping
	public List<RpgCharacter> getAllCharacters() {
		return characterRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<RpgCharacter> getCharacterById(@PathVariable Long id) {
		return characterRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public RpgCharacter createCharacter(@RequestBody RpgCharacter character) {
		return characterRepository.save(character);
	}

	@PutMapping("/{id}")
	public ResponseEntity<RpgCharacter> updateCharacter(@PathVariable Long id, @RequestBody RpgCharacter updated) {
		return characterRepository.findById(id).map(existing -> {
			existing.setName(updated.getName());
			existing.setClassType(updated.getClassType());
			existing.setLevel(updated.getLevel());
			existing.setRace(updated.getRace());
			existing.setAlignment(updated.getAlignment());
			existing.setXp(updated.getXp());
			existing.setBackground(updated.getBackground());
			return ResponseEntity.ok(characterRepository.save(existing));
		}).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCharacter(@PathVariable Long id) {
		if (characterRepository.existsById(id)) {
			characterRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}

package com.alan.rpg_character_sheet.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.alan.rpg_character_sheet.model.RpgCharacter;
import com.alan.rpg_character_sheet.repository.RpgCharacterRepository;
import com.alan.rpg_character_sheet.service.RpgCharacterService;

public class RpgCharacterServiceImpl implements RpgCharacterService {
	@Autowired
	private RpgCharacterRepository repository;

	@Override
	public List<RpgCharacter> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<RpgCharacter> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public RpgCharacter create(RpgCharacter character) {
		return repository.save(character);
	}

	@Override
	public Optional<RpgCharacter> update(Long id, RpgCharacter updated) {
		return repository.findById(id).map(existing -> {
			existing.setName(updated.getName());
			existing.setClassType(updated.getClassType());
			existing.setLevel(updated.getLevel());
			existing.setRace(updated.getRace());
			existing.setAlignment(updated.getAlignment());
			existing.setXp(updated.getXp());
			existing.setBackground(updated.getBackground());
			return repository.save(existing);
		});
	}

	@Override
	public boolean delete(Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}
}

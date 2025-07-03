package com.alan.rpg_character_sheet.service;

import java.util.List;
import java.util.Optional;

import com.alan.rpg_character_sheet.model.RpgCharacter;

public interface RpgCharacterService {
	
	List<RpgCharacter> findAll();
	Optional<RpgCharacter> findById(Long id);
	RpgCharacter create(RpgCharacter character);
	Optional<RpgCharacter> update(Long id, RpgCharacter character);
	boolean delete (Long id);
}

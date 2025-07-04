package com.alan.rpg_character_sheet.service;

import java.util.List;
import java.util.Optional;

import com.alan.rpg_character_sheet.model.Race;

public interface RaceService {

	List<Race> findAll();
	Optional<Race> findById(Long id);
}

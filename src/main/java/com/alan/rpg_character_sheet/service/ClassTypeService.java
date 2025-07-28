package com.alan.rpg_character_sheet.service;

import java.util.List;
import java.util.Optional;

import com.alan.rpg_character_sheet.model.ClassType;

public interface ClassTypeService {

	List<ClassType> findAll();
	Optional<ClassType> findById(Long id);
}

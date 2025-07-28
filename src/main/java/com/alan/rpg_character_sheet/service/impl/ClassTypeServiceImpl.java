package com.alan.rpg_character_sheet.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alan.rpg_character_sheet.model.ClassType;
import com.alan.rpg_character_sheet.repository.ClassTypeRepository;
import com.alan.rpg_character_sheet.service.ClassTypeService;

@Service
public class ClassTypeServiceImpl implements ClassTypeService{

	@Autowired
	private ClassTypeRepository classTypeRepository;
	
	@Override
	public List<ClassType> findAll() {
		return classTypeRepository.findAll();
	}

	@Override
	public Optional<ClassType> findById(Long id) {
		return classTypeRepository.findById(id);
	}

}

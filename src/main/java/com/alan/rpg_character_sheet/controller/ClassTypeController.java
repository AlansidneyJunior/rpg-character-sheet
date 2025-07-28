package com.alan.rpg_character_sheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alan.rpg_character_sheet.model.ClassType;
import com.alan.rpg_character_sheet.service.ClassTypeService;

@RestController
@RequestMapping("/api/classes")
public class ClassTypeController {

	@Autowired
	private ClassTypeService classTypeService;
	
	@GetMapping
	public List<ClassType> findAll(){
		return classTypeService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClassType> findById(@PathVariable Long id) {
		return classTypeService.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
}

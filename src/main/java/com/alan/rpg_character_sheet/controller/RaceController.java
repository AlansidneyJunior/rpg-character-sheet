package com.alan.rpg_character_sheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alan.rpg_character_sheet.model.Race;
import com.alan.rpg_character_sheet.service.RaceService;

@RestController
@RequestMapping("/api/races")
public class RaceController {

	@Autowired
	RaceService raceService;

	@GetMapping
	public List<Race> findAll() {
		return raceService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Race> findById(@PathVariable Long id) {
		return raceService.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
}

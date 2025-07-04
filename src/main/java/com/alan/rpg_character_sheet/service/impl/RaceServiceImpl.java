package com.alan.rpg_character_sheet.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alan.rpg_character_sheet.model.Race;
import com.alan.rpg_character_sheet.repository.RaceRepository;
import com.alan.rpg_character_sheet.service.RaceService;

@Service
public class RaceServiceImpl implements RaceService {

	@Autowired
	private RaceRepository raceRepository;

	@Override
	public List<Race> findAll() {
		return raceRepository.findAll();
	}

	@Override
	public Optional<Race> findById(Long id) {
		return raceRepository.findById(id);
	}

}

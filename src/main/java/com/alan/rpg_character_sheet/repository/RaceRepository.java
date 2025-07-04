package com.alan.rpg_character_sheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alan.rpg_character_sheet.model.Race;

public interface RaceRepository extends JpaRepository<Race, Long>{

}

package com.alan.rpg_character_sheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alan.rpg_character_sheet.model.RpgCharacter;

public interface RpgCharacterRepository extends JpaRepository<RpgCharacter, Long>{
}

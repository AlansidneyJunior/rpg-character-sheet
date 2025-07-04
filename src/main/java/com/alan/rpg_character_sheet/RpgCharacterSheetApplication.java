package com.alan.rpg_character_sheet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alan.rpg_character_sheet.model.RpgCharacter;
import com.alan.rpg_character_sheet.repository.RpgCharacterRepository;

@SpringBootApplication
public class RpgCharacterSheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgCharacterSheetApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner runner(RpgCharacterRepository characterRepository) {
//	    return args -> {
//	        RpgCharacter character = new RpgCharacter(
//	            "Thorin", "Warrior", 3, "Dwarf", "Lawful Good", 1200, "Soldier"
//	        );
//
//	        characterRepository.save(character);
//	        System.out.println("Character saved: " + character);
//	    };
//	}
}

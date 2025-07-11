package com.alan.rpg_character_sheet.model;

import com.alan.rpg_character_sheet.model.enums.ProficiencyType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proficiency")
public class Proficiency {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private ProficiencyType type;
	
	@Column(nullable = false, unique = true)
	private String name;

	public Proficiency() {
		
	}
	
	public Proficiency(ProficiencyType type, String name) {
		this.type = type;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProficiencyType getType() {
		return type;
	}

	public void setType(ProficiencyType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Proficiency [id=" + id + ", type=" + type + ", name=" + name + "]";
	}
	
}

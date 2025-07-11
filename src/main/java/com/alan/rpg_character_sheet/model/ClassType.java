package com.alan.rpg_character_sheet.model;

import java.util.List;

import com.alan.rpg_character_sheet.model.converter.AbilityListConverter;
import com.alan.rpg_character_sheet.model.enums.Ability;
import com.alan.rpg_character_sheet.model.enums.Die;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "class_type")
public class ClassType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String description;
	
	@Enumerated(EnumType.STRING)
	private Die hitDie;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "primary_ability")
	private Ability primaryAbility;
	
	@Convert(converter = AbilityListConverter.class)
	@Column(name = "saving_throws", columnDefinition = "jsonb")
	private List<Ability> savingThrows;

	public ClassType() {
		
	}
	
	public ClassType(String name, String description, Die hitDie, Ability primaryAbility, List<Ability> savingThrows) {
		super();
		this.name = name;
		this.description = description;
		this.hitDie = hitDie;
		this.primaryAbility = primaryAbility;
		this.savingThrows = savingThrows;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Die getHitDie() {
		return hitDie;
	}

	public void setHitDie(Die hitDie) {
		this.hitDie = hitDie;
	}

	public Ability getPrimaryAbility() {
		return primaryAbility;
	}

	public void setPrimaryAbility(Ability primaryAbility) {
		this.primaryAbility = primaryAbility;
	}

	public List<Ability> getSavingThrows() {
		return savingThrows;
	}

	public void setSavingThrows(List<Ability> savingThrows) {
		this.savingThrows = savingThrows;
	}

	@Override
	public String toString() {
		return "ClassType [id=" + id + ", name=" + name + ", description=" + description + ", hitDie=" + hitDie
				+ ", primaryAbility=" + primaryAbility + ", savingThrows=" + savingThrows + "]";
	}
}

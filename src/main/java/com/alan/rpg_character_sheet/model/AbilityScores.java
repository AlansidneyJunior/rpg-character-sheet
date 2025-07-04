package com.alan.rpg_character_sheet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "ability_scores")
public class AbilityScores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Min(0)
	@Max(30)
	private Integer strength;
	
	@Min(0)
	@Max(30)
	private Integer dexterity;
	
	@Min(0)
	@Max(30)
	private Integer constitution;
	
	@Min(0)
	@Max(30)
	private Integer intelligence;
	
	@Min(0)
	@Max(30)
	private Integer wisdom;
	
	@Min(0)
	@Max(30)
	private Integer charisma;
	
	public AbilityScores() {

	}
	
	public AbilityScores(Integer strength, Integer dexterity, Integer constitution, Integer intelligence,
			Integer wisdom, Integer charisma) {
		super();
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getDexterity() {
		return dexterity;
	}
	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}
	public Integer getConstitution() {
		return constitution;
	}
	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	public Integer getWisdom() {
		return wisdom;
	}
	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
	}
	public Integer getCharisma() {
		return charisma;
	}
	public void setCharisma(Integer charisma) {
		this.charisma = charisma;
	}

	@Override
	public String toString() {
		return "AbilityScores [id=" + id + ", strength=" + strength + ", dexterity=" + dexterity + ", constitution="
				+ constitution + ", intelligence=" + intelligence + ", wisdom=" + wisdom + ", charisma=" + charisma
				+ "]";
	}
	
}

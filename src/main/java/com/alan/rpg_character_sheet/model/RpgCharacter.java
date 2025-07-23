package com.alan.rpg_character_sheet.model;

import com.alan.rpg_character_sheet.model.enums.Alignment;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rpg_character")
public class RpgCharacter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 100)
	private String name;

	@ManyToOne
	@JoinColumn(name = "class_id", nullable = false)
	private ClassType classType;

	@Column(nullable = false)
	private Integer level;

	@ManyToOne
	@JoinColumn(name = "race_id", nullable = false)
	private Race race;

	@Enumerated(EnumType.STRING)
	private Alignment alignment;

	@Column(nullable = false)
	private Integer xp;

	@Column(nullable = false, length = 100)
	private String background;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AbilityScores abilityScores;
	
	public RpgCharacter() {

	}

	public RpgCharacter(String name, ClassType classType, Integer level, Race race, Alignment alignment, Integer xp,
			String background, AbilityScores abilityScores) {
		this.name = name;
		this.classType = classType;
		this.level = level;
		this.race = race;
		this.alignment = alignment;
		this.xp = xp;
		this.background = background;
		this.abilityScores = abilityScores;
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

	public ClassType getClassType() {
		return classType;
	}

	public void setClassType(ClassType classType) {
		this.classType = classType;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Alignment getAlignment() {
		return alignment;
	}

	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public AbilityScores getAbilityScores() {
		return abilityScores;
	}

	public void setAbilityScores(AbilityScores abilityScores) {
		this.abilityScores = abilityScores;
	}

	@Override
	public String toString() {
		return "RpgCharacter [id=" + id + ", name=" + name + ", classType=" + classType.toString() + ", level=" + level + ", race="
				+ race.toString() + ", alignment=" + alignment.toString() + ", xp=" + xp + ", background=" + background + ", abilityScores="
				+ abilityScores.toString() + "]";
	}
	
}

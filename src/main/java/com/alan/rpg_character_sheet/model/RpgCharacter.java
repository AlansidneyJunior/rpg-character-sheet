package com.alan.rpg_character_sheet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rpg_character")
public class RpgCharacter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 100)
	private String name;

	@Column(nullable = false, length = 100)
	private String classType;

	@Column(nullable = false)
	private Integer level;

	@Column(nullable = false, length = 100)
	private String race;

	@Column(nullable = false, length = 100)
	private String alignment;

	@Column(nullable = false)
	private Integer xp;

	@Column(nullable = false, length = 100)
	private String background;

	public RpgCharacter() {

	}

	public Long getId() {
		return id;
	}

	public RpgCharacter(String name, String classType, Integer level, String race, String alignment, Integer xp,
			String background) {
		super();
		this.name = name;
		this.classType = classType;
		this.level = level;
		this.race = race;
		this.alignment = alignment;
		this.xp = xp;
		this.background = background;
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

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
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

	@Override
	public String toString() {
		return "Character [id=" + id + ", name=" + name + "]";
	}

}

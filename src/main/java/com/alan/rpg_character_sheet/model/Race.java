package com.alan.rpg_character_sheet.model;

import java.util.List;

import com.alan.rpg_character_sheet.model.enums.Size;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "race")
public class Race {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 50)
	private String name;

	@Column(nullable = false, length = 512)
	private String description;

	private Integer speed;
	private Boolean darkVision;

	@ElementCollection
	@CollectionTable(name = "race_languages", joinColumns = @JoinColumn(name = "race_id"))
	@Column(name = "language")
	private List<String> languages;

	@Enumerated(EnumType.STRING)
	private Size size;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bonus_ability_scores_id")
	private AbilityScores bonusAbilityScores;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable( name = "race_proficiencies",
				joinColumns = @JoinColumn(name = "race_id"),
				inverseJoinColumns = @JoinColumn(name = "proficiency_id"))
	@OrderBy("name ASC")
	private List<Proficiency> proficiencies;

	public Race() {
	}

	public Race(String name, String description, Integer speed, Boolean darkVision, List<String> languages, Size size,
			AbilityScores bonusAbilityScores, List<Proficiency> proficiencies) {
		super();
		this.name = name;
		this.description = description;
		this.speed = speed;
		this.darkVision = darkVision;
		this.languages = languages;
		this.size = size;
		this.bonusAbilityScores = bonusAbilityScores;
		this.proficiencies = proficiencies;
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

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Boolean getDarkVision() {
		return darkVision;
	}

	public void setDarkVision(Boolean darkVision) {
		this.darkVision = darkVision;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public AbilityScores getBonusAbilityScores() {
		return bonusAbilityScores;
	}

	public void setBonusAbilityScores(AbilityScores bonusAbilityScores) {
		this.bonusAbilityScores = bonusAbilityScores;
	}

	public List<Proficiency> getProficiencies() {
		return proficiencies;
	}

	public void setProficiencies(List<Proficiency> proficiencies) {
		this.proficiencies = proficiencies;
	}

	@Override
	public String toString() {
		return "Race [id=" + id + ", name=" + name + ", description=" + description + ", speed=" + speed
				+ ", darkVision=" + darkVision + ", languages=" + languages + ", size=" + size + "]";
	}

}

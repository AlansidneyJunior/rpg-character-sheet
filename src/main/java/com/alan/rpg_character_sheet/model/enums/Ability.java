package com.alan.rpg_character_sheet.model.enums;

public enum Ability {
	STR("strength"),
	DEX("dexterity"),
	CON("constitution"),
	INT("intelligence"),
	WIS("wisdom"),
	CHA("charisma");
	
	private final String name;
	
	Ability(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static Ability fromAlias(String name) {
		for (Ability ability : values()) {
			if (ability.name.equalsIgnoreCase(name)) {
				return ability;
			}
		}
		throw new IllegalArgumentException("Invalid ability: " + name);
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
}

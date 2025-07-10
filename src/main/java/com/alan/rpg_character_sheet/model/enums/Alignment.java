package com.alan.rpg_character_sheet.model.enums;

public enum Alignment {
	LAWFUL_GOOD("LG"),
	LAWFUL_NEUTRAL("LN"),
	LAWFUL_EVIL("LE"),
	NEUTRAL_GOOD("NG"),
	TRUE_NEUTRAL("TN"),
	NEUTRAL_EVIL("NE"),
	CHAOTIC_GOOD("CG"),
	CHAOTIC_NEUTRAL("CN"),
	CHAOTIC_EVIL("CE");
	
	private final String alias;
	
	Alignment(String alias) {
		this.alias = alias;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public static Alignment fromAlias(String alias) {
		for (Alignment alignment : values()) {
			if (alignment.alias.equalsIgnoreCase(alias)) {
				return alignment;
			}
		}
		throw new IllegalArgumentException("Invalid Alias: " + alias);
	}
	
	@Override
	public String toString() {
		return name().replace("_", " ").toLowerCase();
	}
}

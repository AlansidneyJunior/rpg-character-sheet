package com.alan.rpg_character_sheet.model.enums;

public enum Size {
	SMALL(150),
	MEDIUM(180),
	LARGE(210);
	
	private final int averageHeightCm;
	
	Size(int averageHeightCm) {
		this.averageHeightCm = averageHeightCm;
	}

	public int getAverageHeightCm() {
		return averageHeightCm;
	}
}

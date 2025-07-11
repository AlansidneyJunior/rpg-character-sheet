package com.alan.rpg_character_sheet.model.enums;

public enum Die {
    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20),
    D100(100);

    private final int sides;

    Die(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    @Override
    public String toString() {
        return "d" + sides;
    }
}

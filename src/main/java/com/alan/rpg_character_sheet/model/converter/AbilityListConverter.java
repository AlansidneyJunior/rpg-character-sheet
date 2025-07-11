package com.alan.rpg_character_sheet.model.converter;

import java.util.ArrayList;
import java.util.List;

import com.alan.rpg_character_sheet.model.enums.Ability;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class AbilityListConverter implements AttributeConverter<List<Ability>, String> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<Ability> attribute) {
        try {
            return objectMapper.writeValueAsString(attribute);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert ability list to JSON", e);
        }
    }

    @Override
    public List<Ability> convertToEntityAttribute(String dbData) {
        try {
            if (dbData == null || dbData.isBlank()) return new ArrayList<>();
            return objectMapper.readValue(dbData, new TypeReference<List<Ability>>() {});
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert JSON to ability list", e);
        }
    }
}

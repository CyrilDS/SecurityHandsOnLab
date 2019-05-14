package fr.formation.hol.spring.sec.entities;

import javax.persistence.AttributeConverter;


public class BooleanConverter implements AttributeConverter<Boolean, String> {

    public BooleanConverter() {
    }

    @Override
    public String convertToDatabaseColumn(Boolean value) {
	return Boolean.TRUE.equals(value) ? "T" : "F";
    }

    @Override
    public Boolean convertToEntityAttribute(String value) {
	return "T".equals(value);
    }
}

package com.gtr.bdd.reflection.reflection.models;

public record ParameterModel(Class<?> type, Object value, Object... values) {
    public static ParameterModel with(Class<?> type, Object value) {
        return new ParameterModel(type, value);
    }
}

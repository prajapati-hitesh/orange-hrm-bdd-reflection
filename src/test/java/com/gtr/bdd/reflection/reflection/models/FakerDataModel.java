package com.gtr.bdd.reflection.reflection.models;

public record FakerDataModel(Class<?> type, String methodName, ParameterModel... parameterModels) {
    public static FakerDataModel with(Class<?> type, String methodName, ParameterModel... parameterModels) {
        return new FakerDataModel(type, methodName, parameterModels);
    }
}

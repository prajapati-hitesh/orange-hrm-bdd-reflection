package com.gtr.bdd.reflection.reflection.models;

import com.gtr.bdd.reflection.reflection.enums.FieldType;
import com.gtr.bdd.reflection.reflection.enums.FormComponents;
import com.gtr.bdd.reflection.reflection.enums.FormLabels;

import java.util.Objects;
import java.util.Optional;

public record FormModel(Optional<?> label, Optional<FieldType> fieldType, Optional<Object> value) {
    public static FormModel with(FormLabels formLabel, FieldType type, Object value) {
        Objects.requireNonNull(formLabel);
        Objects.requireNonNull(type);
        Objects.requireNonNull(value);
        return new FormModel(Optional.of(formLabel), Optional.of(type), Optional.of(value));
    }

    public static FormModel with(FormComponents components, FieldType type, Object value) {
        Objects.requireNonNull(components);
        Objects.requireNonNull(type);
        Objects.requireNonNull(value);
        return new FormModel(Optional.of(components), Optional.of(type), Optional.of(value));
    }

}

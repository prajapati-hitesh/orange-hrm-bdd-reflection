package com.gtr.bdd.reflection.reflection.models;

import java.util.Arrays;
import java.util.List;

public record RecordModel(List<?> models) {
    public static RecordModel with(FormModel... formModels) {
        return new RecordModel(Arrays.stream(formModels).toList());
    }
}

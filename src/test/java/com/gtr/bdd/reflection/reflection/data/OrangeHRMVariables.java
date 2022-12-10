package com.gtr.bdd.reflection.reflection.data;

import com.gtr.bdd.reflection.reflection.models.RecordModel;

public class OrangeHRMVariables {
    private static final ThreadLocal<RecordModel> recordModel = new ThreadLocal<>();

    public static RecordModel getRecordModel() {
        return recordModel.get();
    }

    public static void setRecordModel(RecordModel model) {
        recordModel.set(model);
    }
}

package model;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeExercise implements Serializable {
    private String typeExersise;

    public TypeExercise(String typeExersise) {
        this.typeExersise = typeExersise;
    }

    public String getTypeExersise() {
        return typeExersise;
    }

    public void setTypeExersise(String typeExersise) {
        this.typeExersise = typeExersise;
    }
}

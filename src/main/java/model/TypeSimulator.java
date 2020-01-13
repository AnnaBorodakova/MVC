package model;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeSimulator implements Serializable {

    private String typeSimulator;

    public TypeSimulator(String typeSimulator) {
        this.typeSimulator = typeSimulator;
    }

    public String getTypeSimulator() {
        return typeSimulator;
    }

    public void setTypeSimulator(String typeSimulator) {
        this.typeSimulator = typeSimulator;
    }
}

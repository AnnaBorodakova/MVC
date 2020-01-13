package model.services;

import model.TypeSimulator;

import java.util.ArrayList;
import java.util.List;

public class STypeSimulator {
    private List<TypeSimulator> typeSimulators;

    public List<TypeSimulator> getTypeSimulators() {
        return typeSimulators;
    }

    public void setTypeSimulators(List<TypeSimulator> typeSimulators) {
        this.typeSimulators = typeSimulators;
    }

    public STypeSimulator() {
        typeSimulators = new ArrayList<>();
    }

    public boolean createTypeSimulator(String typeSimulator) {
        TypeSimulator tSimulator = findTypeSimulator(typeSimulator);
        if (tSimulator == null) {
            tSimulator = new TypeSimulator(typeSimulator);
            typeSimulators.add(tSimulator);
        }
        return true;
    }

    public TypeSimulator findTypeSimulator(String TypeSimulator){
        TypeSimulator typeSimulator1 = null;
        for (TypeSimulator typeSimulator2 : typeSimulators) {
            if (typeSimulator2.getTypeSimulator().equals(TypeSimulator)) {
                typeSimulator1 = typeSimulator2;
                break;
            }
        }
        return typeSimulator1;

    }

    public boolean updateTypeSimulator(String name, String name1){
        TypeSimulator ts = findTypeSimulator(name);
        TypeSimulator ts2 = findTypeSimulator(name1);
        if(ts != null && ts2 == null){
            ts.setTypeSimulator(name1);
        }
        return true;
    }

    public boolean deleteTypeSimulator(String nameTS){
        TypeSimulator typeS = findTypeSimulator(nameTS);
        if(typeS != null){
            typeSimulators.remove(nameTS);
        }
        return true;
    }
}

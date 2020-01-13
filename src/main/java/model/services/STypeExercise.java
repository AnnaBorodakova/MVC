package model.services;

import model.TypeExercise;

import java.util.ArrayList;
import java.util.List;

public class STypeExercise {
    private List<TypeExercise> typeExercises;

    public STypeExercise() {
        typeExercises = new ArrayList<>();
    }

    public List<TypeExercise> getTypeExercises() {
        return typeExercises;
    }

    public void setTypeExercises(List<TypeExercise> typeExercises) {
        this.typeExercises = typeExercises;
    }

    public boolean createTypeExercise(String typeExercise){
        TypeExercise tExercise = findTypeExercise(typeExercise);
        if(tExercise == null){
            tExercise = new TypeExercise(typeExercise);
            typeExercises.add(tExercise);
        }
        return true;
    }

    public boolean deleteTypeExercise(String nameTypeExercise){
        TypeExercise typeExercise = findTypeExercise(nameTypeExercise);
        if(typeExercise != null){
            typeExercises.remove(typeExercise);
        }
        return true;
    }

    public boolean updateTypeExercise(String name, String name1){
        TypeExercise te1 = findTypeExercise(name);
        TypeExercise te2 = findTypeExercise(name1);
        if(te1 != null && te2 == null){
            te1.setTypeExersise(name1);
        }
        return true;
    }
    public TypeExercise findTypeExercise(String typeExersise)
    {
        TypeExercise typeExercise1 = null;
        for(TypeExercise typeExercise2 : typeExercises){
            if(typeExercise2.getTypeExersise().equals(typeExersise)){
                typeExercise1 = typeExercise2;
                break;
            }
        }
        return typeExercise1;
    }
}

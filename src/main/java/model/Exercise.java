package model;

import java.io.Serializable;

public class Exercise implements Serializable {
    private int idExercise;
    private TypeExercise typeExercise;
    private Training training;
    private Simulator simulator;
    private String time;
    private int countApproach;

    public Exercise(int idExercise, TypeExercise typeExercise, Training training, Simulator simulator, String time, int countApproach) {
        this.idExercise = idExercise;
        this.typeExercise = typeExercise;
        this.training = training;
        this.simulator = simulator;
        this.time = time;
        this.countApproach = countApproach;
    }

    public Exercise(int idExercise, TypeExercise typeExercise, Training training, String time, int countApproach) {
        this.idExercise = idExercise;
        this.typeExercise = typeExercise;
        this.training = training;
        this.time = time;
        this.countApproach = countApproach;
    }

    public int getIdExercise() {
        return idExercise;
    }

    public void setIdExercise(int idExercise) {
        this.idExercise = idExercise;
    }

    public TypeExercise getTypeExercise() {
        return typeExercise;
    }

    public void setTypeExercise(TypeExercise typeExercise) {
        this.typeExercise = typeExercise;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public Simulator getSimulator() {
        return simulator;
    }

    public void setSimulator(Simulator simulator) {
        this.simulator = simulator;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCountApproach() {
        return countApproach;
    }

    public void setCountApproach(int countApproach) {
        this.countApproach = countApproach;
    }

}

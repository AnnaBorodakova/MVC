package model.services;

import model.Exercise;
import model.Simulator;
import model.Training;
import model.TypeExercise;

import java.util.ArrayList;
import java.util.List;

public class ExerciseS {
    private List<Exercise> exercises;

    public ExerciseS() {
        this.exercises = new ArrayList<>();
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public boolean createExercise(int idExercise, TypeExercise typeExercise, Training training, Simulator simulator, String time, int countApproach){
        Exercise exercise = findExercise(idExercise);
        if(exercise == null)
        {
            exercise = new Exercise(idExercise,typeExercise,training, simulator, time, countApproach);
            exercises.add(exercise);
        }
        return true;
    }

    public Exercise findExercise(int idExercise) {
        Exercise exercise = null;
        for (Exercise exercise1 : exercises) {
            if (exercise1.getIdExercise() == idExercise) {
                exercise = exercise1;
                break;
            }
        }
        return exercise;
    }

    public boolean updateExercise(int idExercise, TypeExercise typeExercise, Training training, Simulator simulator, String time, int countApproach){
        Exercise exercise = findExercise(idExercise);
        if(exercise != null){
            exercise.setTypeExercise(typeExercise);
            exercise.setTraining(training);
            exercise.setSimulator(simulator);
            exercise.setTime(time);
            exercise.setCountApproach(countApproach);
        }
        return true;
    }

    public boolean deleteExetcise(int idExercise){
        Exercise exercise = findExercise(idExercise);
        if(exercise != null){
            exercises.remove(exercise);
        }
        return true;
    }
}

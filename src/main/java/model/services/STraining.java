package model.services;

import model.Training;

import java.util.ArrayList;
import java.util.List;

public class STraining {
    private List<Training> trainings;

    public STraining() {
        this.trainings = new ArrayList<>();
    }

    public List<Training> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<Training> trainings) {
        this.trainings = trainings;
    }

    public boolean createTraining(int idTraining, String time, String date){
        Training training = findTraining(idTraining);
        if(training == null){
            training = new Training(idTraining, time,date);
            trainings.add(training);
        }
        return true;
    }

    public boolean deleteTraining(int idTraining){
        Training training = findTraining(idTraining);
        if(training != null){
            trainings.remove(training);
        }
        return true;
    }

    public boolean updateTraining(int idTraining, String time, String date){
        Training training = findTraining(idTraining);
        if(training != null){
            training.setTime(time);
            training.setDate(date);
        }
        return true;
    }

    public Training findTraining(int idTraining)
    {
        Training training = null;
        for (Training training1 : trainings){
            if(training1.getIdTraining() == idTraining){
                training = training1;
            }
        }
        return training;
    }
}

package model;

import java.io.Serializable;


public class Training implements Serializable {
    private int idTraining;
    private String timeBegining;
    private String date;

    public Training(int idTraining, String time, String date) {
        this.idTraining = idTraining;
        this.timeBegining = time;
        this.date = date;
    }

    public Training(int idTraining, String date) {
        this.idTraining = idTraining;
        this.date = date;
    }

    public int getIdTraining() {
        return idTraining;
    }

    public void setIdTraining(int idTraining) {
        this.idTraining = idTraining;
    }

    public String getTime() {
        return timeBegining;
    }

    public void setTime(String time) {
        this.timeBegining = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

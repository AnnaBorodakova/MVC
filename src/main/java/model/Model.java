package model;

import interfaces.IModel;
import model.services.*;

import java.util.List;

public class Model implements IModel {
    private SFirm sFirm;
    private STypeExercise sTypeExercise;
    private STypeSimulator sTypeSimulator;
    private STraining sTraining;
    private SSimulator sSimulator;
    private ExerciseS exerciseS;

    public void setServices(SFirm sFirm, STypeExercise sTypeExercise, STypeSimulator sTypeSimulator, STraining sTraining, SSimulator sSimulator, ExerciseS exerciseS){
        this.sFirm = sFirm;
        this.sTypeExercise = sTypeExercise;
        this.sTypeSimulator = sTypeSimulator;
        this.sTraining = sTraining;
        this.sSimulator = sSimulator;
        this.exerciseS = exerciseS;
    }
    //Методы для работы с упражнениями
    public List<Exercise> getExercises() {
        return exerciseS.getExercises();
    }

    public void setExercises(List<Exercise> exercises) {
        exerciseS.setExercises(exercises);
    }

    public boolean createExercise(int idExercise, TypeExercise typeExercise, Training training, Simulator simulator, String time, int countApproach) {
        return exerciseS.createExercise(idExercise,typeExercise,training,simulator,time,countApproach);
    }

    public Exercise findExercise(int idExercise) {
        return exerciseS.findExercise(idExercise);
    }

    public boolean deleteExercise(int idExercise){
        return exerciseS.deleteExetcise(idExercise);
    }

    public boolean updateExercise(int idExercise, TypeExercise typeExercise, Training training, Simulator simulator, String time, int countApproach){
        return exerciseS.updateExercise(idExercise,typeExercise,training,simulator,time,countApproach);
    }
    //Методы работы с тренажёрами
    public void setSimulators(List<Simulator> simulators) {
        sSimulator.setSimulators(simulators);
    }

    public List<Simulator> getSimulators() {
        return sSimulator.getSimulators();
    }

    public boolean createSimulator(int idSimulator, String model, Firm firm, TypeSimulator typeSimulator) {
        return sSimulator.createSimulator(idSimulator, model, firm, typeSimulator);
    }

    public boolean deleteSimulator(int idSimulator) {
        return sSimulator.deleteSimulator(idSimulator);
    }

    public Simulator findSimulator(int idSimulator) {
        return sSimulator.findSimulator(idSimulator);
    }

    public boolean updateSimulator(int idSimulator, String model, Firm firm, TypeSimulator typeSimulator){
        return sSimulator.updateSimulator(idSimulator,model,firm,typeSimulator);
    }


    //Методы работы с тренировками
    public void setTrainings(List<Training> trainings) {
        sTraining.setTrainings(trainings);
    }

    public List<Training> getTrainings() {
        return sTraining.getTrainings();
    }

    public boolean createTraining(int idTraining, String time, String date) {
        return sTraining.createTraining(idTraining, time, date);
    }

    public boolean deleteTraining(int idTraining) {
        return sTraining.deleteTraining(idTraining);
    }

    public Training findTraining(int idTraining){
        return sTraining.findTraining(idTraining);
    }

    public boolean updateTraining(int idTraining, String time, String date){
        return sTraining.updateTraining(idTraining,time,date);
    }
    //Методы работы с фирмами
    public List<Firm> getFirms() {
        return sFirm.getFirms();
    }

    public void setFirms(List<Firm> firms) {
        sFirm.setFirms(firms);
    }

    public boolean createFirm(String nameFirm) {
        return sFirm.createFirm(nameFirm);
    }

    public boolean deleteFirm(String nameFirm) {
        return sFirm.deleteFirm(nameFirm);
    }

    public Firm findFirm(String name) {
        return sFirm.findFirm(name);
    }

    public boolean updateFirm(String name, String name1){
        return sFirm.updateFirm(name,name1);
    }

    //Методы работы с типами упражнений
    public List<TypeExercise> getTypeExercises() {
        return sTypeExercise.getTypeExercises();
    }

    public void setTypeExercises(List<TypeExercise> typeExercises) {
        sTypeExercise.setTypeExercises(typeExercises);
    }

    public boolean createTypeExercise(String nameTE) {
        return sTypeExercise.createTypeExercise(nameTE);
    }

    public boolean deleteTypeExercise(String nameTE) {
        return sTypeExercise.deleteTypeExercise(nameTE);
    }

    public TypeExercise findTypeExercise(String nameTE) {
        return sTypeExercise.findTypeExercise(nameTE);
    }

    public boolean updateTypeExercise(String name, String name1){
        return sTypeExercise.updateTypeExercise(name,name1);
    }

    //Методы работы с типами тренажёров
    public List<TypeSimulator> getTypeSimulator() {
        return sTypeSimulator.getTypeSimulators();
    }

    public void setTypeSimulators(List<TypeSimulator> typeSimulator) {
        sTypeSimulator.setTypeSimulators(typeSimulator);
    }

    public boolean createTypeSimulator(String nameTS) {
        return sTypeSimulator.createTypeSimulator(nameTS);
    }

    public boolean deleteTypeSimulator(String nameTS) {
        return sTypeSimulator.deleteTypeSimulator(nameTS);
    }

    public TypeSimulator findTypeSimulator(String TypeSimulator) {
        return sTypeSimulator.findTypeSimulator(TypeSimulator);
    }

    public boolean updateTypeSimulator(String name, String name1){
        return sTypeSimulator.updateTypeSimulator(name,name1);
    }
}

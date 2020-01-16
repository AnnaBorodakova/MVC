package interfaces;

import model.*;
import model.services.*;
import java.util.List;


public interface IModel {
    boolean createFirm(String nameFirm);
    boolean deleteFirm(String nameFirm);
    List<TypeExercise> getTypeExercises();
    void setTypeExercises(List<TypeExercise> typeExercises);
    boolean createTypeExercise(String nameTE);
    boolean deleteTypeExercise(String nameTE);
    List<TypeSimulator> getTypeSimulator();
    void setTypeSimulators(List<TypeSimulator> typeSimulator);
    boolean createTypeSimulator(String nameTS);
    boolean deleteTypeSimulator(String nameTS);
    void setTrainings(List<Training> trainings);
    List<Training> getTrainings();
    boolean createTraining(int idTraining, String time, String date);
    boolean deleteTraining(int idTraining);
    void setFirms(List<Firm> firms);
    List<Firm> getFirms();
    void setSimulators(List<Simulator> simulators);
    List<Simulator> getSimulators();
    boolean createSimulator(int idSimulator, String model, Firm firm, TypeSimulator typeSimulator);
    boolean deleteSimulator(int idSimulator);
    Simulator findSimulator(int idSimulator);
    TypeSimulator findTypeSimulator(String nameTS);
    Firm findFirm(String name);
    List<Exercise> getExercises();
    void setExercises(List<Exercise> exercises);
    boolean createExercise(int idExercise, TypeExercise typeExercise, Training training, Simulator simulator, String time, int countApproach);
    Exercise findExercise(int idExercise);
    boolean deleteExercise(int idExercise);
    void setServices(SFirm sFirm, STypeExercise sTypeExercise, STypeSimulator sTypeSimulator, STraining sTraining, SSimulator sSimulator, ExerciseS exerciseS);
    Training findTraining(int idTraining);
    TypeExercise findTypeExercise(String nameTE);
    boolean updateFirm(String name, String name1);
    boolean updateTypeExercise(String name, String name1);
    boolean updateTypeSimulator(String name, String name1);
    boolean updateTraining(int idTraining, String time, String date);
    boolean updateSimulator(int idSimulator, String model, Firm firm, TypeSimulator typeSimulator);
    boolean updateExercise(int idExercise, TypeExercise typeExercise, Training training, Simulator simulator, String time, int countApproach);
}

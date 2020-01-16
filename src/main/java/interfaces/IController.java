package interfaces;

public interface IController {
    void setModel(IModel model);
    void setView(IView view);
    boolean validUpdateFirm(String nameFirm, String nameFirm1);
    boolean validUpdateTypeExercise(String name, String name1);
    boolean validUpdateTypeSimulator(String name, String name1);
    boolean validUpdateTraining(int idTraining, String time, String date);
    boolean validUpdateSimulator(int id, String model1, String firm, String typeSimulator);
    boolean validUpdateExercise(int id, String typeExercise, int training, int simulator, String time, int countApproach);
    boolean validCreateFirm(String nameFirm);
    boolean validCreateTypeExercise(String nameTE);
    boolean validCreateTypeSimulator(String nameTS);
    boolean validCreateTraining(String time, String date);
    boolean validCreateSimulator(String model1, String firm, String typeSimulator);
    boolean validCreateExercise(String typeExercise, int training, int simulator, String time, int countApproach);
    boolean validDeleteFirm(String nameFirm);
    boolean validDeleteTypeExercise(String name);
    boolean validDeleteTypeSimulator(String name);
    boolean validDeleteTraining(int idTraining);
    boolean validDeleteSimulator(int id);
    boolean validDeleteExercise(int id);
    void showAllFirm();
    void showAllTypeExercise();
    void showAllTypeSimulator();
    void showAllTrainings();
    void showAllSimulators();
    void showAllExercises();
    void showAll();
}

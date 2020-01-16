package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import interfaces.*;
import model.*;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Controller implements IController {
    IModel model;
    IView view;

    public void setModel(IModel model) {
        this.model = model;
    }

    public void setView(IView view) {
        this.view = view;
    }

    public void save(String filename, List arr, Type type) {
        File file = new File(filename);
        Gson gson = new Gson();
        String jsonResult = gson.toJson(arr,type);
        Writer writer;
        try {
            writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
            writer.write(jsonResult);
            writer.close();
        }catch (IOException e){
            System.out.println("Ошибка при сохранении");
        }
    }

    public void loadFirm() {
        Type type = new TypeToken<ArrayList<Firm>>(){}.getType();
        File file = new File("Firm.txt");
        Gson gson = new Gson();
        JsonReader reader;
        try {
              reader = new JsonReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
              model.setFirms(gson.fromJson(reader,type));
              reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке");
        }
    }

    public void loadTypeExercise() {
        Type type = new TypeToken<ArrayList<TypeExercise>>(){}.getType();
        File file = new File("TypeExercise.txt");
        Gson gson = new Gson();
        JsonReader reader;
        try {
            reader = new JsonReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            model.setTypeExercises(gson.fromJson(reader,type));
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке");
        }
    }

    public void loadTypeSimulator() {
        Type type = new TypeToken<ArrayList<TypeSimulator>>(){}.getType();
        File file = new File("TypeSimulator.txt");
        Gson gson = new Gson();
        JsonReader reader;
        try {
            reader = new JsonReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            model.setTypeSimulators(gson.fromJson(reader,type));
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке");
        }
    }

    public void loadTraining() {
        Type type = new TypeToken<ArrayList<Training>>(){}.getType();
        File file = new File("Trainings.txt");
        Gson gson = new Gson();
        JsonReader reader;
        try {
            reader = new JsonReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            model.setTrainings(gson.fromJson(reader,type));
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке");
        }
    }

    public void loadSimulator() {
        Type type = new TypeToken<ArrayList<Simulator>>(){}.getType();
        File file = new File("Simulators.txt");
        Gson gson = new Gson();
        JsonReader reader;
        try {
            reader = new JsonReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            model.setSimulators(gson.fromJson(reader,type));
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке");
        }
    }

    public void loadExercise() {
        Type type = new TypeToken<ArrayList<Exercise>>(){}.getType();
        File file = new File("Exercises.txt");
        Gson gson = new Gson();
        JsonReader reader;
        try {
            reader = new JsonReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            model.setExercises(gson.fromJson(reader,type));
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке");
        }
    }

    public boolean validCreateFirm(String nameFirm) {
        System.out.println("Я контроллер. Получил данные на добавление ");
        if (model.createFirm(nameFirm)) {
            Type type = new TypeToken<ArrayList<Firm>>(){}.getType();
            save("Firm.txt", model.getFirms(), type);
            return true;
        }
        return false;
    }

    public boolean validUpdateFirm(String nameFirm, String nameFirm1) {
        System.out.println("Я контроллер. Получил данные на обновление ");
        if (model.updateFirm(nameFirm, nameFirm1)) {
            Type type = new TypeToken<ArrayList<Firm>>(){}.getType();
            save("Firm.txt", model.getFirms(), type);
            return true;
        }
        return false;
    }

    public boolean validDeleteFirm(String nameFirm) {
        System.out.println("Я контроллер. Получил данные на удаление");
        if (model.deleteFirm(nameFirm)) {
            Type type = new TypeToken<ArrayList<Firm>>(){}.getType();
            save("Firm.txt", model.getFirms(), type);
            return true;
        }
        return false;
    }

    public boolean validCreateTypeExercise(String nameTE) {
        System.out.println("Я контроллер. Получил данные на добавление ");
        if (model.createTypeExercise(nameTE)) {
            Type type = new TypeToken<ArrayList<TypeExercise>>(){}.getType();
            save("TypeExercise.txt", model.getTypeExercises(), type);
            return true;
        }
        return false;
    }

    public boolean validUpdateTypeExercise(String name, String name1) {
        System.out.println("Я контроллер. Получил данные на обновление ");
        if (model.updateTypeExercise(name, name1)) {
            Type type = new TypeToken<ArrayList<TypeExercise>>(){}.getType();
            save("TypeExercise.txt", model.getTypeExercises(), type);
            return true;
        }
        return false;
    }

    public boolean validDeleteTypeExercise(String name) {
        System.out.println("Я контроллер. Получил данные на удаление");
        if (model.deleteTypeExercise(name)) {
            Type type = new TypeToken<ArrayList<TypeExercise>>(){}.getType();
            save("TypeExercise.txt", model.getTypeExercises(), type);
            return true;
        }
        return false;
    }

    public boolean validCreateTypeSimulator(String nameTS) {
        System.out.println("Я контроллер. Получил данные на добавление ");
        if (model.createTypeSimulator(nameTS)) {
            Type type = new TypeToken<ArrayList<TypeSimulator>>(){}.getType();
            save("TypeSimulator.txt", model.getTypeSimulator(), type);
            return true;
        }
        return false;
    }

    public boolean validUpdateTypeSimulator(String name, String name1) {
        System.out.println("Я контроллер. Получил данные на обновление ");
        if (model.updateTypeSimulator(name, name1)) {
            Type type = new TypeToken<ArrayList<TypeSimulator>>(){}.getType();
            save("TypeSimulator.txt", model.getTypeSimulator(), type);
            return true;
        }
        return false;
    }

    public boolean validDeleteTypeSimulator(String name) {
        System.out.println("Я контроллер. Получил данные на удаление");
        if (model.deleteTypeSimulator(name)) {
            Type type = new TypeToken<ArrayList<TypeSimulator>>(){}.getType();
            save("TypeSimulator.txt", model.getTypeSimulator(), type);
            return true;
        }
        return false;
    }

    public boolean validCreateTraining(String time, String date) {
        System.out.println("Я контроллер. Получил данные на добавление ");
        int idTraining = model.getTrainings().size();
        if (model.createTraining(idTraining + 1, time, date)) {
            Type type = new TypeToken<ArrayList<Training>>(){}.getType();
            save("Trainings.txt", model.getTrainings(), type);
            return true;
        }
        return false;
    }

    public boolean validUpdateTraining(int idTraining, String time, String date) {
        System.out.println("Я контроллер. Получил данные на добавление ");
        if (model.updateTraining(idTraining, time, date)) {
            Type type = new TypeToken<ArrayList<Training>>(){}.getType();
            save("Trainings.txt", model.getTrainings(), type);
            return true;
        }
        return false;
    }

    public boolean validDeleteTraining(int idTraining) {
        System.out.println("Я контроллер. Получил данные на добавление ");
        if (model.deleteTraining(idTraining)) {
            Type type = new TypeToken<ArrayList<Training>>(){}.getType();
            save("Trainings.txt", model.getTrainings(), type);
            return true;
        }
        return false;
    }

    public boolean validCreateSimulator(String model1, String firm, String typeSimulator) {
        System.out.println("Я контроллер. Получил данные на добавление ");
        int idSimulator = model.getSimulators().size();
        Firm firm1 = model.findFirm(firm);
        TypeSimulator typeSimulator1 = model.findTypeSimulator(typeSimulator);
        if(firm1 != null && typeSimulator1 != null) {
            if (model.createSimulator(idSimulator + 1, model1, firm1, typeSimulator1)) {
                Type type = new TypeToken<ArrayList<Simulator>>(){}.getType();
                save("Simulators.txt", model.getSimulators(), type);
                return true;
            }
        }
        else {
            System.out.println("В справочнике не существует такой фирмы или типа тренажёра");
        }
        return false;
    }

    public boolean validUpdateSimulator(int id, String model1, String firm, String typeSimulator) {
        System.out.println("Я контроллер. Получил данные на изменение ");
        Firm firm1 = model.findFirm(firm);
        TypeSimulator typeSimulator1 = model.findTypeSimulator(typeSimulator);
        if(firm1 != null && typeSimulator1 != null) {
            if (model.updateSimulator(id, model1, firm1, typeSimulator1)) {
                Type type = new TypeToken<ArrayList<Simulator>>(){}.getType();
                save("Simulators.txt", model.getSimulators(), type);
                return true;
            }
        }
        else {
            System.out.println("В справочнике не существует такой фирмы или типа тренажёра");
        }
        return false;
    }

    public boolean validDeleteSimulator(int id) {
        System.out.println("Я контроллер. Получил данные на удаление ");
        if (model.deleteSimulator(id)) {
            Type type = new TypeToken<ArrayList<Simulator>>(){}.getType();
            save("Simulators.txt", model.getSimulators(), type);
            return true;
        }
        return false;
    }

    public boolean validCreateExercise(String typeExercise, int training, int simulator, String time, int countApproach) {
        System.out.println("Я контроллер. Получил данные на добавление ");
        int idExercise = model.getExercises().size();
        Training training1 = model.findTraining(training);
        TypeExercise typeExercise1 = model.findTypeExercise(typeExercise);
        Simulator simulator1 = model.findSimulator(simulator);
        if(training1 != null && typeExercise1 != null && simulator1 != null) {
            if (model.createExercise(idExercise + 1, typeExercise1, training1, simulator1, time, countApproach)) {
                Type type = new TypeToken<ArrayList<Exercise>>(){}.getType();
                save("Exercises.txt", model.getExercises(), type);
                return true;
            }
        }
        else {
            System.out.println("В справочнике не существует такой тренировки, тренажёра или типа упражнения");
        }
        return false;
    }

    public boolean validUpdateExercise(int id, String typeExercise, int training, int simulator, String time, int countApproach) {
        System.out.println("Я контроллер. Получил данные на изменение ");
        Training training1 = model.findTraining(training);
        TypeExercise typeExercise1 = model.findTypeExercise(typeExercise);
        Simulator simulator1 = model.findSimulator(simulator);
        if(training1 != null && typeExercise1 != null && simulator1 != null) {
            if (model.updateExercise(id, typeExercise1, training1, simulator1, time, countApproach)) {
                Type type = new TypeToken<ArrayList<Exercise>>(){}.getType();
                save("Exercises.txt", model.getExercises(), type);
                return true;
            }
        }
        else {
            System.out.println("В справочнике не существует такой тренировки, тренажёра или типа упражнения");
        }
        return false;
    }

    public boolean validDeleteExercise(int id) {
        System.out.println("Я контроллер. Получил данные на удаление ");
        if (model.deleteExercise(id)) {
            Type type = new TypeToken<ArrayList<Exercise>>(){}.getType();
            save("Exercises.txt", model.getExercises(), type);
            return true;
        }
        return false;
    }

    public void showAllFirm() {
        loadFirm();
        for (Firm firm : model.getFirms()) {
            System.out.println(firm.getNameFirm());
        }
    }

    public void showAllTypeExercise() {
        loadTypeExercise();
        for (TypeExercise typeExercise : model.getTypeExercises()) {
            System.out.println(typeExercise.getTypeExersise());
        }
    }

    public void showAllTypeSimulator() {
        loadTypeSimulator();
        for (TypeSimulator typeSimulator : model.getTypeSimulator()) {
            System.out.println(typeSimulator.getTypeSimulator());
        }
    }

    public void showAllTrainings() {
        loadTraining();
        for (Training training : model.getTrainings()) {
            System.out.println(training.getIdTraining() + " " + training.getTime() + " " + training.getDate());
        }
    }

    public void showAllSimulators() {
        loadSimulator();
        for (Simulator simulator : model.getSimulators()) {
            System.out.println(simulator.getIdSimulator() + " " + simulator.getModel() + " " + simulator.getFirm().getNameFirm() + " " + simulator.getTypeSimulator().getTypeSimulator());
        }
    }
    public void showAllExercises() {
        loadTypeExercise();
        for (Exercise exercise : model.getExercises()) {
            System.out.println(exercise.getIdExercise() + " " + exercise.getTypeExercise().getTypeExersise() + " " + exercise.getTraining().getIdTraining() + " " + exercise.getSimulator().getIdSimulator() + " " + exercise.getTime() + " " + exercise.getCountApproach());
        }
    }
    public void showAll() {
        showAllFirm();
        showAllTypeExercise();
        showAllTypeSimulator();
        showAllTrainings();
        showAllSimulators();
        showAllExercises();
    }
}

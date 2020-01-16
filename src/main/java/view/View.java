package view;

import interfaces.IController;
import interfaces.IView;


import java.util.Scanner;

public class View implements IView {
    IController controller = null;

    private String readString(int minLength, int maxLength, String captionMessage) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (true) {
            System.out.println(captionMessage + " (exit - возврат)");
            s = scanner.nextLine();
            if (s.equals("exit")) {
                return "";
            }

            if (s.length() > maxLength) {
                System.out.println("Ошибка. Длинна строки больше " + maxLength);
            } else if (s.length() < minLength) {
                System.out.println("Ошибка. Длинна строки меньше " + minLength);
            } else {
                return s;
            }
        }
    }

    private int readInteger(int min, int max, String captionMessage) {
        Scanner scanner = new Scanner(System.in);

        int i;
        while (true) {
            System.out.println(captionMessage);
            i = scanner.nextInt();

            if (i > max) {
                System.out.println("Ошибка. Число больше " + max);
            } else if (i < min) {
                System.out.println("Ошибка. Число меньше " + min);
            } else {
                return i;
            }
        }
    }

    private void mainMenu() {
        System.out.println("-- Добро пожадовать в тренажёрный зал --");
        System.out.println("Основное меню:");
        System.out.println("1 - Просмотр записей");
        System.out.println("2 - Добавить запись");
        System.out.println("3 - Изменить запись");
        System.out.println("4 - Удалить запись");
        System.out.println("0 - Выход");
    }

    private void showMenu() {
        System.out.println("Что хотите посмотреть?");
        System.out.println("1 - Просмотр фирм");
        System.out.println("2 - Просмотр типов упражнений");
        System.out.println("3 - Просмотр типов тренажёров");
        System.out.println("4 - Просмотр тренировок");
        System.out.println("5 - Просмотр тренажёров");
        System.out.println("6 - Просмотр упражнений");
        System.out.println("7 - Просмотр всех записей");
        System.out.println("0 - Выход");
    }

    private void createMenu(){
        System.out.println("Что хотите добавить?");
        System.out.println("1 - Добавить фирму");
        System.out.println("2 - Добавить тип упражнения");
        System.out.println("3 - Добавить тип тренажёра");
        System.out.println("4 - Добавить тренировку");
        System.out.println("5 - Добавить тренажёр");
        System.out.println("6 - Добавить упражнение");
        System.out.println("0 - Выход");
    }

    private void updateMenu() {
        System.out.println("Выберите, что менять:");
        System.out.println("1 - Фирму");
        System.out.println("2 - Тип упражнения");
        System.out.println("3 - Тип тренажёра");
        System.out.println("4 - Тренеровку");
        System.out.println("5 - Тренажёр");
        System.out.println("6 - Упражнение");
        System.out.println("0 - Выход");
    }

    private void deleteMenu() {
        System.out.println("Выберите, что удалять:");
        System.out.println("1 - Фирму");
        System.out.println("2 - Тип упражнения");
        System.out.println("3 - Тип тренажёра");
        System.out.println("4 - Тренеровку");
        System.out.println("5 - Тренажёр");
        System.out.println("6 - Упражнение");
        System.out.println("0 - Выход");
    }

    private void runMainMenu() {
        while (true) {
            mainMenu();
            int i = readInteger(0, 4, "");
            if (i == 0) {
                break;
            }
            switch (i) {
                case 1: {
                    showMenu();
                    int k = readInteger(0, 7, "");
                    if (k == 0) {
                        break;
                    }
                    switch (k) {
                        case 1: {
                            controller.showAllFirm();
                            break;
                        }
                        case 2:{
                            controller.showAllTypeExercise();
                            break;
                        }
                        case 3:{
                            controller.showAllTypeSimulator();
                            break;
                        }
                        case 4:{
                            controller.showAllTrainings();
                            break;
                        }
                        case 5:{
                            controller.showAllSimulators();
                            break;
                        }
                        case 6:{
                            controller.showAllExercises();
                            break;
                        }
                        case 7:{
                            controller.showAll();
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    createMenu();
                    int j = readInteger(0, 6, "");
                    if (j == 0) {
                        break;
                    }
                    switch (j) {
                        case 1: {
                            createFirmMenu();
                            break;
                        }
                        case 2:{
                            createTypeExerciseMenu();
                            break;
                        }
                        case 3:{
                            createTypeSimulatorMenu();
                            break;
                        }
                        case 4:{
                            createTrainingMenu();
                            break;
                        }
                        case 5:{
                            createSimulatorMenu();
                        }
                        case 6:{
                            createExerciseMenu();
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    updateMenu();
                    int j = readInteger(0, 6, "");
                    if (j == 0) {
                        break;
                    }
                    switch (j){
                        case 1:{
                            updateFirmMenu();
                            break;
                        }
                        case 2: {
                            updateTypeExerciseMenu();
                            break;
                        }
                        case 3: {
                            updateTypeSimulatorMenu();
                            break;
                        }
                        case 4: {
                            updateTrainingMenu();
                            break;
                        }
                        case 5: {
                            updateSimulatorMenu();
                            break;
                        }
                        case 6: {
                            updateExerciseMenu();
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    deleteMenu();
                    int j = readInteger(0, 6, "");
                    if (j == 0) {
                        break;
                    }
                    switch (j){
                        case 1:{
                            deleteFirmMenu();
                            break;
                        }
                        case 2:{
                            deleteTypeExerciseMenu();
                            break;
                        }
                        case 3:{
                            deleteTypeSimulatorMenu();
                            break;
                        }
                        case 4:{
                            deleteTrainingMenu();
                            break;
                        }
                        case 5: {
                            deleteSimulatorMenu();
                            break;
                        }
                        case 6:{
                            deleteExerciseMenu();
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    private void deleteFirmMenu() {
        System.out.println("-- Удаление фирмы --");
        String s;
        s = readString(0, 20, "Введите название фирмы");
        if (s != "") {
            controller.validDeleteFirm(s);
        }
    }

    private void updateFirmMenu() {
        System.out.println("-- Изменение фирмы --");
        String s, s1;
        s = readString(0, 20, "Введите название фирмы которую хотите заменить");
        s1 = readString(0, 20, "Введите новое название фирмы");
        if (s != "" && s1 != "") {
            controller.validUpdateFirm(s,s1);
        }
    }

    private void createFirmMenu() {
        System.out.println("-- Добавление фирмы --");
        String s;
        s = readString(0, 20, "Введите название фирмы");
        if (s != "") {
            controller.validCreateFirm(s);
        }
    }

    private void updateTypeExerciseMenu() {
        System.out.println("-- Изменение фирмы --");
        String s, s1;
        s = readString(0, 20, "Введите название типа упражнения которое хотите заменить");
        s1 = readString(0, 20, "Введите новое название типа упражнения");
        if (s != "" && s1 != "") {
            controller.validUpdateTypeExercise(s,s1);
        }
    }

    private void createTypeExerciseMenu() {
        System.out.println("-- Добавление типа упражения --");
        String s;
        s = readString(0, 20, "Введите тип упражнения");
        if (s != "") {
            controller.validCreateTypeExercise(s);
        }
    }

    private void deleteTypeExerciseMenu() {
        System.out.println("-- Добавление типа упражения --");
        String s;
        s = readString(0, 20, "Введите тип упражнения");
        if (s != "") {
            controller.validDeleteTypeExercise(s);
        }
    }

    private void createTypeSimulatorMenu() {
        System.out.println("-- Добавление типа тренажёра --");
        String s;
        s = readString(0, 20, "Введите тип тренажёра");
        if (s != "") {
            controller.validCreateTypeSimulator(s);
        }
    }

    private void updateTypeSimulatorMenu() {
        System.out.println("-- Изменение фирмы --");
        String s, s1;
        s = readString(0, 20, "Введите название типа тренажёра которое хотите заменить");
        s1 = readString(0, 20, "Введите новое название типа тренажёра");
        if (s != "" && s1 != "") {
            controller.validUpdateTypeSimulator(s,s1);
        }
    }

    private void deleteTypeSimulatorMenu() {
        System.out.println("-- Удаление типа тренажёра --");
        String s;
        s = readString(0, 20, "Введите тип тренажёра");
        if (s != "") {
            controller.validDeleteTypeSimulator(s);
        }
    }

    private void createTrainingMenu() {
        System.out.println("-- Добавление тренировки --");
        String s,s1;
        s = readString(0, 20, "Введите время начала тренировки в формате (чч:мм)");
        s1 = readString(0, 20, "Введите дату тренировки в формате (dd.mm.yy)");
        if (s != "" && s1!= "") {
            controller.validCreateTraining(s, s1);
        }
    }

    private void updateTrainingMenu() {
        System.out.println("-- Изменение тренировки --");
        String s,s1;
        int i = readInteger(0, 10, "Введите номер тренировки которую хотите изменить");
        s = readString(0, 20, "Введите новое время начала тренировки в формате (чч:мм)");
        s1 = readString(0, 20, "Введите новую дату тренировки в формате (dd.mm.yy)");
        if (s != "" && s1!= "") {
            controller.validUpdateTraining(i, s, s1);
        }
    }

    private void deleteTrainingMenu() {
        System.out.println("-- Удаление тренировки --");
        int i = readInteger(0, 10, "Введите номер тренировки, которую хотите удалить");
        controller.validDeleteTraining(i);
    }

    private void createSimulatorMenu() {
        System.out.println("-- Добавление тренажёра --");
        String s,s1,s2;
        s = readString(0, 20, "Введите название модели");
        s1 = readString(0, 20, "Введите название фирмы");
        s2 = readString(0, 20, "Введите тип тренажёра");
        if (s != "" && s1!= ""&& s2!= "") {
            controller.validCreateSimulator(s, s1, s2);
        }
    }

    private void updateSimulatorMenu() {
        System.out.println("-- Изменение тренажёра --");
        String s,s1,s2;
        int i = readInteger(0, 10, "Введите номер тренажёра, который хотите удалить");
        s = readString(0, 20, "Введите новое название модели");
        s1 = readString(0, 20, "Введите новое название фирмы");
        s2 = readString(0, 20, "Введите новое тип тренажёра");
        if (s != "" && s1!= ""&& s2!= "") {
            controller.validUpdateSimulator(i, s, s1, s2);
        }
    }

    private void deleteSimulatorMenu() {
        System.out.println("-- Удаление тренажёра --");
        int i = readInteger(0, 10, "Введите номер тренажёра, которую хотите удалить");
        controller.validDeleteSimulator(i);
    }

    private void createExerciseMenu() {
        System.out.println("-- Добавление упражнения --");
        String s,s1;
        int i,j,k;
        s = readString(0, 20, "Введите тип упражнения");
        s1 = readString(0, 20, "Введите время выполнения упражнения (мм:сс)");
        i = readInteger(0, 10, "Введите номер тренировки");
        j = readInteger(0, 10, "Введите номер тренажёра");
        k = readInteger(0, 9, "Введите количество подходов");
        if (s != "" && s1!= "" && i != 0 && j!=0 && k!= 0) {
            controller.validCreateExercise(s, i, j, s1, k);
        }
    }

    private void updateExerciseMenu() {
        System.out.println("-- Изменение упражнения --");
        String s,s1;
        int i,j,k,n;
        s = readString(0, 20, "Введите новый тип упражнения");
        s1 = readString(0, 20, "Введите новое время выполнения упражнения (мм:сс)");
        n = readInteger(0, 10, "Введите номер упражнения, которое хотите изменить");
        i = readInteger(0, 10, "Введите новый номер тренировки");
        j = readInteger(0, 10, "Введите новый номер тренажёра");
        k = readInteger(0, 9, "Введите новое количество подходов");
        if (s != "" && s1!= "" && i != 0 && j!=0 && k!= 0) {
            controller.validUpdateExercise(n, s, i, j, s1, k);
        }
    }

    private void deleteExerciseMenu() {
        System.out.println("-- Удаление упражнения --");
        int i = readInteger(0, 10, "Введите номер упражнения, которую хотите удалить");
        controller.validDeleteExercise(i);
    }

    public void runView() {
        runMainMenu();
    }

    public void setController(IController controller) {
        this.controller = controller;
    }
}

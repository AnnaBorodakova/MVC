package com.company;

import controller.Controller;
import interfaces.*;
import model.Model;
import model.services.*;
import view.View;

public class Main {
    public static void main(String[] args){
	// write your code here
        IView view = new View();
        IController controller = new Controller();
        IModel model = new Model();
        SFirm sFirm = new SFirm();
        STypeExercise sTypeExercise = new STypeExercise();
        STypeSimulator sTypeSimulator = new STypeSimulator();
        STraining sTraining = new STraining();
        SSimulator sSimulator = new SSimulator();
        ExerciseS exerciseS = new ExerciseS();
        view.setController(controller);
        controller.setModel(model);
        model.setServices(sFirm,sTypeExercise,sTypeSimulator,sTraining,sSimulator,exerciseS);
        controller.setView(view);
        view.runView();
    }
}

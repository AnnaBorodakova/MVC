package model.services;

import model.Firm;
import model.Simulator;
import model.TypeSimulator;

import java.util.ArrayList;
import java.util.List;

public class SSimulator {
    private List<Simulator> simulators;

    public SSimulator() {
        simulators = new ArrayList<>();
    }

    public List<Simulator> getSimulators() {
        return simulators;
    }

    public void setSimulators(List<Simulator> simulators) {
        this.simulators = simulators;
    }

    public boolean createSimulator(int idSimulator, String model, Firm firm, TypeSimulator typeSimulator){
        Simulator simulator = findSimulator(idSimulator);
        if(simulator == null){
            simulator = new Simulator(idSimulator, model, firm, typeSimulator);
            simulators.add(simulator);
        }
        return true;
    }

    public boolean deleteSimulator(int idSimulator){
        Simulator simulator = findSimulator(idSimulator);
        if(simulator != null){
            simulators.remove(simulator);
        }
        return true;
    }

    public boolean updateSimulator(int idSimulator, String model, Firm firm, TypeSimulator typeSimulator){
        Simulator simulator = findSimulator(idSimulator);
        if(simulator != null){
            simulator.setModel(model);
            simulator.setFirm(firm);
            simulator.setTypeSimulator(typeSimulator);
        }
        return true;
    }

    public Simulator findSimulator(int idSimulator)
    {
        Simulator simulator = null;
        for (Simulator simulator1 : simulators){
            if(simulator1.getIdSimulator() == idSimulator){
                simulator =simulator1;
            }
        }
        return simulator;
    }
}

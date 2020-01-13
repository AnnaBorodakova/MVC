package model.services;

import model.Firm;

import java.util.ArrayList;
import java.util.List;

public class SFirm {
    private List<Firm> firms = new ArrayList<>();

   /* public SFirm() {
        this.firms = new ArrayList<>();
    }
*/
    public List<Firm> getFirms() {
        return firms;
    }

    public void setFirms(List<Firm> firms) {
        this.firms = firms;
    }

    public boolean createFirm(String nameFirm){
        Firm firm = findFirm(nameFirm);
        if(firm == null){
            firm = new Firm(nameFirm);
            firms.add(firm);
        }
        return true;
    }

    public boolean deleteFirm(String nameFirm)
    {
        Firm firm = findFirm(nameFirm);
        if(firm != null){
            firms.remove(firm);
        }
        return true;
    }

    public boolean updateFirm(String name, String name1){
        Firm firm = findFirm(name);
        Firm firm2 = findFirm(name1);
        if(firm != null && firm2 == null){
            firm.setNameFirm(name1);
        }
        return true;
    }
    public Firm findFirm(String name) {
        Firm firm = null;
        for (Firm firm1 : firms) {
            if (firm1.getNameFirm().equals(name)) {
                firm = firm1;
                break;
            }
        }
        return firm;
    }
}

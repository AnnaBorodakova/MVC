package model;

import java.io.Serializable;

public class Firm implements Serializable {
    private String nameFirm;

    public Firm(String nameFirm) {
        this.nameFirm = nameFirm;
    }

    public String getNameFirm() {
        return nameFirm;
    }

    public void setNameFirm(String nameFirm) {
        this.nameFirm = nameFirm;
    }
}

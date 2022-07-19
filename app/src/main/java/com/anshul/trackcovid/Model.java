package com.anshul.trackcovid;

public class Model {


    private String district;
    private int active;
    private int confirmed;
    private int decreased;
    private int recovered;

    public Model(String district, int active, int confirmed, int decreased, int recovered) {
        this.district = district;
        this.active = active;
        this.confirmed = confirmed;
        this.decreased = decreased;
        this.recovered = recovered;
    }


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }


    public int getDecreased() {
        return decreased;
    }

    public void setDecreased(int decreased) {
        this.decreased = decreased;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }
}

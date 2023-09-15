package org.example.plane.engine;

public class BaseEngine {

    private String name;
    private float power;

    private float consumption;

    public BaseEngine(String name, float power, float consumption) {
        this.name = name;
        this.power = power;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public float getPower() {
        return power;
    }

    public float getConsumption() {
        return consumption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }
}

package org.example.plane;

import org.example.plane.engine.BaseEngine;
import org.example.plane.engine.IEngine;

public class BasePlane {


    private IEngine engine;

    public static final int PASSENGER = 0;
    public static final int LORRY = 1;

    public static final int COMBINED = 2;


    public BasePlane(){

    }
    public BasePlane(IEngine engine) {
        this.engine = engine;
    }

    protected int type;

    protected int weight;

    protected int lorry_weight;

    protected String name;

    public int getType() {
        return type;
    }


    public int getWeight() {
        return weight;
    }

    public int getLorry_weight() {
        return lorry_weight;
    }


    public String getName() {
        return name;
    }

    public BasePlane setType(int type) {
        this.type = type;
        return this;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLorry_weight(int lorry_weight) {
        this.lorry_weight = lorry_weight;
    }


    public BasePlane setName(String name) {
        this.name = name;
        return this;
    }

    public IEngine getEngine() {
        return engine;
    }

    public BasePlane setEngine(IEngine engine) {
        this.engine = engine;
        return this;
    }

    public static class PlaneFabric{

        BasePlane base = new BasePlane();

        public BasePlane generate(){
            return base;
        }

        public PlaneFabric setEngine(IEngine engine){
            base.setEngine(engine);
            return this;
        }

        public PlaneFabric setName(String name){
            base.setName(name);
            return this;
        }

        public PlaneFabric setType(int type){
            base.setType(type);
            return this;
        }


    }

}

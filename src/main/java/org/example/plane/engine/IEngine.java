package org.example.plane.engine;

public interface IEngine {

    public static final int GAS_ENGINE = 0;
    public static final int DIESEL_ENGINE = 1;
    public static final int JET_ENGINE = 2;

    public static final int FUEL_GAS = 0;
    public static final int FUEL_DIESEL = 1;
    public static final int FUEL_CEROSINE = 2;

    int getEngineType();

    int getEngineFuelType();

    float getEnginePowerKW();

    default float getEnginePowerHP(){
        return getEnginePowerKW()/1.1f;
    }

    String getName();

}

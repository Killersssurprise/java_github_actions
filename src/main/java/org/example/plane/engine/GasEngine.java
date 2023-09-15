package org.example.plane.engine;

public class GasEngine extends BaseEngine implements IEngine{
    public GasEngine(String name, float power, float consumption) {
        super(name, power, consumption);
    }

    @Override
    public int getEngineType() {
        return IEngine.GAS_ENGINE;
    }

    @Override
    public int getEngineFuelType() {
        return IEngine.FUEL_GAS;
    }

    @Override
    public float getEnginePowerKW() {
        return this.getPower();
    }
}

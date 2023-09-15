package org.example.plane.engine;

public class GasEngineModel5 extends BaseEngine implements IEngine{
    public GasEngineModel5() {
        super("Модель 5", 2000, 500);
    }

    @Override
    public int getEngineType() {
        return IEngine.GAS_ENGINE;
    }

    @Override
    public int getEngineFuelType() {
        return IEngine.GAS_ENGINE;
    }

    @Override
    public float getEnginePowerKW() {
        return this.getPower();
    }
}

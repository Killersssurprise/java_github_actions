package org.example.plane.engine;

public class JetEngineModel26 extends BaseEngine implements IEngine{

    public JetEngineModel26(){
        super("Модель 26", 26000,2000 );
    }

    @Override
    public int getEngineType() {
        return IEngine.JET_ENGINE;
    }

    @Override
    public int getEngineFuelType() {
        return IEngine.JET_ENGINE;
    }

    @Override
    public float getEnginePowerKW() {
        return this.getPower();
    }

    @Override
    public String getName() {
        return this.getName();
    }
}

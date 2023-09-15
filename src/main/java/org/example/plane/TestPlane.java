package org.example.plane;

import org.example.plane.engine.IEngine;

public class TestPlane extends BasePlane{
    public TestPlane() {
        super(new IEngine() {
            @Override
            public int getEngineType() {
                return IEngine.DIESEL_ENGINE;
            }

            @Override
            public int getEngineFuelType() {
                return IEngine.FUEL_DIESEL;
            }

            @Override
            public float getEnginePowerKW() {
                return 1000;
            }

            @Override
            public String getName() {
                return "НПРДД1";
            }
        });
    }
}

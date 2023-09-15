package org.example.plane;

import org.example.plane.engine.JetEngineModel26;

public class Jac26JetEngine extends BasePlane{

    public Jac26JetEngine() {
        super(new JetEngineModel26());

        this.name = "Як 26";
        this.type = BasePlane.PASSENGER;
        this.weight = 26;
        this.lorry_weight = 10;
    }
}

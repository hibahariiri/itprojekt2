package org.example;

import java.text.DecimalFormat;
import java.util.Random;

public class SensorTemp {

    Random r = new Random();

    public double temperaturV() {

        double Mintempv = 34;
        double Maxtempv = 40;
        double Tempv = Mintempv + (Maxtempv - Mintempv)* r.nextDouble();

        return Tempv;

    }

    public double temperaturB() {

        double Mintempb = 34;
        double Maxtempb = 41;
        double Tempb = Mintempb + (Maxtempb - Mintempb)* r.nextDouble();

        return Tempb;
    }

}

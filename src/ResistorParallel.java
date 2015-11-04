package sample;

import java.lang.Math;

public class ResistorParallel{
    public double finalValue, total = 0;
    public double[] resistors = new double[3];

    public double rCalc(){
        //int resistors_number = 3;

        //resistors = new double[resistors_number];

        for(int i = 0; i < resistors.length; i++){
            total += 1 / resistors[i];
        }

        finalValue = 1 / total;
        return Math.floor(finalValue * 100) / 100;
    }

    @Override
    public String toString(){
        return "r1: " + resistors[0] + ", r2: " + resistors[1] + ", r3:" + resistors[2] + ", eq:" + finalValue;
    }
}
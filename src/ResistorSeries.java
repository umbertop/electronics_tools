package sample;

import javax.swing.JOptionPane;
import java.lang.Math;

public class ResistorSeries{
    public double final_value, resistors[];
    public int resistors_number;

    public double rCalc(){
        do{
            resistors_number = Integer.parseInt(JOptionPane.showInputDialog("Inserisci q.tà resistenze: "));
        } while(resistors_number < 1);

        resistors = new double[resistors_number];

        for(int i = 0; i < resistors_number; i++){
            resistors[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserisci valore della " + (i+1) + "° resistenza: "));
            final_value += resistors[i];
        }

        return Math.floor(final_value * 100) / 100;
    }
}
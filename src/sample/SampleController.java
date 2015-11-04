package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import sample.OhmLaw;
import sample.ResistorParallel;
import sample.ResistorSeries;

import java.net.URL;
import java.util.ResourceBundle;

public class SampleController{
    OhmLaw o = new OhmLaw();

    public TextField vText, rText, iText, pText;
    public Button calculate, reset;

    public void calculateOhmLawValues(Event event){
        o.v = vText.getText().trim().isEmpty() ? 0 : Double.parseDouble(vText.getText());
        o.r = rText.getText().trim().isEmpty() ? 0 : Double.parseDouble(rText.getText());
        o.i = iText.getText().trim().isEmpty() ? 0 : Double.parseDouble(iText.getText());
        o.p = pText.getText().trim().isEmpty() ? 0 : Double.parseDouble(pText.getText());

        o.calc();
        System.out.println(vText.getText() + "\n" + o.toString());


        vText.setText(String.valueOf(o.v));
        rText.setText(String.valueOf(o.r));
        iText.setText(String.valueOf(o.i));
        pText.setText(String.valueOf(o.p));
    }

    public void resetOhmLawValues(Event event){
        o.v = 0;
        o.i = 0;
        o.r = 0;
        o.p = 0;

        System.out.println(vText.getText() + "\n" + o.toString());

        vText.setText(String.valueOf(""));
        rText.setText(String.valueOf(""));
        iText.setText(String.valueOf(""));
        pText.setText(String.valueOf(""));
    }

    ResistorParallel rP = new ResistorParallel();

    public TextField R1Text, R2Text, R3Text, EqRText;
    public Button calculate1, reset1;

    public void calculateResistorsParallelValues(Event event){
        rP.resistors[0] = R1Text.getText().trim().isEmpty() ? 0 : Double.parseDouble(R1Text.getText());
        rP.resistors[1] = R2Text.getText().trim().isEmpty() ? 0 : Double.parseDouble(R2Text.getText());
        rP.resistors[2] = R3Text.getText().trim().isEmpty() ? 0 : Double.parseDouble(R3Text.getText());
        rP.finalValue = EqRText.getText().trim().isEmpty() ? 0 : Double.parseDouble(EqRText.getText());

        rP.rCalc();
        System.out.println(R1Text.getText() + "\n" + rP.toString());


        R1Text.setText(String.valueOf(rP.resistors[0]));
        R2Text.setText(String.valueOf(rP.resistors[1]));
        R3Text.setText(String.valueOf(rP.resistors[2]));
        EqRText.setText(String.valueOf(rP.finalValue));
    }

    public void resetResistorsParallelValues(Event event){
        rP.resistors[0] = 0;
        rP.resistors[1] = 0;
        rP.resistors[2] = 0;
        rP.finalValue = 0;

        System.out.println(R1Text.getText() + "\n" + rP.toString());

        R1Text.setText(String.valueOf(""));
        R2Text.setText(String.valueOf(""));
        R3Text.setText(String.valueOf(""));
        EqRText.setText(String.valueOf(""));
    }
}
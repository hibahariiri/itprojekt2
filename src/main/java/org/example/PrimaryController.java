package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.shape.Polyline;

public class PrimaryController {
@FXML
public Polyline polyline;

    //To controlelementer som vi navngiver og gør brug af længere nede i klassen.
@FXML
    TextField loginfelt;
@FXML
    PasswordField passwordfield;

    //Her foregår at når man trykker på den bestemte button skal dette ske:
    public void validerlogin() throws IOException {
        System.out.println("Hej Hiba");
        //Det der er blevet skrevet i textfield kommer ind i konsollen.
        System.out.println(loginfelt.getText());
        //Det der er blevet skrevet i passwordfield kommer ind i konsollen.
        System.out.println(passwordfield.getText());
        //De starter begge med at være lig med null, som gør det muligt for os at skrive i dem.
        String password = null;
        String login = null;

        //if-konstruktør, som kører når login og password begge er lig med null.
        if(!(loginfelt.getText() ==null)&&!(passwordfield.getText() ==null)){
           password = passwordfield.getText();
           login = loginfelt.getText();
        }

        //Vi laver en integer med en værdi på 11, der skal være længden på vores CPR-nr.
        Integer længde = 11;

        //if-konstruktør, som kører hvis koden indholder læge, mens loginet indeholder L alt imens
        //den er lig med vores integer længde.
        if(password.equals("læge") && login.contains("L") && login.length()==længde){
        App.setRoot("Lægelogin");
        }

        //Hvis koden indeholder Patient, skal den skifte til secondary.
        if(password.equals("Patient")){
           App.setRoot("secondary");
        }

        Integer længgde = 10;

        if (login.length()==længgde && password.equals("patient")) {
            App.setRoot("PatientJournal");
        }

        int længdde = 11;

        if (login.contains("S") && login.length()==længdde && password.equals("sundhed")) {
            App.setRoot("thirdnary");
        }

    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    public void switchtolægelogin(ActionEvent actionEvent) throws IOException {
        App.setRoot("Lægelogin");
    }
    @FXML
    public void switchtosundlogin(ActionEvent actionEvent) throws IOException {
        App.setRoot("sundlogin");
    }

    Label label = new Label("CPR-nummer");
    Button button = new Button("Log in");


}






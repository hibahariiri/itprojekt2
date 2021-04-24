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

@FXML
    TextField loginfelt;
@FXML
    PasswordField passwordfield;

    public void validerlogin() throws IOException {
        System.out.println("Hej Hiba");
        System.out.println(loginfelt.getText());
        System.out.println(passwordfield.getText());
        String password = null;
        String login = null;


        if(!(loginfelt.getText() ==null)&&!(passwordfield.getText() ==null)){
           password = passwordfield.getText();
           login = loginfelt.getText();
        }

        Integer længde = 11;

        if(password.equals("læge") && login.contains("L") && login.length()==længde){
        App.setRoot("Lægelogin");
        }

        //if(password.equals("Patient")){
           // App.setRoot("secondary");
        //}

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






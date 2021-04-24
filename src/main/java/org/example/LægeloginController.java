package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LægeloginController {

    @FXML
    TextField CPRfelt;
    @FXML
    DatePicker startdato;
    @FXML
    DatePicker slutdato;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    public void switchtolægelogin(ActionEvent actionEvent) throws IOException {
        App.setRoot("Lægelogin");
    }

    @FXML
    public void switchtolægevalg(ActionEvent actionEvent) throws IOException {
        App.setRoot("Lægevalg");
    }

    @FXML
    public void switchtoeekg(ActionEvent actionEvent) throws IOException {
        App.setRoot("EKG");

    }

    public void SwitchToPrimary(ActionEvent actionEvent) {
    }

    public void sætCPR(ActionEvent dragEvent) {
        System.out.println("fjbjkve");

        //check CPr feltets getText. Hvis getTxt er lige præcis 11 tegn lang skal vi sætte en variabel der hedder CPR
        //til at matche med resultatet fra CPR feltet.

    }


}


package org.example;

import javafx.fxml.FXML;

import java.io.IOException;

public class PatientJournalController {


        @FXML
        private void switchtoprimary() throws IOException {
            App.setRoot("primary");


        }
}

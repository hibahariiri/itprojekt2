package org.example;

import javafx.fxml.FXML;

import java.io.IOException;

public class SundhedvalgController {


    @FXML
    private void switchTosundlogin() throws IOException {
        App.setRoot("sundlogin");
}
    @FXML
    private void switchTosundhedDato() throws IOException {
        App.setRoot("sundhedDato");
}
}


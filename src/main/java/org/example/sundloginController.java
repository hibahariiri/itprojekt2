package org.example;

import javafx.fxml.FXML;

import java.io.IOException;

public class sundloginController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
}
    @FXML
    private void switchTosundhedvalg() throws IOException {
        App.setRoot("sundhedvalg");
}
}

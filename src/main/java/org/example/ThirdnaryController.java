package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class ThirdnaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    private void switchToThirdnary() throws IOException {
        App.setRoot("thirdnary");

    }

    @FXML
    private void Switchtopatientjournal() throws IOException {
        App.setRoot("patientjournal");

    }

}

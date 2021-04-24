package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class LægevalgController {


    @FXML
    public void switchtolægelogin(ActionEvent actionEvent) throws IOException {
        App.setRoot("Lægelogin");
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void switchToLægeopretjournal() throws IOException {
        App.setRoot("Lægeopretjournal");
    }

}



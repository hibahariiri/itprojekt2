package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polyline;

public class EKGController {

    @FXML
    public Polyline polyline;
    public Button knap;

    public void buttonPressed(MouseEvent mouseEvent){
        knap.setText("Mål EKG");

        polyline.getPoints().addAll(
                (Math.random()-0.5)*100,(Math.random()-0.5)*100);

    }




}

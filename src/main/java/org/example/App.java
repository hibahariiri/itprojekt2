package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */

//En underklasse App fra superklassen Applicationen.
public class App extends Application {

    // attributten Scene som er en scene, som er inde i stage.
    private static Scene scene;

    @Override
    //Måske tråd.
    public void start(Stage stage) throws IOException {
        //Vi giver her scene et udseende med mål.
        scene = new Scene(loadFXML("primary"), 640, 480);
        //Her indsætter vi scenen ind under en stage så den kan blive vist.
        stage.setScene(scene);
        //Med stage.Show() gør vi det muligt for stage og alt det indebære at blive vist.
        stage.show();
    }

    //Her setter vi en Root, som er den første node i forgreningen uden at have en superklasse.
    static void setRoot(String fxml) throws IOException {
        //Her indsætter vi Root ind i vores oprettede scene.
        scene.setRoot(loadFXML(fxml));
    }
    //????????????????? WE DONT KNOW ????????????????
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    //Her starter vi noget. ?????????????? Men hvad ?????????????
    public static void main(String[] args) {
        launch();
    }

}
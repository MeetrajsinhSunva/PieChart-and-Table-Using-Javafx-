package com.assignment1.assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("charts.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);



        Image icon = new Image(getClass().getResourceAsStream("/icon/icon.png"));
        stage.getIcons().add(icon);


        stage.setTitle("Language");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
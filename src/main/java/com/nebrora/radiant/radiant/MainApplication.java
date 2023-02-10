package com.nebrora.radiant.radiant;

import com.nebrora.radiant.radiant.controllers.SignInController;
import com.nebrora.radiant.radiant.services.SignInService;
import com.nebrora.radiant.radiant.views.SignInView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) {
        SignInView signInView = new SignInView();
        SignInService signInModel = new SignInService();
        new SignInController(signInModel, signInView);
        Scene scene = new Scene(signInView);
        stage.setScene(scene);
        stage.setTitle("Radiant");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
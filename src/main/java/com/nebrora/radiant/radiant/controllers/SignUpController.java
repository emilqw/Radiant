package com.nebrora.radiant.radiant.controllers;

import com.nebrora.radiant.radiant.services.SignInService;
import com.nebrora.radiant.radiant.services.SignUpService;
import com.nebrora.radiant.radiant.views.SignInView;
import com.nebrora.radiant.radiant.views.SignUpView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SignUpController {
    public SignUpController(SignUpService service, SignUpView view) {
        view.getSignInButton().setOnAction(actionEvent -> {
            SignInView signInView = new SignInView();
            SignInService signInService = new SignInService();
            SignInController controller = new SignInController(signInService, signInView);
            Stage stage = (Stage) view.getScene().getWindow();
            stage.setScene(new Scene(signInView));
            stage.show();
        });
    }
}

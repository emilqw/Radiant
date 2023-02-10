package com.nebrora.radiant.radiant.controllers;

import com.nebrora.radiant.radiant.services.MainService;
import com.nebrora.radiant.radiant.services.SignInService;
import com.nebrora.radiant.radiant.services.SignUpService;
import com.nebrora.radiant.radiant.views.MainView;
import com.nebrora.radiant.radiant.views.SignInView;
import com.nebrora.radiant.radiant.views.SignUpView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SignInController {
    public SignInController(SignInService service, SignInView view) {
        view.getSignInButton().setOnAction(actionEvent -> {
            String username = view.getUsernameField().getText();
            String password = view.getPasswordField().getText();
            boolean result = service.signIn(username,password);
            if (result){
                MainView mainView = new MainView();
                MainService mainService = new MainService();
                MainController controller = new MainController(mainService, mainView);
                Stage stage = (Stage) view.getScene().getWindow();
                stage.setScene(new Scene(mainView));
                stage.show();
            }
        });
        view.getSignUpButton().setOnAction(actionEvent -> {
            SignUpView signUpView = new SignUpView();
            SignUpService signUpService = new SignUpService();
            SignUpController controller = new SignUpController(signUpService, signUpView);
            Stage stage = (Stage) view.getScene().getWindow();
            stage.setScene(new Scene(signUpView));
            stage.show();
        });
    }
}

package com.nebrora.radiant.radiant.views;

import com.nebrora.radiant.radiant.components.EjButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class SignInView extends VBox {
    private final TextField usernameField;
    private final TextField passwordField;
    private final EjButton signInButton;
    private final EjButton signUpButton;

    public SignInView() {
        setPadding(new Insets(10, 10, 10, 10));
        setStyle("-fx-background-color: white");
        setSpacing(10);
        usernameField = new TextField();
        passwordField = new TextField();
        signInButton = new EjButton("Войти");
        signUpButton = new EjButton("Регистрация");
        setAlignment(Pos.CENTER);
        getChildren().add(new Text("Логин или e-mail"));
        getChildren().add(usernameField);
        getChildren().add(new Text("Пароль"));
        getChildren().add(passwordField);
        getChildren().add(signInButton);
        getChildren().add(signUpButton);
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public Button getSignInButton() {
        return signInButton;
    }

    public Button getSignUpButton() {
        return signUpButton;
    }
}

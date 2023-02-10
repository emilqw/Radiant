package com.nebrora.radiant.radiant.views;

import com.nebrora.radiant.radiant.components.EjButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class SignUpView extends VBox {
    private final TextField fullNameField;
    private final TextField usernameField;
    private final TextField passwordField;
    private final TextField confirmPasswordField;
    private final EjButton signUpButton;
    private final EjButton signInButton;

    public SignUpView() {
        setPadding(new Insets(10, 10, 10, 10));
        setStyle("-fx-background-color: white");
        setSpacing(10);

        fullNameField = new TextField();
        usernameField = new TextField();
        passwordField = new TextField();
        confirmPasswordField = new TextField();
        signUpButton = new EjButton("Зарегистрироваться");
        signInButton = new EjButton("Вход");
        setAlignment(Pos.CENTER);
        getChildren().add(new Text("Ваше имя"));
        getChildren().add(fullNameField);
        getChildren().add(new Text("Логин или e-mail"));
        getChildren().add(usernameField);
        getChildren().add(new Text("Введите пароль"));
        getChildren().add(passwordField);
        getChildren().add(new Text("Введите пароль еще раз"));
        getChildren().add(confirmPasswordField);
        getChildren().add(signUpButton);
        getChildren().add(signInButton);
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

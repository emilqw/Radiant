package com.nebrora.radiant.radiant.components;

import javafx.scene.control.Button;

public class EjButton extends Button {

    public EjButton(String s) {
        super(s);
        String defaultStyle = "-fx-display: inline-block;\n" +
                "-fx-border-color: rgb(240, 47, 40);\n" +
                "-fx-border-width: 1px;\n" +
                "-fx-text-fill: rgb(240, 47, 40);\n" +
                "-fx-padding: 10px 10px;\n" +
                "-fx-background-color: white;\n" +
                "-fx-border-radius: 5px;\n" +
                "-fx-focus-color: transparent;" +
                "-fx-faint-focus-color: transparent;";
        String onMousePressed = "-fx-display: inline-block;\n" +
                "-fx-border-color: rgb(159,30,27);\n" +
                "-fx-border-width: 1px;\n" +
                "-fx-text-fill: white;\n" +
                "-fx-padding: 10px 10px;\n" +
                "-fx-background-color: rgb(159,30,27);\n" +
                "-fx-border-radius: 5px;\n" +
                "-fx-focus-color: transparent;" +
                "-fx-faint-focus-color: transparent;";
        String onMouseEntered = "-fx-display: inline-block;\n" +
                "-fx-border-color: rgb(240, 47, 40);\n" +
                "-fx-border-width: 1px;\n" +
                "-fx-text-fill: white;\n" +
                "-fx-padding: 10px 10px;\n" +
                "-fx-background-color: rgb(240, 47, 40);;\n" +
                "-fx-border-radius: 5px;\n" +
                "-fx-focus-color: transparent;" +
                "-fx-faint-focus-color: transparent;";
        setStyle(defaultStyle);
        setOnMousePressed(e -> setStyle(onMousePressed));//При нажатии
        setOnMouseReleased(e -> setStyle(onMouseEntered));
        setOnMouseEntered(e -> setStyle(onMouseEntered));//При наведении
        setOnMouseExited(e -> setStyle(defaultStyle));
    }

}

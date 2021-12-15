package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8;

    private int turno = 0;
    private String jugador;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        acciones();
    }

    private void calcularTurno() {
        if (turno%2==0) {
            jugador = "x";
        } else {
            jugador = "o";
        }
    }

    private void acciones() {
        boton0.setOnAction(new ManejoPulsacion());
        boton1.setOnAction(new ManejoPulsacion());
        boton2.setOnAction(new ManejoPulsacion());
        boton3.setOnAction(new ManejoPulsacion());
        boton4.setOnAction(new ManejoPulsacion());
        boton5.setOnAction(new ManejoPulsacion());
        boton6.setOnAction(new ManejoPulsacion());
        boton7.setOnAction(new ManejoPulsacion());
        boton8.setOnAction(new ManejoPulsacion());
    }

    class ManejoPulsacion implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            calcularTurno();
            if (event.getSource() == boton0) {
                if(jugador=="x"){
                    boton0.setTextFill(Color.RED);
                } else {
                    boton0.setTextFill(Color.BLUE);
                }
                boton0.setText(jugador);
            } else if (event.getSource() == boton1) {
                if(jugador=="x"){
                    boton1.setTextFill(Color.RED);
                } else {
                    boton1.setTextFill(Color.BLUE);
                }
                boton1.setText(jugador);
            } else if (event.getSource() == boton2) {
                if(jugador=="x"){
                    boton2.setTextFill(Color.RED);
                } else {
                    boton2.setTextFill(Color.BLUE);
                }
                boton2.setText(jugador);
            } else if (event.getSource() == boton3) {
                if(jugador=="x"){
                    boton3.setTextFill(Color.RED);
                } else {
                    boton3.setTextFill(Color.BLUE);
                }
                boton3.setText(jugador);
            } else if (event.getSource() == boton4) {
                if(jugador=="x"){
                    boton4.setTextFill(Color.RED);
                } else {
                    boton4.setTextFill(Color.BLUE);
                }
                boton4.setText(jugador);
            } else if (event.getSource() == boton5) {
                if(jugador=="x"){
                    boton5.setTextFill(Color.RED);
                } else {
                    boton5.setTextFill(Color.BLUE);
                }
                boton5.setText(jugador);
            } else if (event.getSource() == boton6) {
                if(jugador=="x"){
                    boton6.setTextFill(Color.RED);
                } else {
                    boton6.setTextFill(Color.BLUE);
                }
                boton6.setText(jugador);
            } else if (event.getSource() == boton7) {
                if(jugador=="x"){
                    boton7.setTextFill(Color.RED);
                } else {
                    boton7.setTextFill(Color.BLUE);
                }
                boton7.setText(jugador);
            } else if (event.getSource() == boton8) {
                if(jugador=="x"){
                    boton8.setTextFill(Color.RED);
                } else {
                    boton8.setTextFill(Color.BLUE);
                }
                boton8.setText(jugador);
            }
            turno++;
        }

        void ComprobarGanador() {
            if(boton0.getText()=="x" && boton1.getText()=="x" && boton2.getText()=="x") {
                //boton0.setStyle(-fx-background-color: red);
                boton1.setStyle("-fx-background-color: red;");
                boton2.setStyle("-fx-background-color: red;");
            }
        }
    }
}
package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Controller {

    @FXML
    private TextArea textArea;

    @FXML
    private Button helloWorld;

    @FXML
    private Button getTime;

    @FXML
    private Button diceRoll;


    @FXML
    void rollDice(ActionEvent event) {

        textArea.appendText(String.valueOf((int) (Math.random()*6)+1)+"\n");



    }

    @FXML
    void showTime(ActionEvent event) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss\n");
        LocalDateTime now = LocalDateTime.now();
        textArea.appendText(dtf.format(now));


    }

    @FXML
    void writeHelloWorld(ActionEvent event) {
       textArea.appendText("Hello World\n");

    }

}

package gui.viewsandcontrollers.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label label;

    public void initialize() {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Hola Mundo");
    }
}
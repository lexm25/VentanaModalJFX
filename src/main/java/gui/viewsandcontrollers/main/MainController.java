package gui.viewsandcontrollers.main;

import java.io.IOException;

import gui.viewsandcontrollers.segundaventana.SegundaVentanaController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Label label;

    public void initialize() {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
        Parent root = FXMLLoader.load(
            SegundaVentanaController.class.getResource("../segundaventana/SegundaVentana.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Ventana Modal");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
            ((Node)event.getSource()).getScene().getWindow() );
        stage.show();
    }
}
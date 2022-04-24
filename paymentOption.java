package sample;

import com.sun.scenario.effect.Effect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class paymentOption {

    @FXML
    public Label labelCashOnDelivery;
    @FXML
    public Button bkash;

    @FXML
    public Button cashOnDelivery;

    @FXML
    public Label label;


    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void on_click_btn_payWithBkash(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("paymentWithBkash.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void on_click_btn_cashOnDelivery(ActionEvent actionEvent){
        labelCashOnDelivery.setText("Your payment will be done via cash on Delivery.");
    }
}

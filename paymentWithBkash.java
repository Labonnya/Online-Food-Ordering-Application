package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class paymentWithBkash {
    @FXML
    public TextField textField;
    @FXML
    public TextField textField1;
    @FXML
    public Label label;
    @FXML
    public Label label1;
    @FXML
    public Button payNow;
    @FXML
    public Label labelBkash;
    @FXML
    public Label title;


    public void on_click_btn_payNow(javafx.event.ActionEvent actionEvent) {
        label.setText("Enter your phone number: ");
        textField.getText();
        label1.setText("Enter your pin number:");
        textField1.getText();
        labelBkash.setText("Your payment with bkash is successful.");
    }
}

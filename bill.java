package sample;

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
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class bill {
    @FXML
    public Label total;
    @FXML
    public Label totalBill;
    @FXML
    public Button calculate;
    @FXML
    public Button payment;

    public int readDataFromFile() {
        File f = new File("information.txt");
        int totalBill = 0;
        String line = null;
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                totalBill += Integer.parseInt(line);
                //System.out.println(totalBill);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        total.setText("Your bill is: " + totalBill + " taka");
        return totalBill;
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void on_click_btn_payment(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("paymentOption.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}

package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class menuPage {
    @FXML
    public Label menu;
    @FXML
    public Button sortedMenu;
    @FXML
    public Button nonDuplicateMenu;
    @FXML
    public Button order;
    private Stage stage;
    private Scene scene;
    private Parent root;
        @FXML
        public void on_click_btn_duplicateMenuRemove(javafx.event.ActionEvent event) throws IOException {
            root = FXMLLoader.load(getClass().getResource("menuDuplicateRemove.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    @FXML
    public void on_click_btn_order(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void on_click_btn_sortedMenu(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menuSort.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    }




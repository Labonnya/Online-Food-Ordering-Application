package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class menuSort {
    @FXML
    public Label label;
    @FXML
    public Button seeMenu;
    @FXML
    public Button order;
    @FXML
    public Label title;

    private Stage stage;
    private Scene scene;
    private Parent root;


   private static final String foodItems[]={"pizza","burger","pasta","pasta","burger","pizza","chicken fry","french fry"};
   public menuSort() {
       List<String> list = Arrays.asList(foodItems);
   }
    public void on_click_btn_seeMenu(javafx.event.ActionEvent actionEvent) {
        List<String> list = Arrays.asList(foodItems);
        SortedSet<String> set = new TreeSet<String>(list);
        System.out.println(set);
        label.setText(" "+set+"\n");
    }
    @FXML
    public void switchToMenu(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}

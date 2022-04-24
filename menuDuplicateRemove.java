package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class menuDuplicateRemove {
    @FXML
    public Label label1;
    @FXML
    public Label label2;
    @FXML
    public Label label3;
    @FXML
    public Label label4;
    @FXML
    public Label label5;
    @FXML
    public Label label;
    @FXML
    public Button seeMenu;
    @FXML
    public Button order;
    private Stage stage;
    private Scene scene;
    private Parent root;

    private static final String foodItems[]={"pizza","burger","pasta","pasta","burger","pizza","chicken fry","french fry"};
  public menuDuplicateRemove(){
        List<String> list = Arrays.asList(foodItems);
   }

    public void printNonDuplicateList(ActionEvent actionEvent) {
        List<String> list = Arrays.asList(foodItems);
        Set<String> set = new HashSet<String>(list);
        label.setText(" "+set+"\n");
    }
    @FXML
    public void on_click_btn_order(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
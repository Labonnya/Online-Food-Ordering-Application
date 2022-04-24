package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class menu {
    private Stage stage;
    private Scene scene;
    private Parent root;
@FXML
    public Label menu;
    @FXML
    public Label pizza;
    @FXML
    public Label burger;
    @FXML
    public Label pasta;
    @FXML
    public Label chickenFry;
    @FXML
    public Label frenchFry;
    @FXML
    public TextField item;
    @FXML
    public ListView<String> selectedItem;
    @FXML
    public Button add;
    @FXML
            public Button checkOut;
    StringBuilder sb = new StringBuilder();

    public void addName(ActionEvent actionEvent) {
        selectedItem.getItems().add(item.getText());
        //sb.append(item.getText().toString()+"\n");
        if(item.getText().equals("pizza")){
            sb.append(700+"\n");
        }
        if(item.getText().equals("pasta")){
            sb.append(400+"\n");
        }
        if(item.getText().equals("burger")){
            sb.append(350+"\n");
        }
        if(item.getText().equals("chicken fry")){
            sb.append(200+"\n");
        }
        if(item.getText().equals("french fry")){
            sb.append(80+"\n");
        }
        File f = new File("information.txt");
        try {
            FileWriter fw = new FileWriter(f);
            fw.append(sb.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void switchToBIll(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("bill.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

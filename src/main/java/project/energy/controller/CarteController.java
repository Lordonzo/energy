package project.energy.controller;

import com.gluonhq.maps.MapView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import project.energy.App;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class CarteController implements Initializable {
    @FXML
    private VBox pane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private void openSimu(){
        try {
            FXMLLoader loader =  new FXMLLoader(App.class.getResource("simuWindow.fxml"));
            Stage stage = (Stage) pane.getScene().getWindow();
            double height = stage.getHeight();
            double width = stage.getWidth();
            Scene scene = new Scene(loader.load(), width, height);
            stage.setTitle("Simulateur du coût de l'intallation");
            scene.getStylesheets().addAll(Objects.requireNonNull(App.class.getResource("css/simu.css")).toExternalForm());
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void openEdu(){
        try {
            FXMLLoader loader =  new FXMLLoader(App.class.getResource("eduWindow.fxml"));
            Stage stage = (Stage) pane.getScene().getWindow();
            double height = stage.getHeight();
            double width = stage.getWidth();
            Scene scene = new Scene(loader.load(), width, height);
            stage.setTitle("Carte des énergies par zone géographique");
            scene.getStylesheets().addAll(Objects.requireNonNull(App.class.getResource("css/edu.css")).toExternalForm());
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void openAccueil(){
        try {
            FXMLLoader loader =  new FXMLLoader(App.class.getResource("menu.fxml"));
            Stage stage = (Stage) pane.getScene().getWindow();
            double height = stage.getHeight();
            double width = stage.getWidth();
            Scene scene = new Scene(loader.load(), width, height);
            stage.setTitle("Plateforme éducative");
            scene.getStylesheets().addAll(Objects.requireNonNull(App.class.getResource("css/style.css")).toExternalForm());
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

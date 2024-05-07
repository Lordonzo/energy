package project.energy.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import project.energy.App;

import java.util.Objects;

public class MenuController {

    @FXML
    private Button simuButton ;

    @FXML
    private Button carteButton ;

    @FXML
    private Button eduButton ;


    public void initialize(){
    }

    public void openSimu(){
        try {
            FXMLLoader loader =  new FXMLLoader(App.class.getResource("simuWindow.fxml"));
            Stage stage = (Stage) simuButton.getScene().getWindow();
            double height = stage.getHeight();
            double width = stage.getWidth();
            Scene scene = new Scene(loader.load(), width, height);
            stage.setTitle("Simulateur du coût de l'intallation");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void openCarte(){
        try {
            FXMLLoader loader =  new FXMLLoader(App.class.getResource("carteWindow.fxml"));
            Stage stage = (Stage) carteButton.getScene().getWindow();
            double height = stage.getHeight();
            double width = stage.getWidth();
            Scene scene = new Scene(loader.load(), width, height);
            stage.setTitle("Carte des énergies par zone géographique");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void openEdu(){
        try {
            FXMLLoader loader =  new FXMLLoader(App.class.getResource("eduWindow.fxml"));
            Stage stage = (Stage) eduButton.getScene().getWindow();
            double height = stage.getHeight();
            double width = stage.getWidth();
            Scene scene = new Scene(loader.load(), width, height);
            scene.getStylesheets().addAll(Objects.requireNonNull(App.class.getResource("css/edu.css")).toExternalForm());
            stage.setTitle("Plateforme éducative");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

package project.energy.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private Button simuButton ;

    @FXML
    private Button carteButton ;

    @FXML
    private Button eduButton ;


    public void initialize(){
        simuButton.setOnAction(e -> openSimu());
        simuButton.setOnAction(e -> openCarte());
        simuButton.setOnAction(e -> openEdu());
    }

    public void openSimu(){
        try {
            FXMLLoader loader =  new FXMLLoader(getClass().getResource("simuWindow.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setTitle("Simulateur du coût de l'intallation");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void openCarte(){
        try {
            FXMLLoader loader =  new FXMLLoader(getClass().getResource("carteWindow.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setTitle("Carte des énergies par zone géographique");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void openEdu(){
        try {
            FXMLLoader loader =  new FXMLLoader(getClass().getResource("eduWindow.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setTitle("Plateforme éducative");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

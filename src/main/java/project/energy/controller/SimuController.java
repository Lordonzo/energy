package project.energy.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import project.energy.App;

import java.util.Objects;

public class SimuController {

    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu exit;
    @FXML
    private Label energyLabel;
    @FXML
    private ComboBox<String> energyType;
    @FXML
    private Label surfaceLabel;
    @FXML
    private TextField surfaceTextField;
    @FXML
    private Label consommationLabel;
    @FXML
    private TextField consommationTextField;
    @FXML
    private Button calculerButton;
    @FXML
    private Label resultatLabel;
    @FXML
    private TextField resultatTextField;

    @FXML
    public void initialize() {
        energyType.getItems().addAll("Solaire", "Eolienne", "Hydraulique");
    }

    private void openWindow(String fxmlFile, String title, String style) {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource(fxmlFile));
            Stage stage = (Stage) menuBar.getScene().getWindow(); // Assuming menuBar is always instantiated
            double height = stage.getHeight();
            double width = stage.getWidth();
            Scene scene = new Scene(loader.load(), 1200, 630);
            scene.getStylesheets().addAll(Objects.requireNonNull(App.class.getResource(style)).toExternalForm());
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openEdu() {
        openWindow("eduWindow.fxml", "Plateforme éducative","css/edu.css");
    }

    @FXML
    public void openCarte() {
        openWindow("carteWindow.fxml", "Carte des énergies par zone géographique","css/simu.css");
    }

    @FXML
    public void openAccueil() {
        openWindow("menu.fxml", "Page d'accueil","css/style.css");
    }
}

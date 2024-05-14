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

    @FXML
    protected void doCalculation() {
        String type = energyType.getValue();
        Double surface = Double.parseDouble(surfaceTextField.getText());
        Double consommation = Double.parseDouble(consommationTextField.getText());
        Double resultat = 0.0;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        switch (type) {
            case "Solaire":
                Double puissanceS = consommation/120; //120 = 30 x 4h d'ensolleiment moyen en France
                alert.setTitle("Solaire");
                if (surface < puissanceS * 7) {
                    System.out.println(puissanceS);
                    //7 m² par kw (surface necessaire)
                    alert.setContentText("Surface insuffisante");
                    alert.showAndWait();
                }
                resultat = puissanceS * 1500; //1500 euros par kwh
                //installation d'un seul panneau solaire
                resultatTextField.setText(Double.toString(resultat));
                break;
            case "Hydraulique":
                alert.setTitle("Hydraulique");
                Double puissanceH =  consommation/720; //car 30x24 heures dans 1 mois
                if (puissanceH > 15) { //car 10 kw de puissance disponible en moyenne en France
                    alert.setContentText("Puissance disponible moyenne insuffisante");
                    alert.showAndWait();
                } else if (surface < 1000) { //car il faut 1000 m² de moyenne pour une petite infrastructure
                    alert.setContentText("Surface insuffisante");
                    alert.showAndWait();
                }
                resultat = puissanceH * 3000; //pour 3000 euros par kw necessaire
                resultatTextField.setText(Double.toString(resultat));
                break;
            case "Eolienne":
                Double puissanceE = consommation/720; //720h dans le mois
                Double puissance_unitaire = 5.0;
                Double nb = (puissanceE / puissance_unitaire);
                alert.setTitle("Eolienne");
                if (surface < nb * 500) { //500 m² pour une eolienne
                    alert.setContentText("Surface insuffisante");
                    alert.showAndWait();
                } else if (puissanceE > nb * puissance_unitaire) {
                    alert.setContentText("Puissance disponible moyenne insuffisante");
                    alert.showAndWait();
                }
                resultat = nb * 4000; //4000 euros d'installation pour 1 eolienne
                resultatTextField.setText(Double.toString(resultat));
                break;
        }
    }
}

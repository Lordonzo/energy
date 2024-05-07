package project.energy.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

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



    public SimuController() {
        menuBar = new MenuBar();
        exit = new Menu();
        energyLabel = new Label();
        surfaceLabel = new Label();
        surfaceTextField = new TextField();
        consommationLabel = new Label();
        consommationTextField = new TextField();
        resultatLabel = new Label();
        resultatTextField = new TextField();
        calculerButton = new Button();
    }

    public void initialize() {
        energyType = new ComboBox<>();
        energyType.getItems().addAll("Solaire","Eolienne","Hydraulique");
    }
}

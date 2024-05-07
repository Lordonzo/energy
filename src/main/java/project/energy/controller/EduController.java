package project.energy.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import project.energy.App;

public class EduController {
    @FXML
    public Button quiz ;

    @FXML
    public Label solText ;

    @FXML
    public Label eolText ;

    @FXML
    public Label hydText ;

    public void initialize(){
        solText.setText("L'énergie solaire est produite en convertissant la lumière du soleil en électricité ou en chaleur. Les panneaux solaires photovoltaïques sont les dispositifs les plus courants pour la conversion de la lumière solaire en électricité. Ces panneaux contiennent des cellules photovoltaïques qui absorbent la lumière du soleil et la convertissent en courant électrique continu. Ensuite, un onduleur transforme ce courant continu en courant alternatif utilisable dans les foyers et les industries. L'énergie solaire est une source d'énergie renouvelable et propre.");
        eolText.setText("L'énergie éolienne est générée en capturant le mouvement de l'air à l'aide de turbines éoliennes. Ces turbines sont équipées de grandes pales qui tournent lorsque le vent souffle. Le mouvement des pales fait tourner un générateur qui produit de l'électricité. Plus la vitesse du vent est élevée, plus la production d'électricité est importante. Les parcs éoliens sont généralement situés dans des zones où le vent est constant et fort. L'énergie éolienne est également une source d'énergie renouvelable et respectueuse de l'environnement.");
        hydText.setText("L'énergie hydraulique est produite à partir de la force de l'eau en mouvement, généralement à partir de chutes d'eau ou de cours d'eau. Dans une centrale hydraulique, l'eau est stockée dans un réservoir et libérée à travers des turbines. L'énergie cinétique de l'eau en mouvement fait tourner les turbines, qui alimentent ensuite des générateurs pour produire de l'électricité. Les centrales hydrauliques peuvent être de grande taille, comme les barrages, ou de petite taille, comme les microcentrales hydrauliques. L'énergie hydraulique est une source d'énergie renouvelable et durable, mais la construction de barrages peut avoir un impact sur l'écosystème fluvial et la vie aquatique.");
    }
    @FXML
    public void openSimu(){
        try {
            FXMLLoader loader =  new FXMLLoader(App.class.getResource("simuWindow.fxml"));
            Stage stage = (Stage) quiz.getScene().getWindow();
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
@FXML
    public void openCarte(){
        try {
            FXMLLoader loader =  new FXMLLoader(App.class.getResource("carteWindow.fxml"));
            Stage stage = (Stage) quiz.getScene().getWindow();
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
    @FXML
    public void openAccueil(){
        try {
            FXMLLoader loader =  new FXMLLoader(App.class.getResource("menu.fxml"));
            Stage stage = (Stage) quiz.getScene().getWindow();
            double height = stage.getHeight();
            double width = stage.getWidth();
            Scene scene = new Scene(loader.load(), width, height);
            stage.setTitle("Plateforme éducative");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

package project.energy.controller;

import com.gluonhq.maps.MapView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import project.energy.App;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class CarteController implements Initializable {
    @FXML
    private AnchorPane root;
    @FXML
    private ImageView franceImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        franceImageView.setFitWidth(960);
    }

    private MapView createMapView() {
        MapView mapView = new MapView();
        return mapView;
    }

    @FXML
    private void inColor() {
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setContrast(20);
        franceImageView.setEffect(colorAdjust);
    }

    @FXML
    private void outColor() {
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setContrast(0);
        franceImageView.setEffect(colorAdjust);
    }
}

module project.energy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens project.energy to javafx.fxml;
    exports project.energy;
    exports project.energy.controller;
    opens project.energy.controller to javafx.fxml;
}
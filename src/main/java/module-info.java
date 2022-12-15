module hr.algebra.progi.restaurantmanagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens hr.algebra.progi.restaurantmanagement to javafx.fxml;
    exports hr.algebra.progi.restaurantmanagement;
}
module OpenJFXInterfaz.guiFx {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;

    opens OpenJFXInterfaz.guiFx to javafx.fxml;
    exports OpenJFXInterfaz.guiFx;
}
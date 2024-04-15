module co.uniquindio.proyectotaquillera {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.uniquindio.proyectotaquillera to javafx.fxml;
    exports co.uniquindio.proyectotaquillera;
}
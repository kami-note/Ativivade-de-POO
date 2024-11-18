module com.kryprforge.atividade {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kryprforge.atividade7 to javafx.fxml;
    exports com.kryprforge.atividade7;
}
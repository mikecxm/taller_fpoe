module com.example.sesion8cop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sesion8cop to javafx.fxml;
    exports com.example.sesion8cop;
}
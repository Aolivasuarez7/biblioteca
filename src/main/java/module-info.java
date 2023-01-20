module com.biblio.biblioteca {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.biblio.biblioteca to javafx.fxml;
    exports com.biblio.biblioteca;
}
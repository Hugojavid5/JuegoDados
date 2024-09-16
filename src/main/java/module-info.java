module org.example.juego {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.juego to javafx.fxml;
    exports org.example.juego;
}
module com.chess.chesssimulator {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.chess.chesssimulator to javafx.fxml;
    exports com.chess.chesssimulator;
}
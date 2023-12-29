module com.example.dealerhonda {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.dealerhonda to javafx.fxml;
    exports com.example.dealerhonda;
}
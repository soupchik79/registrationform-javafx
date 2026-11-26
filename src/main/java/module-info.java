module org.example.registration_form {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.registration_form to javafx.fxml;
    exports org.example.registration_form;
}
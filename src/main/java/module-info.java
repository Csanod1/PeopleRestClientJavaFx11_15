module hu.petrik.peoplerestclientjavafx11_15 {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.peoplerestclientjavafx11_15 to javafx.fxml;
    exports hu.petrik.peoplerestclientjavafx11_15;
}
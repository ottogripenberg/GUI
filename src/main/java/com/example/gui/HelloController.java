package com.example.gui;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TableView<StudentsModel> tableView;

    @FXML
    private TableColumn<StudentsModel, String> tableColumn = new TableColumn<>();

    public class StudentsModel {
        String name;
        private StringProperty firstName = new SimpleStringProperty();

        public StudentsModel(String name) {
            this.name = name;
        }

        public StringProperty firstNameProperty() {
            return firstName;
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonPress() {
        welcomeText.setText("NOT WELCOME to JavaFX Application!");
    }
}
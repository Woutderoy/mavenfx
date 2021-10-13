package nl.inholland.javafx.UI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import nl.inholland.javafx.data.Database;
import nl.inholland.javafx.models.Admin;
import nl.inholland.javafx.models.Customer;
import nl.inholland.javafx.models.User;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class loginWindow {
    private Stage stage;
    private Database db = new Database();

    public Stage getStage() {
        return stage;
    }

    public loginWindow() {
        stage = new Stage();

        ObservableList<User> users = FXCollections.observableArrayList(db.getUsers());

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Label userNameLabel = new Label("Username:");
        GridPane.setConstraints(userNameLabel, 0, 0);

        TextField userNameField = new TextField();
        userNameField.setPromptText("Username...");
        GridPane.setConstraints(userNameField, 1, 0);

        Label passWordLabel = new Label("Password: ");
        GridPane.setConstraints(passWordLabel, 0, 1);

        PasswordField passWorldField = new PasswordField();
        GridPane.setConstraints(passWorldField, 1, 1);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 0, 2);

        Label errorText = new Label();
        errorText.setPrefWidth(60);
        GridPane.setConstraints(errorText, 0, 3);

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(checkForUser(users, userNameField.getText(), passWorldField.getText())){
                    errorText.setText("You are in!");
                }
        }});

        gridPane.getChildren().addAll(userNameLabel, userNameField, passWordLabel, passWorldField, loginButton, errorText);

        Scene scene = new Scene(gridPane);

        stage.setTitle("Fabulous Cinema -- Login");
        stage.setScene(scene);

    }

    private static boolean checkForUser(List<User> users, String username, String password){
            for (User user : users) {
                if (user.getUserName().equals(username)) {
                    if(user.getPassWord().equals(password)){
                        return true;
                    }
                }
            }
        return false;
    }
}

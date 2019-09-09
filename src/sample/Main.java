package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    private Button btnLogin;
    private Text title;
    @Override
    public void start(Stage stage) throws Exception{
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25, 25, 25, 25));

        title = new Text("Welcome");
        title.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        pane.add(title, 0, 0, 2, 1);

        Label lblUsername = new Label("Username:");
        pane.add(lblUsername, 0, 1);

        TextField txtUsername = new TextField();
        pane.add(txtUsername, 1, 1);

        Label lblPassword = new Label("Password");
        pane.add(lblPassword, 0, 2);

        PasswordField txtPassword = new PasswordField();
        pane.add(txtPassword, 1, 2);

        btnLogin = new Button("Login");
        btnLogin.setOnAction(this);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(btnLogin);
        pane.add(hbox, 1, 4);

        Scene scene = new Scene(pane, 300, 275);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource()==btnLogin){
            title.setText("TEST");
        }
    }
}

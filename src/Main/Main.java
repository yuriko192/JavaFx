package Main;

import Main.Resources.GlobalVar;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    //hotelnya  lantai dari 2 sampe 7
    public static Stage mainstage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        mainstage = stage;
        new GlobalVar();
    }

}


/*
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
         */
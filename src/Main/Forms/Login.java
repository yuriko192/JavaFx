package Main.Forms;

import Main.Main;
import Main.Resources.GlobalVar;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;


public class Login extends GridPane implements EventHandler<ActionEvent> {
    private TextField txtUsername;
    private PasswordField txtPassword;
    private Button btnLogin;

    public Login() {
        super();
        this.setHgap(10);
        this.setVgap(10);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(25, 25, 25, 25));


        ImageView LogoHotel = new ImageView("Assets/Logo.png");
        LogoHotel.setPreserveRatio(true);
        LogoHotel.setFitWidth(170);
        HBox x = new HBox(LogoHotel);
        x.setPrefWidth(200);
        x.setAlignment(Pos.CENTER);
        this.add(x, 0, 0);

        Label lbUsername = new Label("Username");
        this.add(lbUsername, 0, 1);
        txtUsername = new TextField();
        this.add(txtUsername, 0, 2);

        Label lbPassword = new Label("Password");
        this.add(lbPassword, 0, 4);
        txtPassword = new PasswordField();
        this.add(txtPassword, 0, 5);

        btnLogin = new Button("Login");
        HBox login_cont = new HBox();
        login_cont.setAlignment(Pos.CENTER_RIGHT);
        login_cont.getChildren().add(btnLogin);
        btnLogin.setOnAction(this);

        this.add(login_cont, 0, 6);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        //if (txtUsername.getText().equals("1")) {
        if (true) {
            Main.mainstage.hide();
            GlobalVar.fun_MainMenu.handle(actionEvent);
            Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
            Main.mainstage.setX((primScreenBounds.getWidth() - GlobalVar.WIDTH) / 2);
            Main.mainstage.setY((primScreenBounds.getHeight() - GlobalVar.HEIGHT) / 2 - 20);
            Main.mainstage.show();
        } else {
            Alert x = new Alert(Alert.AlertType.ERROR);
            x.setTitle("Invalid");
            x.setHeaderText("Invalid Credentials");
            x.setContentText("Wrong username or password");
            x.showAndWait();
        }
    }
}

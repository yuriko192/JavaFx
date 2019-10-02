package Main.Forms;

import Main.Resources.GlobalVar;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Reservation extends WindowBase implements EventHandler<ActionEvent> {
    public static TextField kodebooking;

    public Reservation() {
        super();
        GridPane MainPane = new GridPane();
        MainPane.setAlignment(Pos.CENTER);
        MainPane.setHgap(30);
        MainPane.setVgap(10);

        kodebooking = new TextField();
        kodebooking.setEditable(false);
        kodebooking.setMaxWidth(250);
        MainPane.add(new Label("Booking Number:"), 0, 0);
        MainPane.add(kodebooking, 1, 0);

        TextField namalengkap = new TextField();
        namalengkap.setPrefWidth(500);
        MainPane.add(new Label("Guest Name :"), 0, 1);
        MainPane.add(namalengkap, 1, 1);

        TextField nomorktp = new TextField();
        MainPane.add(new Label("Identity Number :"), 0, 2);
        MainPane.add(nomorktp, 1, 2);

        TextField nomorkamar = new TextField();
        MainPane.add(new Label("Room Number :"), 0, 3);
        MainPane.add(nomorkamar, 1, 3);

        TextField sistembayar = new TextField();
        MainPane.add(new Label("Payment Details:"), 0, 4);
        MainPane.add(sistembayar, 1, 4);

        TextField harga = new TextField();
        MainPane.add(new Label("Price :"), 0, 6);
        MainPane.add(harga, 1, 6);

        Button button = new Button("...");
        button.setOnAction(this);
        MainPane.add(button, 1, 5);

        HBox bottCont = new HBox();
        bottCont.setAlignment(Pos.BOTTOM_RIGHT);
        Button button2 = new Button("Check In");
        button2.setOnAction(GlobalVar.fun_MainMenu);
        bottCont.getChildren().add(button2);
        MainPane.add(bottCont, 1, 7);

        this.setCenter(MainPane);
    }

    public static void update(String Res_Number) {
        kodebooking.setText(Res_Number);

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert x = new Alert(Alert.AlertType.INFORMATION);
        x.setTitle("Details");
        x.setHeaderText("Payment Details");
        x.setContentText("Payment Details Here");
        x.show();
    }
}

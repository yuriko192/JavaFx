package Main.Forms;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Reservation extends WindowBase {
    public Reservation() {
        super();
        TextField kodebooking = new TextField();
        this.add(new Label("Booking Number:"), 1, 0);
        this.add(kodebooking, 2, 0);

        TextField namalengkap = new TextField();
        this.add(new Label("Guest Name :"), 1, 1);
        this.add(namalengkap, 2, 1);

        TextField nomorktp = new TextField();
        this.add(new Label("Identity Number :"), 1, 2);
        this.add(nomorktp, 2, 2);

        TextField nomorkamar = new TextField();
        this.add(new Label("Room Number :"), 1, 3);
        this.add(nomorkamar, 2, 3);

        TextField sistembayar = new TextField();
        this.add(new Label("Payment Details:"), 1, 4);
        this.add(sistembayar, 2, 4);

        TextField harga = new TextField();
        this.add(new Label("Price :"), 1, 6);
        this.add(harga, 2, 6);

        Button button = new Button("...");
        this.add(button, 3, 5);


    }
}

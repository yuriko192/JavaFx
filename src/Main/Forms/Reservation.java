package Main.Forms;

import javafx.scene.control.Label;

public class Reservation extends WindowBase {
    public Reservation() {
        super();
        Label Bnum_lab = new Label("Booking Number:");
        this.add(Bnum_lab,1,1);
        Label Guest_n_lab = new Label("Guest Name:");
        this.add(Guest_n_lab,1,2);
        Label Room_lab = new Label("Room Number:");
        this.add(Room_lab,1,3);
        Label Payment_lab = new Label("Pament Details:");
        this.add(Payment_lab,1,4);
        Label Price_lab = new Label("Room Price:");
        this.add(Price_lab,1,5);


    }
}

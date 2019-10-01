package Main.Forms;

import Main.Resources.GlobalVar;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Rooms extends WindowBase {
    private static Label lbNomorRuangan, lbKondisi;
    private static ImageView Room_Logo, PreviewKamar;

    public Rooms() {
        super();
        //==============Logo dan Nomor Kamar==========
        HBox hbox1 = new HBox();
        hbox1.setAlignment(Pos.CENTER);
        Room_Logo = new ImageView();
        Room_Logo.setPreserveRatio(true);
        Room_Logo.setFitWidth(30);
        hbox1.getChildren().add(Room_Logo);
        lbNomorRuangan = new Label();
        lbNomorRuangan.setFont(Font.font("Tahoma", FontWeight.BOLD, 25));
        hbox1.getChildren().add(lbNomorRuangan);
        this.add(hbox1, 1, 1);
        //************Image View Preview Kamar*************
        PreviewKamar = new ImageView();
        PreviewKamar.setFitWidth(200);
        PreviewKamar.setFitHeight(105);
        this.add(PreviewKamar, 1, 2);
        //*************************************************
        //==============Middle Content===============
        VBox vbox2 = new VBox();

        lbKondisi = new Label("Room Available");
        lbKondisi.setFont(Font.font("Tahoma", FontWeight.BOLD, 30));
        vbox2.getChildren().add(lbKondisi);

        Label lbDeskripsiKamar = new Label("Deskripsi Kamar");
        lbDeskripsiKamar.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
        vbox2.getChildren().add(lbDeskripsiKamar);

        this.add(vbox2, 2, 1, 1, 2);
        //============================================
        VBox vbox3 = new VBox();
        vbox3.setAlignment(Pos.BOTTOM_CENTER);

        Label lbHarga = new Label("Harga");
        lbHarga.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        vbox3.getChildren().add(lbHarga);

        VBox vbox4 = new VBox();

        Label lbCheckIn = new Label("Check In");
        lbCheckIn.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        Label lbCheckOut = new Label("Check Out");
        lbCheckOut.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        Label lbTimeLeft = new Label("Time Left");
        lbTimeLeft.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));

        vbox4.getChildren().add(lbCheckIn);
        vbox4.getChildren().add(lbCheckOut);
        vbox4.getChildren().add(lbTimeLeft);

        Button btnCheckInOut = new Button("Check In/Out");
        btnCheckInOut.setOnAction(GlobalVar.fun_Floorplan);
        btnCheckInOut.setPrefHeight(140);
        btnCheckInOut.setPrefWidth(180);

        vbox3.getChildren().add(vbox4);
        vbox3.getChildren().add(btnCheckInOut);

        this.add(vbox3, 3, 4, 1, 2);

    }

    public static void update(int Room_Number, int Room_Type) {
        lbNomorRuangan.setText("Kamar: " + Room_Number);
        switch (Room_Type) {
            case 1:
                PreviewKamar.setImage(GlobalVar.PImg_Deluxe);
                Room_Logo.setImage(GlobalVar.Img_Deluxe);
                break;
            case 2:
                PreviewKamar.setImage(GlobalVar.PImg_Suite);
                Room_Logo.setImage(GlobalVar.Img_Suite);
                break;
            case 3:
                PreviewKamar.setImage(GlobalVar.PImg_Pres);
                Room_Logo.setImage(GlobalVar.Img_Pres);
                break;
        }

    }

}

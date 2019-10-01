package Main.Resources;

import Main.Forms.*;
import Main.Main;
import Main.Resources.Handler.Functions.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class GlobalVar {
    public static Scene mainmenu, floorplan_S, Rooms_S, Reservation_s;
    public static final int HEIGHT = 680, WIDTH = 900;
    public static MainFunction fun_MainMenu, fun_Floorplan, fun_Information, fun_Services, fun_Reservation;
    public static String RoomNumber;
    public static Image Img_Pres, Img_Suite, Img_Deluxe, PImg_Pres, PImg_Suite, PImg_Deluxe;


    public GlobalVar() {
        Img_Deluxe = new Image("Assets/Deluxe.png");
        Img_Pres = new Image("Assets/Pres.png");
        Img_Suite = new Image("Assets/Suite.png");
        PImg_Deluxe = new Image("Assets/Deluxe.jpg");
        PImg_Pres = new Image("Assets/Pres.jpg");
        PImg_Suite = new Image("Assets/Suite.jpg");
        //==================================
        RoomNumber = "";
        fun_MainMenu = new GoToMainMenu();
        fun_Floorplan = new GoToFloorplan();
        fun_Information = new GoToInformation();
        fun_Services = new GoToServices();
        fun_Reservation = new GoToReservation();
        //========================================
        floorplan_S = new Scene(new FloorPlan(), WIDTH, HEIGHT);
        mainmenu = new Scene(new MainMenu(), WIDTH, HEIGHT);
        Rooms_S = new Scene(new Rooms(), WIDTH, HEIGHT);
        Reservation_s = new Scene(new Reservation(), WIDTH, HEIGHT);
        //========================================
        Main.mainstage.setScene(new Scene(new Login(), 300, 400));
        Main.mainstage.setTitle("Welcome");
        Main.mainstage.getIcons().add(new Image("Assets/Icon.png"));
        Main.mainstage.show();
        Main.mainstage.setResizable(false);
    }

    public static void formatButton(Button x) {
        x.setPrefWidth(150);
        x.setMinHeight(70);
    }


}
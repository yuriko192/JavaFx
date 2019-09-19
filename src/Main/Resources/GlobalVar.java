package Main.Resources;

import Main.Forms.*;
import Main.Main;
import Main.Resources.Handler.Functions.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class GlobalVar {
    public static Scene mainmenu, temp, floorplan_S, Rooms_S, Reservation_s;
    public static final int HEIGHT = 700, WIDTH = 900;
    public static MainFunction fun_MainMenu, fun_Rooms, fun_Information, fun_Services, fun_Reservation;
    public static String RoomNumber;

    public GlobalVar() {

        RoomNumber = "";
        fun_MainMenu = new GoToMainMenu();
        fun_Rooms = new GoToRooms();
        fun_Information = new GoToInformation();
        fun_Services = new GoToServices();
        fun_Reservation = new GoToReservation();
        //========================================
        floorplan_S = new Scene(new FloorPlan(), WIDTH, HEIGHT);
        temp = new Scene(new WindowBase(), WIDTH, HEIGHT);
        mainmenu = new Scene(new MainMenu(), WIDTH, HEIGHT);
        Rooms_S = new Scene(new Rooms(), WIDTH, HEIGHT);
        Reservation_s = new Scene(new Reservation(), WIDTH, HEIGHT);
        //========================================
        Main.mainstage.setScene(mainmenu);
        Main.mainstage.show();
        Main.mainstage.setResizable(false);
    }

    public static void formatButton(Button x) {
        x.setPrefWidth(150);
        x.setMinHeight(70);
    }

    public static void formatMainMenuButton(Button x) {
        x.setMinWidth(100);
        x.setMinHeight(50);
    }


}
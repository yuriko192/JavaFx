package Main.Resources;

import Main.Forms.FloorPlan;
import Main.Forms.MainMenu;
import Main.Forms.Rooms;
import Main.Forms.WindowBase;
import Main.Main;
import Main.Resources.Handler.GoToMainMenu;
import Main.Resources.Handler.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class GlobalVar {
    public static Scene mainmenu, temp, floorplan_S,Rooms_S;
    public static final int HEIGHT = 700, WIDTH = 900;
    public static MainFunction fun_MainMenu, fun_FloorPlan, fun_Rooms;
    public static String RoomNumber;

    public GlobalVar() {
        RoomNumber = "";
        fun_MainMenu = new GoToMainMenu();
        fun_FloorPlan = new GoToFloorPlan();
        fun_Rooms = new GoToRooms();
        //========================================
        floorplan_S = new Scene(new FloorPlan(),WIDTH,HEIGHT);
        temp = new Scene(new WindowBase(), WIDTH, HEIGHT);
        mainmenu = new Scene(new MainMenu(), WIDTH, HEIGHT);
        Rooms_S = new Scene(new Rooms(),WIDTH,HEIGHT);
        //========================================
        Main.mainstage.setScene(mainmenu);
        Main.mainstage.show();
        Main.mainstage.setResizable(false);
    }

    public static void formatButton(Button x) {
        x.setMinWidth(130);
        x.setMinHeight(50);
    }

    public static void formatMainMenuButton(Button x) {
        x.setMinWidth(100);
        x.setMinHeight(50);
    }


}
package Main.Resources;

import Main.Forms.FloorPlan;
import Main.Forms.MainMenu;
import Main.Forms.WindowBase;
import Main.Main;
import Main.Resources.Handler.GoToMainMenu;
import Main.Resources.Handler.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class GlobalVar {
    public static Scene mainmenu, temp, floorplan_S;
    public static final int HEIGHT = 700, WIDTH = 900;
    public static GoToMainMenu fun_MainMenu;

    public GlobalVar() {
        fun_MainMenu = new GoToMainMenu();
        //========================================
        floorplan_S = new Scene(new FloorPlan(),WIDTH,HEIGHT);
        temp = new Scene(new WindowBase(), WIDTH, HEIGHT);
        mainmenu = new Scene(new MainMenu(), WIDTH, HEIGHT);
        //========================================
        Main.mainstage.setScene(mainmenu);
        Main.mainstage.show();
    }

    public static void formatButton(Button x) {
        x.setMinWidth(130);
        x.setMinHeight(50);
    }

    public static void formatMainButton(Button x) {
        x.setMinWidth(100);
        x.setMinHeight(50);
    }

}
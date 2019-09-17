package Main.Forms;

import Main.Resources.GlobalVar;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class FloorPlan extends WindowBase{
    private final int FLOORS = 5;


    public FloorPlan() {
        super();
        //=========List Lantai====================
        //-----initialize scrollpanel-------
        ScrollPane floorList = new ScrollPane();
        floorList.setPrefWidth(130);
        floorList.setPrefHeight(GlobalVar.HEIGHT * 0.75);
        //------initialize button---------
        Button[] floorarr = new Button[FLOORS];
        for (int i = 0; i < FLOORS; i++) {
            floorarr[i] = new Button("Floor 0" + Integer.toString(i + 2));
            floorarr[i].setPrefWidth(128);
            floorarr[i].setPrefHeight(40);

        }
        //------initialize vbox--------
        VBox floors = new VBox();
        floors.setAlignment(Pos.CENTER);
        //------gabungin-------------
        floors.getChildren().addAll(floorarr);
        floorList.setContent(floors);
        this.add(floorList, 1, 3);
        //==========================================
        //--------------search area---------------
        TextField searchBar = new TextField();
        searchBar.setPrefWidth(130);
        this.add(searchBar, 1, 4);
        Button searchButton = new Button("Search");

        HBox searchArea = new HBox(10);
        searchArea.setAlignment(Pos.BASELINE_RIGHT);
        searchArea.getChildren().add(searchButton);
        this.add(searchArea, 1, 5);
        //============================================
        //----------list kamar--------------------
        ScrollPane listkamarContainer = new ScrollPane();
        listkamarContainer.setMinWidth(300);
        FlowPane listKamar = new FlowPane();
        //size isinya 273 * 100

        listkamarContainer.setContent(listKamar);
        this.add(listkamarContainer,2,1,3,6);
    }
}

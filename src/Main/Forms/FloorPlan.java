package Main.Forms;

import Main.Resources.GlobalVar;
import Main.Resources.Handler.Addons.RoomInfo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class FloorPlan extends WindowBase implements EventHandler<ActionEvent> {
    public static final int FLOORS = 6;
    public static final int ROOM_MAP[] = {10, 10, 10, 10, 5, 2};
    private VBox listKamar;
    private Button[] floorarr;
    public static HBox Rooms[][];

    public FloorPlan() {
        super();

        Rooms = new HBox[FLOORS][];
        for(int i=0;i<FLOORS;i++){
            Rooms[i] = new HBox[ROOM_MAP[i]];
            for(int ii=0;ii<ROOM_MAP[i];ii++){
                int temp;
                if(i<4){
                    temp = 1;
                }else{
                    temp = i-2;
                }
                Rooms[i][ii] = new RoomInfo((i+2)*100+ii+1, temp,1);
            }
        }

        //=========List Lantai====================
        //-----initialize scrollpanel-------
        ScrollPane floorList = new ScrollPane();
        floorList.setPrefWidth(130);
        floorList.setPrefHeight(GlobalVar.HEIGHT * 0.75);
        //------initialize button---------
        floorarr = new Button[FLOORS];
        for (int i = 0; i < FLOORS; i++) {
            floorarr[i] = new Button("Floor 0" + Integer.toString(i + 2));
            floorarr[i].setPrefWidth(128);
            floorarr[i].setPrefHeight(40);
            floorarr[i].setOnAction(this);
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
        listkamarContainer.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        listkamarContainer.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        listKamar = new VBox();

        listKamar.getChildren().setAll(Rooms[0]);
        listkamarContainer.setContent(listKamar);
        this.add(listkamarContainer, 2, 1, 3, 6);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Object x = actionEvent.getSource();
        for(int i=0;i<FLOORS;i++){
            if(x == floorarr[i]){
                listKamar.getChildren().setAll(Rooms[i]);
            }
        }
    }
}

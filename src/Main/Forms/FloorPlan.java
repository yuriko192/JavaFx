package Main.Forms;

import Main.Resources.GlobalVar;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class FloorPlan extends WindowBase{

    public FloorPlan() {
        super();

        ScrollPane floorList = new ScrollPane();
        floorList.setMinWidth(130);
        floorList.setPrefHeight(GlobalVar.HEIGHT*0.75);

        Button[] floorarr = new Button[5];
        for (int i=0;i<5;i++){
            floorarr[i] = new Button("Floor 0"+ Integer.toString(i+2));
            floorarr[i].setPrefWidth(120);
            floorarr[i].setPrefHeight(40);

        }

        VBox floors = new VBox();
        floors.setAlignment(Pos.CENTER);
        floors.getChildren().addAll(floorarr);
        floorList.setContent(floors);

        this.add(floorList,1,1);

    }
}

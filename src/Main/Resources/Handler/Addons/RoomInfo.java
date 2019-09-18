package Main.Resources.Handler.Addons;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class RoomInfo extends HBox {
    public RoomInfo() {
        super();
        this.setStyle("-fx-border-radius: 5;" + "-fx-border-color: blue;");
        this.setPrefWidth(500);
        this.setPrefHeight(100);
        this.setAlignment(Pos.CENTER);
        int x = 100;
        this.getChildren().add(new ImageView("Assets/Temp_Logo.png"));
        VBox infos = new VBox();

        HBox occupant= new HBox(), cond= new HBox(), roomnum = new HBox();
        roomnum.getChildren().add(new Label("Room Number:"));
        roomnum.getChildren().add(new Label(String.valueOf(x)));
        occupant.getChildren().add(new Label("Occupant:"));
        occupant.getChildren().add(new Label("-"));
        cond.getChildren().add(new Label("Condition:"));
        cond.getChildren().add(new Label("Ready"));

        infos.getChildren().addAll(roomnum,occupant,cond);
        this.getChildren().add(infos);

    }
}

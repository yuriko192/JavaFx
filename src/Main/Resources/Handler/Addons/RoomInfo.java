package Main.Resources.Handler.Addons;

import Main.Forms.Rooms;
import Main.Main;
import Main.Resources.GlobalVar;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class RoomInfo extends HBox implements EventHandler<MouseEvent> {
    private int Roomnum, RoomType;
    public RoomInfo(int Roomnum, int RoomType, String Occupant, int Cond) {
        //1 = clean, 2 = used, 3 = need cleaning
        // 1 = Deluxe, 2 = Suite, 3 = Presidental Suite
        super();
        this.Roomnum = Roomnum;
        this.RoomType = RoomType;
        ImageView Logo;
        Label roomcond;
        this.setStyle("-fx-border-radius: 5;" + "-fx-border-color: black;");
        this.setPrefWidth(500);
        this.setPrefHeight(100);
        this.setAlignment(Pos.CENTER_LEFT);
        int x = 100;

        if(RoomType==1){
            Logo = new ImageView("Assets/Deluxe.png");
        }else if(RoomType==2){
            Logo = new ImageView("Assets/Suite.png");
        }else{
            Logo = new ImageView("Assets/Pres.png");
        }
        if(Cond==1){
            roomcond = new Label("Ready");
        }else if(Cond==2){
            roomcond = new Label("Occupied");
        }else{
            roomcond = new Label("Dirty");
        }

        Logo.setPreserveRatio(true);
        Logo.setFitHeight(90);
        this.getChildren().add(Logo);

        VBox infos = new VBox();
        HBox occupant = new HBox(), cond = new HBox(), roomnum = new HBox();
        roomnum.getChildren().add(new Label("Room Number: "));
        roomnum.getChildren().add(new Label(String.valueOf(Roomnum)));
        occupant.getChildren().add(new Label("Occupant: "));
        occupant.getChildren().add(new Label(Occupant));
        cond.getChildren().add(new Label("Condition: "));
        cond.getChildren().add(roomcond);

        infos.getChildren().addAll(roomnum, occupant, cond);
        this.getChildren().add(infos);
        this.setOnMouseClicked(this);
    }
    public RoomInfo(int Roomnum, int RoomType, String Occupant){
        this(Roomnum,RoomType,Occupant,2);
    }
    public RoomInfo(int Roomnum, int RoomType, int Cond){
        this(Roomnum,RoomType,"-",Cond);
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        Rooms.update(Roomnum, RoomType);
        Main.mainstage.setScene(GlobalVar.Rooms_S);
        Main.mainstage.setTitle("Room Information");
    }
}

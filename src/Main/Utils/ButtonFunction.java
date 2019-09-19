package Main.Utils;

import Main.Resources.GlobalVar;
import Main.Resources.Handler.Functions.MainFunction;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class ButtonFunction extends Button {

    public ButtonFunction(String name, MainFunction fun, int x) {
        super(name);
        this.setOnAction(fun);
        if(x==0){
            GlobalVar.formatButton(this);
            this.setAlignment(Pos.CENTER_LEFT);
        }else if(x==1){
            this.setMinHeight(GlobalVar.HEIGHT-20);
            this.setMinWidth(GlobalVar.WIDTH/4-20);
        }else{
            this.setMinHeight(GlobalVar.HEIGHT/2 - 15);
            this.setMinWidth(GlobalVar.WIDTH/4-20);
        }

    }
}

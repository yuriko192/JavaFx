package Main.Utils;

import Main.Resources.GlobalVar;
import Main.Resources.Handler.Functions.MainFunction;
import javafx.scene.control.Button;

public class ButtonFunction extends Button {

    public ButtonFunction(String name, MainFunction fun, int x) {
        super(name);
        this.setOnAction(fun);
        if(x==1){
            GlobalVar.formatMainMenuButton(this);
        }else{
            GlobalVar.formatButton(this);
        }

    }
}

package Main.Utils;

import Main.Resources.GlobalVar;
import javafx.scene.image.ImageView;


public class ImageContainer extends ImageView {
    public ImageContainer(String s, int type) {
        super(s);
        this.setPreserveRatio(true);
        if(type==1){
            this.setFitWidth(GlobalVar.WIDTH/5-30);
        }else{
            this.setFitWidth(64);
        }

    }
}

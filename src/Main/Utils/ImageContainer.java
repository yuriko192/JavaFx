package Main.Utils;

import Main.Resources.GlobalVar;
import javafx.scene.image.ImageView;


public class ImageContainer extends ImageView {
    public ImageContainer(String s) {
        super(s);
        this.setPreserveRatio(true);
        this.setFitWidth(GlobalVar.WIDTH/5-30);
    }
}

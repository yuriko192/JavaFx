package Main.Forms;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;



public class WindowBase extends GridPane{


    public WindowBase() {
        super();
        this.setAlignment(Pos.CENTER_LEFT);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(25, 25, 25, 25));
        VBox SidePane = new SidePanel();

        this.add(SidePane, 0, 0, 6, 1);
    }

}

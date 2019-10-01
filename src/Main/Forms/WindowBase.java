package Main.Forms;

import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class WindowBase extends BorderPane {


    public WindowBase() {
        super();

        this.setPadding(new Insets(25, 25, 25, 25));
        VBox SidePane = new SidePanel();

        this.setLeft(SidePane);
    }

}

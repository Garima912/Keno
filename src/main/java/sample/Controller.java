package sample;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();
        Menu menu = new Menu("Menu");
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        root.getChildren().add(menuBar);
        MenuItem rulesMenuItem = new MenuItem("display the rules of the game");
        MenuItem oddsMenuItem = new MenuItem("display the odds of winning");
        MenuItem exitMenuItem = new MenuItem("Exit the game");

        menu.getItems().addAll(rulesMenuItem, oddsMenuItem, exitMenuItem);

        primaryStage.setTitle("Keno Lottery Game");
        primaryStage.setScene(new Scene(root, 750, 500));
        primaryStage.show();
//Garima

        }



    }

package javaFx._11_javaFx_newWindowDraggable;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainFX extends Application {

     public static void main(String[] args) {
          launch(args);
     }
     
     @Override
     public void start(Stage blueStage) {
          blueStage.setTitle("Hello World!");
          Button btn = new Button("hello");
          
          StackPane root = new StackPane();
          root.setStyle("-fx-background-color: blue;");
          root.getChildren().add(btn);
          blueStage.setScene(new Scene(root, 300, 250));
          blueStage.show();
          
          Stage redStage = new Stage(StageStyle.TRANSPARENT);
          redStage.setTitle("Hello World!");
          Button btn2 = new Button("hello");
          
          StackPane root2 = new StackPane();
          root2.setStyle("-fx-background-color: red;");
          root2.getChildren().add(btn2);
          redStage.setScene(new Scene(root2, 300, 250));
          redStage.show();
     }
}
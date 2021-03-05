package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private double xoffset;
    private double yoffset;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.getIcons().add(new Image("sample/img/15486.png"));
        root.setOnMousePressed(event -> {
            xoffset=event.getSceneX();
            yoffset=event.getSceneY();
        });
        root.setOnMouseDragged(event ->  {
            primaryStage.setX(event.getSceneX()+xoffset);
            primaryStage.setY(event.getSceneY()+yoffset);
        });
        Scene scene = new Scene(root);

        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

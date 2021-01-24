package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana1.fxml"));
        GridPane root = loader.load();
        primaryStage.setTitle("Práctica Pokemon");
        primaryStage.setScene(new Scene(root, 650, 450));
        primaryStage.show();
        primaryStage.setResizable(false); // Tamaño de pantalla fijo

    }


    public static void main(String[] args) {
        launch(args);
    }
}

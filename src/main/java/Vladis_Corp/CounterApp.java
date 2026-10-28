package Vladis_Corp;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import javafx.scene.control.Label;

public class CounterApp extends Application {

    private int visitors = 0;


    @Override
    public void start(Stage stage){
        Label countLabel = new Label("Посетителей: " + visitors);

        Button enterButton = new Button("ПРИШЁЛ");
        enterButton.setOnAction(event->{
            visitors++;
            countLabel.setText("Посетителей: " + visitors);
        });

        Button leaveButton = new Button("УШЁЛ");

        leaveButton.setOnAction(event -> {
            if(visitors>0){
                visitors--;
            }
            countLabel.setText("Посетителей: " + visitors);
        });

        Button resetButton = new Button("СБРОСИТЬ");
        resetButton.setOnAction(event -> {
            visitors = 0;
            countLabel.setText("Посетителей: " + visitors);
        });

        //Всё, что находится в блоке VBox root - то видно на экране
        VBox root = new VBox(
                12,
                countLabel,
                enterButton,
                leaveButton,
                resetButton
        );
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 360, 220);
        stage.setTitle("Счётчик поситителей");
        stage.setScene(scene);
        stage.show();

    }

    public static void main (String[] args){
        launch(args);
    }

}

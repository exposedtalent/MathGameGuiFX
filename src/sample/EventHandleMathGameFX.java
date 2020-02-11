package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EventHandleMathGameFX extends Application {

    public void start(Stage primaryStage)
    {
        //create a MathGameGuiFX pane
        MathGameGuiFX gui = new MathGameGuiFX();

        StackPane rootPane = new StackPane();
        rootPane.getChildren().add(gui);

        // Create a scene and place rootPane in the stage
        Scene scene = new Scene(rootPane, 250, 200);
        primaryStage.setTitle("Button Event Demo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

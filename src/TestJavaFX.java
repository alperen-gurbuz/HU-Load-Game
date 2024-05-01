import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;



public class TestJavaFX extends Application {
    public void start(Stage stage) {
        Label label = new Label("JavaFx çalışıyor.");
        Scene scene = new Scene(label, 200, 100);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
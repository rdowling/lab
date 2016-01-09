import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class RunLater extends Application {

    static Stage stage;

    public void start(Stage primaryStage) {
        RunLater.stage = primaryStage;
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(event -> System.out.println("Hello World!"));

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

    }

    public static Stage getStage() {
        return RunLater.stage;
    }

    public static void main(String[] args) {
        launch(args);
    }

}

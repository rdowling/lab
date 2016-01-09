import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.concurrent.CountDownLatch;

public class RLT extends Application {

    public static Stage stage;
    public static Button button;
    public static CountDownLatch latch = new CountDownLatch(1);

    public void start(Stage primaryStage) {
        RLT.stage = primaryStage;
        primaryStage.setTitle("App");
        Button btn = new Button();
        RLT.button = btn;
        btn.setText("Say 'Hello World'");
        btn.setOnAction(event -> primaryStage.setTitle("click"));

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        latch.countDown();
    }

    public static void run() {
        new Thread(() -> {
            RLT.launch();
        }).start();
    }
}

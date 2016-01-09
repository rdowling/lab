
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author zoranpavlovic.blogspot.com
 */
public class Styling extends Application {
    /**
     * @param args the command line arguments
     */
    VBox vb = new VBox();
    Button btn1 = new Button("Button 1");
    Button btn2 = new Button("Button 2");
    Button btn3 = new Button("Button 3");
    Button btn4 = new Button("Button 4");


    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CSS Test");


        vb.setId("root");
        btn1.setId("btn1");
        btn2.setId("btn2");
        btn3.setId("btn3");
        btn4.setId("btn4");


        vb.setPadding(new Insets(30, 50, 50, 50));
        vb.setSpacing(10);
        vb.setAlignment(Pos.CENTER);
        vb.getChildren().addAll(btn1, btn2, btn3, btn4);

        //Adding VBox to the scene
        Scene scene = new Scene(vb);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("styling.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
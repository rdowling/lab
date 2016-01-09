import javafx.application.Platform;
import javafx.stage.Stage;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertTrue;

public class RunLaterTest extends Unit {

    @Test
    public void test1() {
        System.out.println("test one");
        Stage stage = RLT.stage;
        assertTrue(stage.getTitle().equals("App"));
        System.out.println(RLT.button.getWidth());
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("testing app title");
        Stage stage = RLT.stage;
        assertTrue(stage.getTitle().equals("App"));
        CountDownLatch latch = new CountDownLatch(1);
        Platform.runLater(() -> {
            RLT.button.fire();
            System.out.println(RLT.stage.getTitle());
            assertTrue(stage.getTitle().equals("click"));
            RLT.button.setPrefWidth(122);
            assertTrue(RLT.button.getPrefWidth() == 122);
            latch.countDown();
        });
        latch.await();
        Thread.sleep(1000);
        System.out.println(RLT.button.getWidth());

    }

    @Test
    public void test3() {
        System.out.println(RLT.button.getWidth());
    }

}
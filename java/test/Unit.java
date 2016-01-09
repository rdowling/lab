import org.junit.BeforeClass;

public class Unit {

    @BeforeClass
    public static void startApp() {
        try {
            RLT.run();
            RLT.latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
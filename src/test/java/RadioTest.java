import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    private static int expected = 100;
    private static Radio cond = new Radio(expected);

    @Test
    public void getAndSetCurrentRadioChanel() {
        cond.setCurrentChannel(9);
        Assertions.assertEquals(9, cond.getCurrentChannel());

        cond.setCurrentChannel(5);
        Assertions.assertEquals(5, cond.getCurrentChannel());

        cond.setCurrentChannel(expected);
        Assertions.assertEquals(5, cond.getCurrentChannel());

        cond.setCurrentChannel(-1);
        Assertions.assertEquals(5, cond.getCurrentChannel());

        cond.setCurrentChannel(0);
        Assertions.assertEquals(0, cond.getCurrentChannel());

        cond.setCurrentChannel(1);
        Assertions.assertEquals(1, cond.getCurrentChannel());

        cond.setCurrentChannel(4);
        Assertions.assertEquals(4, cond.getCurrentChannel());

        cond.setCurrentChannel(6);
        Assertions.assertEquals(6, cond.getCurrentChannel());

        cond.setCurrentChannel(8);
        Assertions.assertEquals(8, cond.getCurrentChannel());
    }

    @Test
    public void upAndDownCurrentRadioVolume() {
        cond.downVolume();
        Assertions.assertEquals(0, cond.getCurrentVolume());

        for (int i = 0; i < 101; i++) {
            cond.upVolume();
        }

        Assertions.assertEquals(100, cond.getCurrentVolume());

        cond.downVolume();
        Assertions.assertEquals(99, cond.getCurrentVolume());
    }

    @Test
    public void prevAndNextCurrentChannelMax() {
        cond.setCurrentChannel(0);
        cond.next();
        Assertions.assertEquals(1, cond.getCurrentChannel());

        cond.prev();
        Assertions.assertEquals(0, cond.getCurrentChannel());

        cond.prev();
        Assertions.assertEquals(expected - 1, cond.getCurrentChannel());

        cond.next();
        Assertions.assertEquals(0, cond.getCurrentChannel());
    }

    @Test
    public void prevAndNextCurrentChannelMin() {
        Radio cond = new Radio( -1);

        cond.setCurrentChannel(0);
        cond.next();
        Assertions.assertEquals(0, cond.getCurrentChannel());

        cond.prev();
        Assertions.assertEquals(0, cond.getCurrentChannel());

        cond.prev();
        Assertions.assertEquals(0, cond.getCurrentChannel());

        cond.next();
        Assertions.assertEquals(0, cond.getCurrentChannel());
    }
}

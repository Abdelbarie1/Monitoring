package patterns;


import io.patterns.problem.Monitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonitorTest {

    @Test
    public void startDesktopApp() {
        Monitor monitor = new Monitor("desktop");
        assertEquals("window", monitor.layout());
        assertEquals("wideImage", monitor.image());
        assertEquals("pushButton", monitor.button());
    }

    @Test
    public void startMobileApp() {
        Monitor monitor = new Monitor("mobile");
        assertEquals("screen", monitor.layout());
        assertEquals("narrowImage", monitor.image());
        assertEquals("touchButton", monitor.button());

    }
}

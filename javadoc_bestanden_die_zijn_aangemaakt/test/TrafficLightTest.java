import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TrafficLightTest {

    TrafficLight SUT;

    @Before
    public void setup() {
        SUT = new TrafficLight();
    }

    @Test
    public void showTrafficLightRedColor() {
        String result = SUT.showColor(1);
        assertThat(result, is("Red"));
    }
    @Test
    public void showTrafficLightOrangeColor() {
        String result = SUT.showColor(2);
        assertThat(result, is("Orange"));
    }
    @Test
    public void showTrafficLightGreenColor() {
        String result = SUT.showColor(3);
        assertThat(result, is("Green"));
    }

    @Test
    public void showTrafficLightInvalidNumber() {
        String result = SUT.showColor(0);
        assertThat(result, is("Invalid Light Number"));
    }

    @Test
    public void numberIsGreaterThanZero() {
        boolean result = SUT.isPositiveNumber(1);
        assertThat(result, is(true));
    }

    @Test
    public void numberIsZero() {
        assertFalse(SUT.isPositiveNumber(0));
    }

    @Test
    public void numberIsLessThanZero() {
        assertFalse(SUT.isPositiveNumber(-1));
    }

}

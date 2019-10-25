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
    public void showColor_isRedColor_redReturned() {
        String result = SUT.showColor(1);
        assertThat(result, is("Red"));
    }
    @Test
    public void showColor_isOrangeColor_OrangeReturned() {
        String result = SUT.showColor(2);
        assertThat(result, is("Orange"));
    }
    @Test
    public void showColor_isGreenColor_GreenReturned() {
        String result = SUT.showColor(3);
        assertThat(result, is("Green"));
    }

    @Test
    public void showColor_isInvalidNumber_InvalidReturned() {
        String result = SUT.showColor(0);
        assertThat(result, is("Invalid Light Number"));
    }

    @Test
    public void isPositiveNumber_isGreaterThanZero_trueReturned() {
        boolean result = SUT.isPositiveNumber(1);
        assertThat(result, is(true));
    }

    @Test
    public void isPositiveNumber_isZero_trueReturned() {
        assertFalse(SUT.isPositiveNumber(0));
    }

    @Test
    public void isPositiveNumber_isLessThanZero_trueReturned() {
        assertFalse(SUT.isPositiveNumber(-1));
    }


}

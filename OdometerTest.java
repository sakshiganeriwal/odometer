import static org.junit.Assert.*;

import org.junit.Test;

public class OdometerTest {
 
	odometer Odo = new odometer();
    @Test
    public void nextOdometerTest(){
        assertEquals(124, Odo.nextOdometer(123));
    }

    @Test
    public void prevOdometerTest(){

        assertEquals(123, Odo.prevOdometer(124));
    }
     
    @Test
    public void diffReadingTest(){
         
        assertEquals(3 ,Odo.diffReading(1678,1789));
    }
}
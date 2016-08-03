import static org.junit.Assert.*;

import org.junit.Test;

public class OdometerTest {
 
	odometer Odo = new odometer();
	
	@Test
    public void checkOdometerTest(){
		assertEquals(false, Odo.checkOdometer(1));
		assertEquals(false, Odo.checkOdometer(123456789));
        assertEquals(true, Odo.checkOdometer(129));
        assertEquals(false, Odo.checkOdometer(122));
        assertEquals(false, Odo.checkOdometer(141));
    }
	
    @Test
    public void nextOdometerTest(){
        assertEquals(12345, Odo.nextOdometer(6789));
        assertNotEquals(12344, Odo.nextOdometer(6789));
    }
    

    @Test
    public void prevOdometerTest(){

        assertEquals(123, Odo.prevOdometer(124));
        assertNotEquals(6788, Odo.prevOdometer(12345));
        
    }
     
    @Test
    public void diffReadingTest(){
    	assertEquals(3 ,Odo.diffReading(1678,1789));
        assertNotEquals(1 ,Odo.diffReading(1678,1789));
    }
}
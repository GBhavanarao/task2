package simpleintrest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class siTest {

	@Test
	void siTest() 
	{
		si obj=new si();
		assertEquals(625.0, obj.cal(5000,2.5,5));
		assertEquals(0.0, obj.cal(5000,0,5));
		assertEquals(556.125, obj.cal(4449,2.5,5));
	}

}

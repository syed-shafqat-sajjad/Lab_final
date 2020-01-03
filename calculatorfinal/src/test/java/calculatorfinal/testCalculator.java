package calculatorfinal;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;


public class testCalculator {

	
	private static Calculator calculator;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
		calculator = new Calculator();
	}
	@Test  
	public void testFindMax(){  
		assertEquals(4,calculator.findMax(1,3,4));  
		assertEquals(-1,calculator.findMax(-12,-1,-2));  
	} 
	@Test  
	public void testSquare1(){  
		assertEquals(4,calculator.square(2));  
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare2(){  
		calculator.square(-1);  
	}
	@Test  
	public void testCube(){  
		assertEquals(64,calculator.cube(4));  
	}
	@AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  

	
	
	

}
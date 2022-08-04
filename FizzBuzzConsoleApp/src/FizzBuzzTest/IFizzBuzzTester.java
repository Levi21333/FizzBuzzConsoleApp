package FizzBuzzTest;

import static org.junit.Assert.*;

import org.junit.Test;

import FizzBuzzLib.FizzBuzz;


public class IFizzBuzzTester {

	@Test
	public void test() {
		FizzBuzz test = new FizzBuzz();
		
		//Uncomment for individual testing of each case
		
		
		
		//Test 0 commented, success
		//For Non-multiples of 3 or 5
		
//		String result = test.FizzBuzzifyAnInt(1);
//		
//		assertEquals(" | ",result);
		
		
		
		
		//Test 1 commented, success
		//For only multiples of 3
		
//		String result1 = test.FizzBuzzifyAnInt(3);
//
//		assertEquals(" Fizz ",result1);

		
		
		//Test 2 commented, success
		//For only multiples of 5
		
//		String result2 = test.FizzBuzzifyAnInt(5);
//		
//		assertEquals(" Buzz ",result2);

		
		
		
		//Test 3 uncommented, success
		//For multiples of 3 and 5
		
		String result3 = test.FizzBuzzifyAnInt(45);
		
		assertEquals(" FizzBuzz ",result3);
	}

}

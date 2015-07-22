package com.capgemini.MathematicalOperations;

import org.junit.Assert;
import org.junit.Test;


public class MathematicalOperationsTest {
	
	@Test
	public void testShouldMultiply1And2And3AndGive6 () {
		Assert.assertEquals(6, MathematicalOperations.multiply(1,2,3));
	}

	@Test
	public void testShouldMultiplyMinus1And2And3AndGive6 () {
		Assert.assertEquals(-6, MathematicalOperations.multiply(-1,2,3));
	}

	@Test
	public void testShouldMultiply2WithNothingAndGive2 () {
		Assert.assertEquals(2, MathematicalOperations.multiply(2));
	}
	
	@Test
	public void whenSubstract6And2ShouldEquals4() {
		Assert.assertEquals(4, MathematicalOperations.substract(6, 2));
	}
		
	@Test
	public void whenSubstract6And6ShouldEquals0() {
		Assert.assertEquals(0, MathematicalOperations.substract(6, 6));
	}
		
	@Test
	public void whenSubstract0AndNegative6ShouldEqualsNegative6() {
		Assert.assertEquals(6, MathematicalOperations.substract(0, -6));
	}
		
	@Test
	public void whenSubstractNegative672AndNegative4ShouldEqualsNegative676() {
		Assert.assertEquals(-668, MathematicalOperations.substract(-672, -4));
	}
	
	@Test
	public void testShouldFactorialWhen5Then120(){
		Assert.assertEquals(120, MathematicalOperations.factorial(5));
	}

	@Test
	public void testShouldFactorialWhen0Then1(){
		Assert.assertEquals(1, MathematicalOperations.factorial(0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testShouldFactorialWhenNegativesParameterThenIllegalArgumentException(){
		MathematicalOperations.factorial(-1);
	}
}

package fizzBuzz;

import fizzBuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class fizzBuzzTest {

	@Before
	public void createObject() {
		FizzBuzz fzb = new FizzBuzz();
	}

	@Test
	public void testWithNumberIsDividableBy3() {

		FizzBuzz fzb = new FizzBuzz();
		Assert.assertEquals("Fizz", fzb.fizzBuzzSolution(3));
		Assert.assertEquals("Fizz", fzb.fizzBuzzSolutionJava8(3));

	}
	@Test
	public void testWithNumberIsDividableBy5() {

		FizzBuzz fzb = new FizzBuzz();
		Assert.assertEquals("Buzz", fzb.fizzBuzzSolution(5));
		Assert.assertEquals("Buzz", fzb.fizzBuzzSolutionJava8(5));

	}
	
	@Test
	public void testWithNumberIsDividableBy15() {

		FizzBuzz fzb = new FizzBuzz();
		Assert.assertEquals("FizzBuzz", fzb.fizzBuzzSolution(15));
		Assert.assertEquals("FizzBuzz", fzb.fizzBuzzSolutionJava8(15));
		Assert.assertEquals("FizzBuzz", fzb.fizzBuzzSolution(45));
		Assert.assertEquals("FizzBuzz", fzb.fizzBuzzSolutionJava8(45));

	}
	
	@Test
	public void testWithNumber() {

		FizzBuzz fzb = new FizzBuzz();
		Assert.assertEquals("1", fzb.fizzBuzzSolution(1));
		Assert.assertEquals("1", fzb.fizzBuzzSolutionJava8(1));
		Assert.assertEquals("7", fzb.fizzBuzzSolution(7));
		Assert.assertEquals("7", fzb.fizzBuzzSolutionJava8(7));

	}
	
}

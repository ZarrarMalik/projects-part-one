package fizzBuzz;

import java.util.Optional;

public class FizzBuzz {

	FizzBuzz() {

	}

	public String fizzBuzzSolution(Integer number) {
		if (number % 15 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		}
		return Integer.toString(number);
	}

	public static String fizzBuzzSolutionJava8(int input) {
		return Optional.of(input).map(i -> {
			if (i % (3 * 5) == 0) {
				return "FizzBuzz";
			} else if (i % 3 == 0) {
				return "Fizz";
			} else if (i % 5 == 0) {
				return "Buzz";
			} else {
				return Integer.toString(i);
			}
		}).get();
	}

	public static void main(String[] args) {
		// if divieded by 3, its fizz
		// if divided by 5, its buzz
		// if divided by 3 and 5, its fizzbuzz
		FizzBuzz fzb = new FizzBuzz();

		for (int i = 1; i <= 100; i++) {
			//System.out.println(fzb.fizzBuzzSolution(i));
			System.out.println(fzb.fizzBuzzSolutionJava8(i));
		}

	}

}

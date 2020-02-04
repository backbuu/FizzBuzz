package com.example.FizzBuzz;


public class FizzBuzzApplication {

	public String convert(final int number) {
		
		if(canDivideBy(number, 3) && canDivideBy(number, 5)) return "FizzBuzz";
		if(canDivideBy(number, 5)) return "Buzz";
		if(canDivideBy(number, 3)) return "Fizz";

		return String.valueOf(number);
	}

	private Boolean canDivideBy(int number, int devider){
		return number % devider == 0;
	}
}

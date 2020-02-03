package com.example.FizzBuzz;


public class FizzBuzzApplication {

	public String convert(final int number) {
		
		if(canDivideBy(number, 3) && canDivideBy(number, 5)) return "FizzBuzz";
		if(canDivideBy(number, 5)) return "Buzz";
		if(canDivideBy(number, 3)) return "Fizz";

		return String.valueOf(number);
		// if (isBuzz(number) && isFizz(number)) return "FizzBizz";
		// if (isBuzz(number))	return "Bizz";
		// if (isFizz(number)) return "Fizz";
	}

	private Boolean canDivideBy(int number, int devider){
		return number % devider == 0;
	}

	// private Boolean isFizz(int number) {
	// 	if(number % 3 == 0){
	// 	return true;
	// 	}
	// 	return false;
	// }
	// private Boolean isBuzz(int number){
	// 	if(number %5 ==0){
	// 		return true;
	// 	}
	// 	return false;
	// }

}
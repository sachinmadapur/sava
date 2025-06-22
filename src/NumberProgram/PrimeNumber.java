package NumberProgram;  
// Declares the package name as NumberProgram, which helps in organizing classes.

public class PrimeNumber {
	// Declares the public class named PrimeNumber.

	public static void main(String[] args) {
		// Entry point of the Java application.

		int num = 4;
		// Declares and initializes the number to be checked for primality.
		boolean flag = true;
		// Initializes a boolean flag to true. This flag will be used to determine if the number is prime.
		if(num < 2) {
			// Prime numbers are greater than 1. If num is less than 2, it's not a prime.
			flag = false;
			// Sets the flag to false since numbers less than 2 are not prime.
		} else {
			// If num is 2 or greater, we check for factors.
			for(int i = 2; i <= num - 1; i++) {
				// Loop starts from 2 to num-1 (not inclusive of num). A number is not prime if it has any divisor in this range.
				if(num % i == 0) {
					// If num is divisible by any i, then it has a factor other than 1 and itself.
					flag = false;
					// Set flag to false because the number is not prime.
					break;
					// Exit the loop early since we already found a divisor.
				}
			}
		}

		if(flag == true) {
			// If flag is still true, the number is prime.

			System.out.println(num + " is a prime");
			// Output to indicate the number is a prime.
		} else
			// If flag is false:

			System.out.println(num + " is not a prime");
		// Output to indicate the number is not a prime.
	}
}

// Note:
// - Prime numbers are numbers greater than 1 that are divisible only by 1 and themselves.
// - 2 is the only even prime number. All other even numbers are divisible by 2 and hence not prime.

//PrimeNumber - they are divsible by one or Itself [2,3,5,7,...]   
//only 2 : is the even PrimeNumber
//expect 2 , all are odd number
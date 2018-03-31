/**
 * 
 * @author David Koo
 *
 */

public class FizzBuzz {

	//Max limit variable.
	private final static int MAX_LIMIT = 100;

	public static void main(String[] args) {

		for (int i = 1; i <= MAX_LIMIT; i++) {
			String result = "";

			//Conditions for printing. Additional conditions can be added here.
			if (i%3 == 0) result += "Fizz";
			if (i%5 == 0) result += "Buzz";

			//Prints the results.
			if (result == "") {
				System.out.println(i);
			}
			else {
				System.out.println(result);
			}
		}
	}
}

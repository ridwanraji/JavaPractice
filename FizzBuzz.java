/**
 * A java class that answers the FIZZBUZZ challenge
 */
public class FizzBuzz {

    /**
     * A method that prints each number between 1 and maxNum but
     * if i is multiple of 3 and 5, print FIZZBUZZ;
     * if i is a multiple of 3, print FIZZ; and 
     * if i is a multiple of 5, print BUZZ
     * 
     * @param maxNum maximum number
     */
    public void printFizzBuzz (int maxNum){

        for(int i = 1; i <= maxNum; i++) {

            // if i is multiple of 3 and 5, print FIZZBUZZ
			if (((i%3)== 0) && ((i%5)== 0)) {
				System.out.println("FIZZBUZZ");
            }
            
            // if i is a multiple of 3, print FIZZ
			else if((i%3)== 0) {
				System.out.println("FIZZ");
            }
            
            // if i is a multiple of 5, print BUZZ
			else if ((i%5)== 0) {
				System.out.println("BUZZ");
            }
            
            // otherwise, print i
			else
			System.out.println(i);
		}
    }
    
    public static void main(String[] args) {

        // Create new object
        FizzBuzz firstChallenge = new FizzBuzz();

        // maximum number
        int max = 100;

        // Call the method to solve the challenge
        firstChallenge.printFizzBuzz(max);
    }
}
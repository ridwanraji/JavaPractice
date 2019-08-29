import java.util.*;

/**
 * A java class that find the largest integer between the first nth elements in
 * a list of number.
 */
public class FindLargestInteger {

    /**
     * A method that finds the largest integer between the first nth elements in a
     * list of number.
     * 
     * @param listOfInt = List of Integers
     * @param num       = Nth number
     * @return the largest integer
     */
    public Integer findLargest(ArrayList<Integer> listOfInt, Integer num) {
        int largest = 0;
        int index = 0;

        // if the list is empty, return -1
        if (listOfInt.size() == 0) {
            return -1;
        }

        // find the largest integer within the first nth integers
        for (int i = 0; i < num; i++) {
            if (listOfInt.get(i) > largest) {
                largest = listOfInt.get(i);
                index = largest;
            }
        }

        // return the largest integer
        return index;
    }

    /**
     * Main method to run the class
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Create new list of integers
        ArrayList<Integer> theList = new ArrayList<Integer>();

        // Insert integers into the list
        theList.add(3);
        theList.add(5);
        theList.add(1);
        theList.add(6);
        theList.add(3);

        // nth value
        int nthValue = 3;

        FindLargestInteger find = new FindLargestInteger();

        // Print the elements in the array
        System.out.print("Array content are: ");
        for (int j = 0; j < theList.size(); j++) {

            System.out.print(theList.get(j) + " ");
        }
        System.out.println();

        // Print the largest largest integer between the first nth integer in the list
        System.out.println(
                "Largest number between the first " + nthValue + " numbers is: " + find.findLargest(theList, nthValue));
    }
}

/*
Q1:  Number of Occurrences

- Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
- Find the number of occurrences for each element
- Your method should return something like the following:

{
    "1": 4,
    "3": 1,
    "4": 1,
    "5": 1,
    "6": 1,
    "7": 3,
    "8": 2
}

- (Think about the data structure that you should use)
- Create a method - Think about the return type and parameters
- Write unit tests for your method
 */

/*
Key Value pairs - Map
 */

package exercises;

import java.util.HashMap;

public class Exercise1 {

    // Main method
    public static void main(String[] args) {
        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
        System.out.println(numberOfOccurrences(input));

    }

    // Method that finds the number of occurrences for each element
    public static HashMap<String, Integer> numberOfOccurrences(String input) {
        // Create HashMap to store values
        HashMap<String, Integer> map = new HashMap<>();
        // Currently a string of numbers - we want the individual numbers
        // Split the string by commas, and store in a string array
        String[] split = input.split(",");
        // Now, for each element in the string array
        for (String e : split) {
            // If element does not contain key
            if (!map.containsKey(e)) {
                map.put(e, 1);
            } else {
                int count = map.get(e) + 1;
                map.put(e, count);
            }
        }
        return map;

    }
}

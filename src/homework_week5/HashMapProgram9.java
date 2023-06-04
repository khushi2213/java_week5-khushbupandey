package homework_week5;
/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;

public class HashMapProgram9 {
    public static void main(String[] args) {

        map1();
    }

    public static void map1() {

        {
            // Create a HashMap object called people
            HashMap<String, Integer> people = new HashMap<String, Integer>();


            // Add keys and values (Name, Age)
            people.put("Tom", 25);
            people.put("Smith", 30);
            people.put("Jack", 35);

            for (String i : people.keySet()) {
                System.out.println("key: " + i + " value: " + people.get(i));
            }
        }


    }
}

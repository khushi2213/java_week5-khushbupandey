package homework_week5;

//3. Write a Java program to reverse an array of integer values.

import java.util.Arrays;

public class ReverseArrayProgram3 {
//3. Write a Java program to reverse an array of integer values.

    public static void main(String[] args){
        reverseA();}

    public static void reverseA(){
        int[] my_array1 = {
                1999, 2147, 1279, 1676, 2020,
                1837, 2836, 1279, 1982, 1787,
                1376, 1255, 1947, 2553};
        System.out.println("Original array : "+ Arrays.toString(my_array1));
        for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));
    }
}

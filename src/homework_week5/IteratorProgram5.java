package homework_week5;
/**5. Write a Java program to iterate through all elements in an array list using
 Iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorProgram5 {
    public static void main(String[] args) {

        iterator1();}

    public static void iterator1(){

        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("d");
        arrlist.add("dd");
        arrlist.add("ddd");
        arrlist.add("dddd");
        arrlist.add("ddddd");
        System.out.println(arrlist);    // [d, dd, ddd, dddd, ddddd]

        Iterator<String> iterator = arrlist.iterator();
        while (iterator.hasNext()) {
            String i = iterator.next();
            System.out.println(i);

        }
    }
}

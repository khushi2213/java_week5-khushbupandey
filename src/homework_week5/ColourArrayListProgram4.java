package homework_week5;
/**4. Write a Java program to create a new array list, add some colours (string) and
 printout the collection using for each loop.
 */


import java.util.ArrayList;
import java.util.List;

public class ColourArrayListProgram4 {
    public static void main(String[] args) {
        arrayList();
    }

    public static void arrayList(){
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        for (String name : list_Strings) {
            System.out.println(name);
        }

    }

}

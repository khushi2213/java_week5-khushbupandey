package homework_week5;

/**2. Rewrite the student mark sheet programme (From java-homework-week3

 programmes) using if else and while loop.
 */

import java.util.Scanner;

public class MarkSheetProgram2 {

    public static void main(String[] args) {
        result();
    }

    public static void result() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name :   ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number  :  ");
        int a = sc.nextInt();
        System.out.println("Enter Maths Marks  :  ");
        int maths = sc.nextInt();
        while (maths >= 100) {
            System.out.print("Invalid Input. Marks should be between 0 tp 100");
            System.exit(maths);
        }

        System.out.println("Enter Science Marks  :  ");
        int sci = sc.nextInt();
        while (sci >= 100) {
            System.out.println("Invalid Input. Marks Marks should be between 0 tp 100");
            System.exit(sci);
        }

        System.out.println("Enter English Marks  :  ");
        int eng = sc.nextInt();
        while (sci >= 100) {
            System.out.println("Invalid Input. Marks Marks should be between 0 tp 100");
            System.exit(eng);
        }

        int sum = maths + sci + eng;
        float per = (sum * 100) / 300;

        int average = (sum * 100) / 300;
        String grade;
        String result;

        if (maths >= 35 && sci >= 35 && eng >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        if (average >= 80 && result == "Pass") {
            grade = "A+";
        } else if (average >= 60 && result == "Pass") {
            grade = "A";
        } else if (average >= 50 && result == "Pass") {
            grade = "B";
        } else if (average >= 35 && result == "Pass") {
            grade = "C";
        } else {
            grade = "";
        }

        System.out.println(" _______________________________");
        System.out.println("|                              |");
        System.out.println("|        Mark Sheet            |");
        System.out.println(" _______________________________");
        System.out.println("|    Name  :" + name + "       |");
        System.out.println("|  Roll No  " + a + "          |");
        System.out.println(" _______________________________");
        System.out.println("|  Subject  :    Marks         |");
        System.out.println(" _______________________________");
        System.out.println("|    Maths  :" + maths + "     |");
        System.out.println("|    Science  :" + sci + "     |");
        System.out.println("|    English  :" + eng + "     |");
        System.out.println(" _______________________________");
        System.out.println("|    Total  :" + sum + "       |");
        System.out.println(" _______________________________");
        System.out.println("| Percentage :" + per + "       |");
        System.out.println("| Result     :  " + result + "  |");
        System.out.println("|  Grade     : " + grade + " |");
        System.out.println(" _______________________________");
    }
}

import java.util.Scanner;

public class compareTo {

   	public static Scanner kb = new Scanner(System.in);

   	public static void main(String args[]) {

   		System.out.println("This program will compare alphabetical order! Type a word here...");

        String input1 = kb.nextLine();

        System.out.println("...and here....");

        String input2 = kb.nextLine();

		int result = input1.compareTo( input2 );

        System.out.println("...and it turns out that ");

        if (result < 0) {
        	System.out.println(input1 + " comes before " + input2 + " in the dictionary!");
        }

        if (result > 0) {
        	System.out.println(input2 + " comes before " + input1 + " in the dictionary!");
        }

        if (result == 0) {
        	System.out.println(input1 + " is the exact same as " + input2 + " in the dictionary!");
        }

   }
}
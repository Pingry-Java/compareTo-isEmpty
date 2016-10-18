import java.util.Scanner;

public class isEmpty {

    public static Scanner kb = new Scanner(System.in);
 
    public static void main(String[] args) {

        System.out.println("Type something here and I'll tell you if there's something there, and how long it is. Wow!");

        String input = kb.nextLine();

        if(input.isEmpty()){
            System.out.println("There nothing here.");
            System.out.println("String input is empty with length "+input.length());
        }
        else{
            System.out.println("There's a thing here!");
            System.out.println("String input is not empty with length "+input.length());
        }
    }
 
}
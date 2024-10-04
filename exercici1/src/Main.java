import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int numUser = -1;

        System.out.println("Write a number between 1 and 10");
        do {
            if (input.hasNextInt())
            {
                numUser= input.nextInt();
                if (numUser < 1 || numUser > 10) {
                    System.out.println("That's not a valid number");
                }
            } else{
                System.out.println("That's not a number");
            }
            input.nextLine();
        } while(numUser < 1 || numUser > 10);
        System.out.println("Your number is: " + numUser);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare scanner
        Scanner input= new Scanner(System.in);
        //Declare variable to ask a number to the user
        int numUser = -1;

        //Ask the user a number
        System.out.println("Write a number between 1 and 10");
        do {
            //Check if the input is a number or not
            if (input.hasNextInt())
            {
                numUser= input.nextInt();
                //If it's a number, check if it's between 1 and 10
                if (numUser < 1 || numUser > 10) {
                    //If it's not, ask again
                    System.out.println("That's not a valid number");
                }
            } else{
                //If it's not a number, ask again
                System.out.println("That's not a number");
            }
            input.nextLine();
        } while(numUser < 1 || numUser > 10);
        //If it's a number between 1 and 10, print out the number
        System.out.println("Your number is: " + numUser);
    }
}
import java.util.Scanner;

public class ScannerProgram {

    public static void main(String[] args) {
        System.out.println("Welcome to the age checker!");

        System.out.print("Enter your age here: ");

        String message;

        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();

        if (age < 18) {
            System.out.println("You are less than 18 years, this is a Genz party, enter nigga!");
            message = "Welcome to the party!";
        }

        else {
            System.out.println("You are more than 18 years, this is a Genz party, get out old cargo!");
            message = "";
        }

        System.out.println(message);
        scan.close();
    }

}
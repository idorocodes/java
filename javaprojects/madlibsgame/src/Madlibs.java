import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {

        System.out.println("Hello, this is the mad libs game, you'll get input fields to enter your desired input");
        Scanner scan = new Scanner(System.in);

        String adjective;
        String noun1;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective (decription) :");
        adjective = scan.nextLine();
        System.out.println("Enter a noun :");
        noun1 = scan.nextLine();
        System.out.println("Enter an adjective (description) :");
        adjective2 = scan.nextLine();
        System.out.println("Enter a verb ending with -ing :");
        verb = scan.nextLine();
        System.out.println("Enter an adjective (description) :");
        adjective3 = scan.nextLine();

        System.out.println("Today i went to a " + adjective + " zoo");
        System.out.println("I saw a " + noun1 + " eating a sandwich");
        System.out.println("The " + adjective2 + " monkey was " + verb + " around the tree");
        System.out.println("The " + adjective3 + " lion was sleeping");

        scan.close();
    }
}

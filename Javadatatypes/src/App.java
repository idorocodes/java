public class App {

    public static void main(String[] args) {
        // Variables and Data Types

        // A variable servers as a container, a box that helps us to hold data and it
        // behaves exactly like the data it holds.

        // Variables in java are created in two steps, declaration/creation and
        // initialization/assignment, the type the varible is wriitten before the
        // identifier which is the variable name

        // VARIABLE SYNTAX

        // type identifier = value

        // eg int age = 20;

        // the data type in java are keywords used to represent each value in the
        // program

        // the most common of them are string, int, double, boolean, char

        // String is used for representing words like "idorocodes", char is used for
        // represeting characters like 'e', int is for numbers that dont have fractional
        // part e.g 34, double for numbers that have decimal e.g 56.2, while boolean is
        // used for true
        // and false values.

        // STRING

        String name = "idorocodes";
        String school = "Fuoye";
        String favoriteFood = "Garri";

        System.out.println("Hi, i'm " + name + ",i attend " + school + ", and i love taking " + favoriteFood);

        // INTEGER

        int age = 10;
        int numOfGirlfirends = 0;
        int numOfHeartBreaks = 0;

        System.out.println("I am " + age + " years old and i have " + numOfGirlfirends
                + " girfriends and my heart has been broken " + numOfHeartBreaks + " times");

        // DOUBLE

        double cgpa = 68.6;
        double height = 377.3;
        System.out.println("My cgpa is " + cgpa + " and i am " + height + " tall");

        // Char

        char currency = '$';
        System.out.println("I am worth " + currency + "6 trillion");

        // Boolean

        boolean isGentle = false;
        boolean isRomantic = false;
        boolean isRich = true;

        if (isGentle && isRomantic && isRich) {
            System.out.println("The guy is gentle, romantic and rich, lemme date him");
        }

        else {
            System.out.println("The guy is not him!, he is an evil man! opueh!");
        }

    }
}
import java.sql.SQLOutput;
import java.util.Scanner;

public class ExampleWhileLoop {

    public static void main(String[] args) {
        String countryName = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess where I am from (no capital letters, please):");

        while (!countryName.equals("latvia")) {
            countryName = scanner.nextLine().trim();

            if (countryName.equals("latvia")) {
                break;
            } else {
                System.out.println("Incorrect, please try again");
            }
        }
        System.out.println("Congrats! You got it right!");
    }
}

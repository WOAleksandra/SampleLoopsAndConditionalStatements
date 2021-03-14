import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pet type:");
        String pet = scanner.nextLine();

        switch(pet) {
            case "cat":
                System.out.println("Hello Kitty!");
                break;
            case "dog":
                System.out.println("Let's go run and play outside!");
                break;
            default:
                System.out.println("I do not recognize this pet");
        }

    }
}

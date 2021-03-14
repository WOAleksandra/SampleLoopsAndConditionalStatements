import java.sql.SQLOutput;
import java.util.Scanner;

public class ExampleIfElse {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your temperature: ");
        float temperature = keyboard.nextFloat();

        if (temperature > 0 && temperature < 36) {
            System.out.println(temperature + " Is too low for the living person");
        } else if (temperature < 36 && temperature <= 37) {
            System.out.println(temperature + " Is perfect, enjoy your day!");
        } else if (temperature > 37) {
                System.out.println(temperature + " degrees is too high, go check yourself!");
            }else {
                System.out.println(temperature + " degrees is too complicated, no idea!");
            }



        System.out.println("Please enter your time: ");
        double time = keyboard.nextDouble();

    String timeAffix = (time < 12.00) ? "AM" : "PM";

    time = (timeAffix.equals("PM")) ? Math.round(time - 12) : time;

    System.out.println("The time is "+ time + timeAffix);
    }
}


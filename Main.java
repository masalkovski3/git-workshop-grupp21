import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        if (name == "emmi" || name == "linn") {
            System.out.println("Hello hottie!");
        } else {
            System.out.println("Hello " + name + "!");
        }
        scan.close();

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = scan.nextLine();

        switch (name) {
            case "Emmi":
                Emmi emmi = new Emmi();
                emmi.hello();
                break;

            case "Linn":
                linn linn = new linn();
                linn.message();
                break;

            case "Amelie":
                Amelie amelie = new Amelie();
                amelie.amelie();
                break;

            default:
                System.out.println("Something went wrong");
        }

    }
}

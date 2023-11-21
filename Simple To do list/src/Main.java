import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Splash screen with options
        System.out.println("Please Choose an option");
        System.out.println("");
        System.out.println("(1) Add a task ");
        System.out.println("(2) Remove a task ");
        System.out.println("(3) Update a task ");
        System.out.println("(4) List all tasks ");

        String choice;
        choice = scanner.next();
        switch (choice) {
            case "1":
                System.out.println("Add a task ");

                break;
            case "2":
                System.out.println("Remove a task");

                break;
            case "3":
                System.out.println("Update a task");

                break;
            case "4":
                System.out.println("List all tasks");

                break;
            default:
                System.out.println("Exit");
        }
    }
}



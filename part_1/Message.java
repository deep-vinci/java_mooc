// import scanner to get user input
import java.util.Scanner;

class Message {
    public static void main (String[] args) {
        // initialize scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a message: ");


        String message = scanner.nextLine();

        System.out.println(message);

    }
}
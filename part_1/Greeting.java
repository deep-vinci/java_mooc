import java.util.Scanner;

class Greeting {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        System.out.println("Hi " + username);
    }
}
import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.println("Enter a number or any char to quit");
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Exiting Loop");
                break;
            }
        }
        System.out.println("Max Value: " + max + " Min Value: " + min);
    }
}

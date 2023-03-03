import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 1;
        int sum = 0;
        do {
            System.out.println("Enter number #" + numberCount);
            try {
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                numberCount++;
            } catch (NumberFormatException e) {
                System.out.println("Characters not allowed");
            }
        } while (numberCount <= 5);

        System.out.println("The final sum = " + sum);
    }

}

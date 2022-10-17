
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int sumOfNumbers = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            System.out.println("Give numbers:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
            sum += number;
            sumOfNumbers++;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + sumOfNumbers);
        double average = 1.0 * sum / sumOfNumbers;
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}

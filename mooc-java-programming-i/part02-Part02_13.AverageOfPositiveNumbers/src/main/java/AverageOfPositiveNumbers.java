
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = 0;
        int sum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum += number;
                i++;
            }            
        }
        
        double average = 1.0 * sum / i;
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }

    }
}

package basicprogram;
import java.util.Scanner;
public class prientseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double sum = calculateSeriesSum(n);

        System.out.println("Sum of the series: " + sum);

        scanner.close();
    }

    private static double calculateSeriesSum(int n) {
        double sum = 0;
        double factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += 1.0 / factorial;
        }

        return sum;
	}

}

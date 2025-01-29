package basicprogram;

import java.util.Scanner;

public class Q10_Quadratic_roots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a, b, and c:");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal: R1 = R2 = " + r);
        } else if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct: R1 = " + r1 + ", R2 = " + r2);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are distinct and imaginary: R1 = " + realPart + " + i" + imaginaryPart
                    + ", R2 = " + realPart + " - i" + imaginaryPart);
        }
        sc.close();
    }
}

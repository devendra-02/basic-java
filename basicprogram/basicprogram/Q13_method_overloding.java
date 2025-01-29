package basicprogram;

 import java.util.Scanner;

class Volume {
    // Volume of a cube
    void findVolume(double a) {
        System.out.println("Volume of cube = " + (a * a * a));
    }

    // Volume of a rectangular box
    void findVolume(double a, double b, double c) {
        System.out.println("Volume of rectangular box = " + (a * b * c));
    }

    // Volume of a cylinder
    void findVolume(double a, double b) {
        System.out.println("Volume of cylinder = " + (3.14 * a * a * b));
    }
}

public class Q13_method_overloding {
    public static void main(String args[]) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        Volume obj = new Volume();

        System.out.print("Enter the side of the cube: ");
        a = scanner.nextDouble();
        obj.findVolume(a);

        System.out.print("Enter the length, width, and height of the rectangular box: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        obj.findVolume(a, b, c);

        System.out.print("Enter the radius and height of the cylinder: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        obj.findVolume(a, b);

        scanner.close();
    }
}

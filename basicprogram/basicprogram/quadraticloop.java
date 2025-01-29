package basicprogram;

public class quadraticloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        if (args.length !=3) {
		            System.out.println("Usage: java QuadraticLoop <a> <b> <c>");
		            System.out.println("Where a, b, and c are coefficients of the quadratic equation ax^2 + bx + c = 0");
		            return;
		        }

		        try {
		            double a = Double.parseDouble(args[0]);
		            double b = Double.parseDouble(args[1]);
		            double c = Double.parseDouble(args[2]);

		            for (double x = -10; x <= 10; x += 0.5) {
		                double y = a * x * x + b * x + c;
		                System.out.printf("x = %.2f, y = %.2f%n", x, y);
		            }

		        } catch (NumberFormatException e) {
		            System.out.println("Invalid input. Please enter valid numeric coefficients.");
		        }
		    }
		

		
		

	}



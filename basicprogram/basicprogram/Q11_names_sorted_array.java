package basicprogram;
import java.util.Arrays;
import java.util.Scanner;
public class Q11_names_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" by Devendra Gautam:");
        Scanner scanner = new Scanner(System.in);

	        // Get the number of names from the user
	        System.out.print("Enter the number of names: ");
	        int numNames = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        // Create an array to store the names
	        String[] names = new String[numNames];

	        // Get names from the user
	        for (int i = 0; i < numNames; i++) {
	            System.out.print("Enter name " + (i + 1) + ": ");
	            names[i] = scanner.nextLine();
	        }

	        // Sort the array
	        Arrays.sort(names);

	        // Print the sorted names
	        System.out.println("Sorted names:");
	        for (String name : names) {
	            System.out.println(name);
	        }

	        scanner.close();

	}

}

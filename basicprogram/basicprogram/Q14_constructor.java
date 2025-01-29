package basicprogram;

public class Q14_constructor {
		// TODO Auto-generated method stub
		    int id;
		    String name;

		    // Default constructor
		    Q14_constructor() {
		        System.out.print("This is a default constructor");
		    }

		    // Parameterized constructor
		    Q14_constructor(int i, String n) {
		        id = i;
		        name = n;
		    }

		    public static void main(String[] args) {
		        // Creating objects using different constructors
		    	Q14_constructor s = new Q14_constructor();
		        System.out.print("\nDefault Constructor values:\n");
		        System.out.print("Student Id: " + s.id + "\nStudent Name: " + s.name);

		        System.out.print("\nParameterized Constructor values:\n");
		        Q14_constructor student = new Q14_constructor(10, "David");
		        System.out.print("Student Id: " + student.id + "\nStudent Name: " + student.name);
		    }
		}


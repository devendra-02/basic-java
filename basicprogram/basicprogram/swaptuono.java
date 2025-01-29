package basicprogram;

import java.util.Scanner ;

public class swaptuono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("By Devendra Gautaam");
		
		System.out.println("enter a first no A");
		int A = scanner.nextInt();
		
		System.out.println("enter a second no B");
		int B = scanner.nextInt();
		
		System.out.println("before swape no");
		System.out.println("A = "+ A + "\nB = "+ B);
		
		System.out.println("after swape no ");
		int c = A;
		A = B;
		System.out.println("A = "+ A + "\nB = "+ c);
	}

}

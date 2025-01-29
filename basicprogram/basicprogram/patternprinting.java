package basicprogram;

import java.util.Scanner ;


public class patternprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scanner = new Scanner(System.in);
		System.out.print("By Devendra Gautm");
	
		System.out.println("\nenter a no");
		int n = scanner.nextInt();
				
		for(int i=1;i<=n;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print("* ");
						}
					System.out.println("");
				}	
	}

}

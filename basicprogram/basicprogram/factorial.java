package basicprogram;

import java.util.Scanner ;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("By Devendra Gautam  ") ;
		Scanner scanner = new Scanner(System.in);
		
		int fact = 1 ;
		
		System.out.println("give no for factorial: ") ;
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			fact = fact*i ;
		}
		
		System.out.print("factorial is :" + fact);

	}

}

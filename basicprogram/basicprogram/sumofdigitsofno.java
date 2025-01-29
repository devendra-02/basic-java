package basicprogram;

import java.util.Scanner ;

public class sumofdigitsofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scanner = new Scanner(System.in);
		System.out.println("By Devendra ");
		System.out.println("enter a no ");
		int n = scanner.nextInt();
		 int sum = 0 ;
		 int lastdigit ;
		 
     System.out.println("the sum of digit of given no " + n + " is : ");
     
     while(n!=0) {
    	 lastdigit = n%10 ;
    	 sum = sum+lastdigit ;
    	 n=n/10 ;
     }
     System.out.println("sum = " + sum );
	}

}

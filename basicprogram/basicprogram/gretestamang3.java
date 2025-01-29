package basicprogram;

import java.util.Scanner ;

public class gretestamang3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("By Devendra Gautam  ") ;
		
		System.out.println("enter a num1 ");
		int num1 = scanner.nextInt();
		
		System.out.println("enter a num2 ");
		int num2 = scanner.nextInt();
		
		System.out.println("enter a num3 ");
		int num3 = scanner.nextInt();
		
		if( num1 > num2 && num1 > num3)
        	System.out.println(" greatest no is :" + num1);
        else if( num2 > num1 && num2 > num3)
        	System.out.println(" greatest no is :" + num2);
        else
        	System.out.println(" greatest no is :" + num3);
        	
		
		
		
	}

}

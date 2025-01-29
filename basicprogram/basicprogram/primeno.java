package basicprogram;

import java.util.Scanner ;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("By Devendra Gautam  ") ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter a no : ");
		int n = scanner.nextInt();
		
		int m ,f ;
		
		 System.out.println("prime no are ");
		for(int i=2;i<=n;i++) {
			 m = i ;
			 f = 0 ;
			for(int j=2;j<m;j++) {
				if(m%j==0) {
					f = 1 ;
					break ;
				}
			}
			if(f==0){
				System.out.print(" " + m);
			}
		}

		
	}

}

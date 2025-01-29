package basicprogram;


	class Bank { 
		int getRateOfInterest() { 
		return 0; // Default implementation (to be overridden by subclasses) 
		} 
		} 
		 
		class SBI extends Bank { 
		@Override 
		int getRateOfInterest() { 
		return 8; // SBI provides 8% interest 
		} 
		} 
		 
		class ICICI extends Bank { 
		@Override 
		int getRateOfInterest() { 
		return 7; // ICICI provides 7% interest 
		} 
		} 
		 
		class AXIS extends Bank { 
		@Override 
		int getRateOfInterest() { 
		return 9; // AXIS provides 9% interest 
		} 
		} 
		 
		public class Q16_overriding { 
		public static void main(String[] args) { 
			System.out.println("By Devendra Gautam:");
			
		Bank sbi = new SBI(); 
		Bank icici = new ICICI(); 
		Bank axis = new AXIS(); 
		 
		System.out.println("SBI Interest Rate: " + sbi.getRateOfInterest() + "%"); 
		System.out.println("ICICI Interest Rate: " + icici.getRateOfInterest() + "%"); 
		System.out.println("AXIS Interest Rate: " + axis.getRateOfInterest() + "%"); 
		} 
		}


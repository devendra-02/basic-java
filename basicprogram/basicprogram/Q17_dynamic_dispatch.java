package basicprogram;


	class Animal { 
		void makeSound() { 
		System.out.println("Animal makes a sound"); 
		} 
		} 
		 
		class Dog extends Animal { 
		@Override 
		void makeSound() { 
		System.out.println("Dog barks"); 
		} 
		} 
		 
		class Cat extends Animal { 
		@Override 
		void makeSound() { 
		System.out.println("Cat meows"); 
		} 
		} 
		 
		public class Q17_dynamic_dispatch { 
			
		public static void main(String[] args) {
			System.out.println("By Devendra Gautam:");
		Animal animal1 = new Animal(); 
		Animal animal2 = new Dog(); 
		Animal animal3 = new Cat(); 
		 
		animal1.makeSound(); // Calls Animal’s version of makeSound() 
		animal2.makeSound(); // Calls Dog’s version of makeSound() 
		animal3.makeSound(); // Calls Cat’s version of makeSound() 
		} 
		}


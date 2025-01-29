package basicprogram;
 
abstract class Vehicle { 
		private String brand; 
		private String model; 
		private int year; 
		 
		public Vehicle(String brand, String model, int year) { 
			System.out.println("by Devendra Gautam ");	
		this.brand = brand; 
		this.model = model; 
		this.year = year; 
		} 
		 
		public String getBrand() { 
		return brand; 
		} 
		 
		public String getModel() { 
		return model; 
		} 
		 
		public int getYear() { 
		return year; 
		} 
		 
		// Abstract method to be implemented by subclasses 
		public abstract void drive(); 
		 
		// Abstract method to be implemented by subclasses 
		public abstract void stop(); 
		} 
		 
		class Car extends Vehicle { 
		public Car(String brand, String model, int year) { 
		super(brand, model, year); 
		} 
		 
		@Override 
		public void drive() { 
			System.out.println("By Sumit:");
		System.out.println("Car is driving."); 
		} 
		 
		@Override 
		public void stop() { 
		System.out.println("Car has stopped."); 
		} 
		} 
		 
		class Motorcycle extends Vehicle { 
		public Motorcycle(String brand, String model, int year) { 
		super(brand, model, year); 
		} 
		 
		@Override 
		public void drive() { 
		System.out.println("Motorcycle is driving."); 
		} 
		 
		@Override 
		public void stop() { 
		System.out.println("Motorcycle has stopped."); 
		} 
		} 
		 
		public class Q18_vehicle_Abstract_class { 
		public static void main(String[] args) { 
		Car car = new Car("Toyota", "Camry", 2020); 
		car.drive(); 
		car.stop(); 
		 
		System.out.println(); 
		 
		Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021); 
		motorcycle.drive(); 
		motorcycle.stop(); 
		} 
		}



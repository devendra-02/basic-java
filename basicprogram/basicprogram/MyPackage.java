package basicprogram;

public class MyPackage {
	// File: Main.java
	import MyPackage.MyClass;

	public class Main {
	    public static void main(String[] args) {
	        MyClass obj = new MyClass();
	        obj.display();
	    }
	}

}

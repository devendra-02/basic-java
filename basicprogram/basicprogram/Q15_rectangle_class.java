package basicprogram;
class Shape { 
int length; 
int breadth; 
 
Shape(int length, int breadth) { 
this.length = length; 
this.breadth = breadth; 
} 
} 
 
class Rectangle extends Shape { 
Rectangle(int length, int breadth) { 
super(length, breadth); 
} 
 
int calculateArea() { 
return length * breadth; 
} 
} 
 
public class Q15_rectangle_class { 
public static void main(String[] args) { 
	System.out.println("By Devendra Gautam:");
int length = 10; 
int breadth = 3; 
 
Rectangle rect = new Rectangle(length, breadth); 
int area = rect.calculateArea(); 

System.out.println("Rectangle Area: " + area); 
} 
}



//Exercise 1 : The Shape Class
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a base Shape class with
* date: 02/02/2023
*/
package exercise1;

public class Rectangle extends Shape {
	private boolean isRectangle;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double width, double height,boolean isRectangle) {
		super(width, height);
		this.isRectangle = false;
	}
	
	public double getArea() {
	  	return shapeArea();
	}
	
}

//Exercise 1 : The Shape Class
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a base Shape class with
* date: 06/02/2023
*/
package exercise1;

public abstract class Shape {
	protected double width, height;

	public Shape() {
		super();
	}

	public Shape(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double shapeArea() {
		return this.width*this.height;
	}
	

}

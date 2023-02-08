//Exercise 1 : The Shape Class
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a base Shape class with
* date: 06/02/2023
*/

package exercise1;

public class Square extends Shape {
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double width, double height) {
		super(width, height);
	}
	
	public boolean ifIsSquare() {
	  	return (this.height == this.width) ? true:false; 
	}

}

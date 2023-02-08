//Exercise 1 : The Shape Class
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a base Shape class with
* date: 02/02/2023
*/
package exercise1;

public class Main {

	public static void main(String[] args) {

		System.out.println("######## RECTANGLE #########");
		Rectangle rectangle = new Rectangle(45.5, 14.6, false);
		System.out.print("The area of the Rectangle is : "+rectangle.getArea());
		System.out.println("\n######### SQUARE ##########");
		Square square = new Square(47, 47);
		System.out.print("The Shape it is a square : "+square.ifIsSquare());
	}

}

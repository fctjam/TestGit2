/* Ashley Pugh
   CSC220-05
   Lab 10 
   November 7, 2017 */



/* This program tests the methods set up in the Rectangle and RectPrism classes */

public class Demo {

	public static void main(String[] args) {

		// Creating an instance of the Rectangle class in an object
		Rectangle rect1 = new Rectangle (5,2);

		// Creating an instance of the RectPrism class in an object
		RectPrism rect2 = new RectPrism (5,2,3);

		// Testing the toString method by printing out the values
		System.out.println("Rectangle: " + "\n" + rect1);

		// Printing a space between the two objects
		System.out.println("");

		// Testing the toString method by printing out the values
		System.out.println("Rectangular Prism: " + "\n" + rect2);
	}
}
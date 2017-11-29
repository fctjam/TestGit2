/* Ashley Pugh
   CSC220-05
   Lab 10 
   November 7, 2017 */

/* This the the parent class that defines attributes of a rectangle */

public class Rectangle {

	// Instance variable for height of rectangle
	double height;

	// Instance variable for width of rectangle
	double width;

	// Constructor for rectangle that initializes height and width
	Rectangle(double inWidth, double inHeight) {
		width = inWidth;
		height = inHeight;
	}

	// Sets the width to the value passed through the parameter
	public void setWidth(double inWidth) {
		width = inWidth;
	}

	// Sets the height to the value passed through th parameter
	public void setHeight(double inHeight) {
		height = inHeight;
	}

	// Returns the width
	public double getWidth() {
		return width;
	}

	//Returns the height
	public double getHeight() {
		return height;
	}

	// Returns a string representation of the rectangle containing the value of all instance variables and surface area
	// QQ Don't include surface area
	public String toString() {
		return "Width: " + width +
				"\nHeight: " + height ;
	}

	// Returns the calculated area of the rectangle
	double computeSurfaceArea() {
		return width * height;
	}
}
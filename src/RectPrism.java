/* Ashley Pugh
   CSC220-05
   Lab 10 
   November 7, 2017 */

/* This is the child class that defines attributes of a rectangular prism by
	using the rectangle class's methods and adding to it */

public class RectPrism extends Rectangle {

	// Instance variable for depth of the regtangular prism
	double depth;

	// Constructor for rectangular prism that initializes depth
	RectPrism(double inWidth, double inHeight, double inDepth) {
		super(inWidth, inHeight);
		width = inWidth;
		height = inHeight;
		depth = inDepth;
	}

	public void setDepth (double inDepth) {
		depth = inDepth;
	}

	public double getDepth() {
		return depth;
	}

	// Returns the calculated volume of the rectangular prism
	public double computeVolume() {
		return width * height * depth;
	}

	// Overriding the toString method from the rectangle class to include the depth
	// QQ Exclude computeSurfaceAre and Volume
	@Override
	public String toString() {
		return "Width: " + width +
				"\nHeight: " + height +
				"\nDepth: " + depth +
				"\nSurface Area: " + computeSurfaceArea() +
				"\nVolume: " + computeVolume();
	}

	// Overriding the computeSurfaceArea method from the rectangle class to get the surface area of the rectangular prism
	@Override
	double computeSurfaceArea() { 
		return 2 * ((width * depth) + (height * width) + (height * depth));
	}
	
}
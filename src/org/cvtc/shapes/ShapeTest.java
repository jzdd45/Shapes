package org.cvtc.shapes;

// Class name and container
public class ShapeTest {

	// This is the main method which will kick off the program
	public static void main(String[] args) throws NegativeNumException {
		
		// Creating new objects form our classes and giving them values
		Dialog dialog = new MessageBox();
		Renderer cylinder = new Cylinder(dialog, 10.0f, 10.0f);
		Renderer cuboid = new Cuboid(dialog, 3.0f, 8.7f, 5.0f);
		Renderer sphere = new Sphere(dialog, 5.0f);
		
		// Outputting our values via the render method
		cylinder.render();
		cuboid.render();
		sphere.render();

	}

}

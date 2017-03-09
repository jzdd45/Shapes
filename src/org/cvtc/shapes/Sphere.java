package org.cvtc.shapes;

// Class name and container
public class Sphere extends Shape implements Renderer {

	// Private Class variable
	private float radius = 0.0f;

	// Constructor which will take in the passed-in value and check if it is less than zero.
	// If it is less than zero an exception is thrown.
	public Sphere(Dialog dialog, float radius) throws NegativeNumException {
		
		super(dialog);
		
		if (radius < 0) {
			throw new NegativeNumException();
		}
		
		setRadius(radius);
	}
	
	// Getter which allows you to retrieve the value
	public float getRadius() {
		return radius;
	}

	// Setter which allows you to set the value
	public void setRadius(float radius) {
		this.radius = radius;
	}

	// This the inherited surfaceArea method from the Shape superclass.
	// It performs the formula that is needed to calculate the surface area.
	@Override
	public float surfaceArea() {
		return (float) (4 * Math.PI * Math.pow(getRadius(), 2));
	}

	// This the inherited volume method from the Shape superclass.
	// It performs the formula that is needed to calculate the volume.
	@Override
	public float volume() {
		return (float) ((4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3));
	}

	
	public int render() {
		
		return getDialog().show("The sphere's dimensions are: \n" + "Radius: " + (getRadius())
				+ "\n\nCalculations:\nSurface Area: " + (surfaceArea()) 
				+ "\nVolume: " + (volume()));
	}
}

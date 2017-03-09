package org.cvtc.shapes;

//Class name and container
public class Cylinder extends Shape implements Renderer {

	// Private Class variables
	private float radius = 0.0f;
	private float height = 0.0f;
	
	// Constructor which will take in the passed-in value and check if it is less than zero.
	// If it is less than zero an exception is thrown.
	public Cylinder(Dialog dialog, float radius, float height) throws NegativeNumException {
		
		super(dialog);
		
		if (radius < 0) {
			throw new NegativeNumException();
		} else if (height < 0) {
			throw new NegativeNumException();
		}
		
		setRadius(radius);
		setHeight(height);
		
	}
	
	// Getter which allows you to retrieve the value
	public float getRadius() {
		return radius;
	}

	// Setter which allows you to set the value
	public void setRadius(float radius) {
		this.radius = radius;
	}

	// Getter which allows you to retrieve the value
	public float getHeight() {
		return height;
	}

	// Setter which allows you to set the value
	public void setHeight(float height) {
		this.height = height;
	}

	// This the inherited surfaceArea method from the Shape superclass.
	// It performs the formula that is needed to calculate the surface area.
	@Override
	public float surfaceArea() {
		return (float) (2 * Math.PI * getRadius() * getHeight() + 2 * Math.PI * Math.pow(getRadius(), 2)); 
	}

	// This the inherited volume method from the Shape superclass.
	// It performs the formula that is needed to calculate the volume.
	@Override
	public float volume() {
		return (float) ((Math.PI * getRadius() * getRadius()) * getHeight());
	}
	
	public int render() {
		
		return getDialog().show("The cylinder's dimensions are: \n" + "Radius: " + (getRadius())
				+ "\nheight: " + (getHeight())
				+ "\n\nCalculations:\nSurface Area: " + (surfaceArea()) 
				+ "\nVolume: " + (volume()));
	}

}

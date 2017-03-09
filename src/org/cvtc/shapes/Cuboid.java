package org.cvtc.shapes;

import org.cvtc.shapes.Dialog;

// Class name and container
public class Cuboid extends Shape implements Renderer {

	// Private Class variables 
	private float width = 0.0f;
	private float height = 0.0f;
	private float depth = 0.0f;

	// Constructor which will take in the passed-in value and check if it is less than zero.
	// If it is less than zero an exception is thrown.
	public Cuboid(Dialog dialog, float width, float height, float depth) throws NegativeNumException {
		
		super(dialog);

		if (width < 0) {
			throw new NegativeNumException();
		} else if (height < 0) {
			throw new NegativeNumException();
		} else if (depth < 0) {
			throw new NegativeNumException();
		}
		
		setWidth(width);
		setHeight(height);
		setDepth(depth);
		
	}
	
	// Getter which allows you to retrieve the value
	public float getWidth() {
		return width;
	}

	// Setter which allows you to set the value
	private void setWidth(float width) {
		this.width = width;
	}
	
	// Getter which allows you to retrieve the value
	public float getHeight() {
		return height;
	}
	
	// Setter which allows you to set the value
	private void setHeight(float height) {
		this.height = height;
	}
	
	// Getter which allows you to retrieve the value
	public float getDepth() {
		return depth;
	}
	
	// Setter which allows you to set the value
	private void setDepth(float depth) {
		this.depth = depth;
	}

	// This the inherited surfaceArea method from the Shape superclass.
	// It performs the formula that is needed to calculate the surface area.
	@Override
	public float surfaceArea() {
		return 2 * (getWidth() * getDepth() + getWidth() * getHeight() + getHeight() * getDepth());
	}

	// This the inherited volume method from the Shape superclass.
	// It performs the formula that is needed to calculate the volume.
	@Override
	public float volume() {
		return getDepth() * getWidth() * getHeight();
	}

	public int render() {

		return getDialog().show("The cuboid's dimensions are: \n" + "width: " + (getWidth())
				+ "\nheight: " + (getHeight()) + " \ndepth: " + (getDepth()) 
				+ "\n\nCalculations:\nSurface Area: " + (surfaceArea()) 
				+ "\nVolume: " + (volume()));
		
	}
	
}

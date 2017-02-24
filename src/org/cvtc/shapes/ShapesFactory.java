package org.cvtc.shapes;

public class ShapesFactory {

	private Dialog dialog;
	
	protected Dialog getDialog() {
		return dialog;
	}
	
	public ShapesFactory(Dialog messageBox) {
		this.dialog = messageBox;
	}
	
	public Shape makeCuboid(Dialog messageBox, float width, float height, float depth) throws NegativeNumException {
		return new Cuboid(dialog, width, height, depth);
	}
	
	public Shape makeCylinder(Dialog messageBox, float radius, float height) throws NegativeNumException {
		return new Cylinder(dialog, radius, height);
	}
	
	public Shape makeSphere(Dialog messageBox, float radius) throws NegativeNumException {
		return new Sphere(dialog, radius);
	}
	
}

package org.cvtc.shapes;

// Abstract class definition
public abstract class Shape implements Renderer {
	
	private Dialog dialog;
	
	protected Dialog getDialog() {
		
		return dialog;
		
	}
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
		
	}
	
	// SAG: Define a Shape constructor that accepts a Dialog interface
	public Shape(Dialog dialog) {
		setDialog(dialog);
	
	}
	
	
	
	// Abstract method our sub classes can use to calculate surface area.
	public abstract float surfaceArea();
	
	// Abstract method our sub classes can use to calculate volume.
	public abstract float volume();
	
}
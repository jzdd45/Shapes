package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog{

	public int show(String message) {
		
		JOptionPane.showMessageDialog(null, message);
		
		return JOptionPane.OK_OPTION;
	}
	
}

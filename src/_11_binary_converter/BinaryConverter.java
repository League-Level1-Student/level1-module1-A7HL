package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {	
	JFrame frame = new JFrame("Convert 8 bits of Binary to ASCII");
	JButton button = new JButton();
	JTextField text = new JTextField(20);
	JPanel pane = new JPanel();
	JLabel label = new JLabel();
	public static void main(String[] args) {
		
		
		new BinaryConverter().run();
		
	
	
	}
	public void run() {
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setText("convert");
		frame.add(pane);
		
		pane.add(text);
		pane.add(button);
		pane.add(label);
		button.addActionListener(this);
		frame.pack();
		frame.setSize(550,90);
		label.setSize(550,90);
		pane.setSize(550,90);
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
			JButton buttonPressed = (JButton) arg0.getSource();
			if(buttonPressed==button) {
				String convertedText = "ASCII: " + convert(text.getText());
				label.setText(convertedText);
			}
			
		}
	}


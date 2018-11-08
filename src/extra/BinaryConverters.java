package extra;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField; 


public class BinaryConverters implements MouseListener {   
	JTextField inputText = null; 
	JLabel answerLabel = null;
public static void main(String[] args) { 
	new BinaryConverters().getGoing();
}
	
private void getGoing() { 
	
	JFrame frame = new JFrame(); 
	frame.setVisible(true); 
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	JPanel panel = new JPanel(); 
	frame.add(panel);
	answerLabel = new JLabel(); 
	answerLabel.setText("");
    inputText = new JTextField(20);
	inputText.setText("Enter your Binary number.");  
	panel.add(answerLabel); 
	panel.add(inputText); 
	frame.pack(); 
	frame.setSize(500,100);  
	JButton button = new JButton(); 
	button.setText("Convert"); 
	panel.add(button); 
	button.addMouseListener(this);
	} 
	 String convert(String input) {
         if(input.length() != 8){
              JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
              return "-";
         }
         String binary = "[0-1]+";    //must contain numbers in the given range
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
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub 
		String myBinary;
	myBinary=inputText.getText();   
	//System.out.println(myBinary);
	answerLabel.setText(convert(myBinary)); 
	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}	
	
	
	
	



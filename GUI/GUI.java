package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI {
	public static void main(String[]args)
	{
		JFrame f = new JFrame();
		JButton nextButton = new JButton("Next");
		JTextField tf = new JTextField();
		JLabel l = new JLabel("Please Enter Your Name: ");
				
		//labels
		l.setBounds(100,70,250,30);
		f.add(l);
		
		//Text fields
		tf.setBounds(95,100,250,30);
		f.add(tf);
		
		//buttons
		nextButton.setBounds(92,140,100,30);
		nextButton.setLayout(null);
		nextButton.setVisible(true);
		f.add(nextButton);
		
		//properties
		nextButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame f = new JFrame();
				JLabel l = new JLabel("Yo Gardyan");
				
				l.setBounds(100,70,250,30);
				f.add(l);
				
				f.setSize(400,500);
				f.setLayout(null);
				f.setVisible(true);
			}
			
		});
		
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}


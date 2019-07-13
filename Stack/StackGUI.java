package Stack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/////////////////////////////////////////////////////////////////////
public class StackGUI implements ActionListener
{
	private ArrayStack<String> arrStack;
	//private LinkedStack linkStack;
	private JFrame frame;
	private JLabel mainDisplay, result;
	private JPanel panel;
	private JTextField input;
	private JButton submit;
	//-------------------------------------------------------------------
	public StackGUI()
	{
		frame = new JFrame("Stack Interface");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500, 350);
		frame.setLayout(new GridLayout(0, 1));
		frame.getContentPane().setBackground(new Color(255, 205, 0));
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
		
		mainDisplay = new JLabel("Which Stack Path?");
		mainDisplay.setFont(new Font("Myriad", Font.BOLD, 20));
		mainDisplay.setHorizontalAlignment(JLabel.CENTER);
		
		JTextField input = new JTextField();
		
		JButton arrButton = new JButton("Array Path");
		arrButton.setFont(new Font("Myriad", Font.BOLD, 20));
		arrButton.setBackground(Color.BLACK);
		arrButton.setForeground(Color.WHITE);
		
		JButton linkButton = new JButton("Linked List Path");
		linkButton.setFont(new Font("Myriad", Font.BOLD, 20));
		linkButton.setBackground(Color.WHITE);
		linkButton.setForeground(Color.BLACK);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		panel.setBackground(new Color(255, 205, 0));
		
		arrButton.addActionListener(this);
		linkButton.addActionListener(this);
		
		frame.add(mainDisplay);
		panel.add(arrButton);
		panel.add(linkButton);
		frame.add(panel);
		
		frame.setVisible(true);
	}
	//-------------------------------------------------------------------
	public void arrayOperations()
	{
		arrStack = new ArrayStack<>();
		
		frame.setTitle("Array Stack");
		mainDisplay.setText("What would you like to do?");
		
		frame.remove(panel);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		panel.setBackground(new Color(255, 205, 0));
		
		JButton peek = new JButton("Peek");
		peek.setFont(new Font("Myriad", Font.BOLD, 20));
		peek.setBackground(new Color(153, 0, 0));
		peek.setForeground(Color.WHITE);
		
		JButton push = new JButton("Push");
		push.setFont(new Font("Myriad", Font.BOLD, 20));
		push.setBackground(new Color(0, 0, 153));
		push.setForeground(Color.WHITE);
		
		JButton pop = new JButton("Pop");
		pop.setFont(new Font("Myriad", Font.BOLD, 20));
		pop.setBackground(new Color(0, 102, 0));
		pop.setForeground(Color.WHITE);
		
		JButton getSize = new JButton("Get Size");
		getSize.setFont(new Font("Myriad", Font.BOLD, 20));
		getSize.setBackground(new Color(255, 204, 0));
		getSize.setForeground(Color.WHITE);
		
		peek.addActionListener(this);
		push.addActionListener(this);
		pop.addActionListener(this);
		getSize.addActionListener(this);
		
		panel.add(push);
		panel.add(pop);
		panel.add(peek);
		panel.add(getSize);
		
		frame.add(panel);
		
		submit = new JButton("Array Submit!");
		submit.setFont(new Font("Myriad", Font.BOLD, 20));
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
	}
	//-------------------------------------------------------------------
	public void actionPerformed(ActionEvent ae)
	{
		switch(ae.getActionCommand())
		{
			case "Array Path":
				arrayOperations();
				break;
			case "Linked List Path":
				//linkedListOperations();
				break;
			case "Push":
				frame.setTitle("Array Push");
				mainDisplay.setText("What would you like to push?");
				frame.remove(panel);
				
				panel = new JPanel();
				panel.setLayout(new GridLayout(0, 2));
				panel.setBorder(new EmptyBorder(20, 20, 20, 20));
				panel.setBackground(new Color(255, 205, 0));
				
				input = new JTextField();
				input.setFont(new Font("Myriad", Font.BOLD, 20));
				
				submit.setText("Array Submit");
				
				panel.add(input);
				panel.add(submit);
				frame.add(panel);
				break;
				
			case "Pop":
				frame.setTitle("Array Pop");
				mainDisplay.setText("You Popped");
				frame.remove(panel);
				
				panel = new JPanel();
				panel.setLayout(new GridLayout(0, 2));
				panel.setBorder(new EmptyBorder(20, 20, 20, 20));
				panel.setBackground(new Color(255, 205, 0));
				
				result = new JLabel(arrStack.pop());
				result.setFont(new Font("Myriad", Font.BOLD, 20));
				result.setHorizontalAlignment(JLabel.CENTER);
				
				submit.setText("Array Submit");
				
				panel.add(result);
				panel.add(submit);
				frame.add(panel);
				break;
				
			case "Peek":
				frame.setTitle("Array Push");
				mainDisplay.setText("What would you like to push?");
				frame.remove(panel);
				
				panel = new JPanel();
				panel.setLayout(new GridLayout(0, 2));
				panel.setBorder(new EmptyBorder(20, 20, 20, 20));
				panel.setBackground(new Color(255, 205, 0));
				
				input = new JTextField();
				input.setFont(new Font("Myriad", Font.BOLD, 20));
				
				submit = new JButton("Array Submit!");
				submit.setFont(new Font("Myriad", Font.BOLD, 20));
				submit.setBackground(Color.BLACK);
				submit.setForeground(Color.WHITE);
				submit.addActionListener(this);
				
				panel.add(input);
				panel.add(submit);
				frame.add(panel);
				break;
			case "Get Size":
				frame.setTitle("Array Push");
				mainDisplay.setText("What would you like to push?");
				frame.remove(panel);
				
				panel = new JPanel();
				panel.setLayout(new GridLayout(0, 2));
				panel.setBorder(new EmptyBorder(20, 20, 20, 20));
				panel.setBackground(new Color(255, 205, 0));
				
				input = new JTextField();
				input.setFont(new Font("Myriad", Font.BOLD, 20));
				
				JButton submit = new JButton("Array Submit!");
				submit.setFont(new Font("Myriad", Font.BOLD, 20));
				submit.setBackground(Color.BLACK);
				submit.setForeground(Color.WHITE);
				submit.addActionListener(this);
				
				panel.add(input);
				panel.add(submit);
				frame.add(panel);
				break;
			case "Array Submit":
				frame.setTitle("Array Stack");
				mainDisplay.setText("What would you like to do?");
				
				frame.remove(panel);
				
				panel = new JPanel();
				panel.setLayout(new GridLayout(0, 2));
				panel.setBorder(new EmptyBorder(20, 20, 20, 20));
				panel.setBackground(new Color(255, 205, 0));
				
				JButton peek = new JButton("Peek");
				peek.setFont(new Font("Myriad", Font.BOLD, 20));
				peek.setBackground(new Color(153, 0, 0));
				peek.setForeground(Color.WHITE);
				
				JButton push = new JButton("Push");
				push.setFont(new Font("Myriad", Font.BOLD, 20));
				push.setBackground(new Color(0, 0, 153));
				push.setForeground(Color.WHITE);
				
				JButton pop = new JButton("Pop");
				pop.setFont(new Font("Myriad", Font.BOLD, 20));
				pop.setBackground(new Color(0, 102, 0));
				pop.setForeground(Color.WHITE);
				
				JButton getSize = new JButton("Get Size");
				getSize.setFont(new Font("Myriad", Font.BOLD, 20));
				getSize.setBackground(new Color(255, 204, 0));
				getSize.setForeground(Color.WHITE);
				
				peek.addActionListener(this);
				push.addActionListener(this);
				pop.addActionListener(this);
				getSize.addActionListener(this);
				
				panel.add(push);
				panel.add(pop);
				panel.add(peek);
				panel.add(getSize);
				
				frame.add(panel);
		}
	}
	//-------------------------------------------------------------------	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(() -> new StackGUI());
	}
	//-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////
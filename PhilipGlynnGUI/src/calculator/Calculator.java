package calculator;
import java.awt.*;
import javax.swing.*;

public class Calculator {
	
	  private JFrame frame;
	  private JTextArea display;
	  private JPanel topPanel;
	  private JPanel bottomPanel;
	  private JButton one;
	  private JButton two;
	  private JButton three;
	  private JButton four;
	  private JButton five;
	  private JButton six;
	  private JButton seven;
	  private JButton eight;
	  private JButton nine;
	  private JButton zero;
	  private JButton multiply;
	  private JButton divide;
	  private JButton plus;
	  private JButton minus;
	

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		

	}
	
	public Calculator(){
		createGUI();
	}
	
	
	private void createGUI() {
		 JFrame frame = new JFrame("Calculator");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 topPanel = new JPanel(new FlowLayout());
		 topPanel.setBackground(Color.GRAY);
		 
		 display = new JTextArea(10, 40);
		 
		 display.setEditable(true); // set textArea non-editable
		 topPanel.add(display);
		 
		 
		 //bottom panel
		 one = new JButton ("1");
		 two = new JButton ("2");
		 three = new JButton ("3");
		 four = new JButton ("4");
		 five = new JButton ("5");
		 six = new JButton ("6");
		 seven = new JButton ("7");
		 eight = new JButton ("8");
		 nine = new JButton ("9");
		 zero = new JButton ("0");
		 
		 multiply = new JButton ("x");
		 divide = new JButton ("÷");
		 plus = new JButton ("+");
		 minus = new JButton ("-");
		 
		 
		 bottomPanel = new JPanel(new GridLayout(0,3));
		 bottomPanel.setBackground(Color.GRAY);
		 bottomPanel.add(one);
		 bottomPanel.add(two);
		 bottomPanel.add(three);
		 bottomPanel.add(four);
		 bottomPanel.add(five);
		 bottomPanel.add(six);
		 bottomPanel.add(seven);
		 bottomPanel.add(eight);
		 bottomPanel.add(nine);
		 bottomPanel.add();
		 bottomPanel.add(zero);
		 
		 bottomPanel.add(multiply);
		 bottomPanel.add(divide);
		 bottomPanel.add(plus);
		 bottomPanel.add(minus);
		 
		 
		 frame.add(topPanel, BorderLayout.NORTH);
		 frame.add(bottomPanel, BorderLayout.CENTER);
		 
		//Display the window.
	        frame.pack();
	        frame.setVisible(true);
	}
	
}

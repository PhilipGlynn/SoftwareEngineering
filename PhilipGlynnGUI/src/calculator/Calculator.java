package calculator;
import java.awt.*;
import javax.swing.*;

import net.miginfocom.swing.MigLayout;

public class Calculator {
	
	  private JFrame frame;
	  private TextField display;
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
	  private JButton equals;
	

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		

	}
	
	public Calculator(){
		createGUI();
	}
	
	
	private void createGUI() {
		 JFrame frame = new JFrame("Calculator");
		 frame.setPreferredSize(new Dimension(500,550));
		 frame.setResizable(false);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 topPanel = new JPanel(new FlowLayout());
		 topPanel.setBackground(Color.GRAY);
		 
		 display = new TextField("",13);
		 Font font = new Font("Serif", Font.BOLD, 70);
		 Font font2 = new Font("Serif", Font.BOLD, 50);
	     display.setFont(font);
		 
		 display.setEditable(false); // set textArea non-editable
		 topPanel.add(display);
		 
		 //bottom panel
		 one = new JButton ("1");
		 one.setFont(font2);
		 two = new JButton ("2");
		 two.setFont(font2);
		 three = new JButton ("3");
		 three.setFont(font2);
		 four = new JButton ("4");
		 four.setFont(font2);
		 five = new JButton ("5");
		 five.setFont(font2);
		 six = new JButton ("6");
		 six.setFont(font2);
		 seven = new JButton ("7");
		 seven.setFont(font2);
		 eight = new JButton ("8");
		 eight.setFont(font2);
		 nine = new JButton ("9");
		 nine.setFont(font2);
		 zero = new JButton ("0");
		 zero.setFont(font2);
		 
		 multiply = new JButton ("x");
		 multiply.setFont(font2);
		 divide = new JButton ("÷");
		 divide.setFont(font2);
		 plus = new JButton ("+");
		 plus.setFont(font2);
		 minus = new JButton ("-");
		 minus.setFont(font2);
		 equals = new JButton ("=");
		 equals.setFont(font2);
		 
		 bottomPanel = new JPanel(new MigLayout("fill, wrap 3", "[33%][33%][33%]","[20lp, fill]0"));
		 bottomPanel.setBackground(Color.GRAY);
		 one.setPreferredSize(new Dimension(1000,1000));
		 two.setPreferredSize(new Dimension(1000, 1000));
		 three.setPreferredSize(new Dimension(1000, 1000));
		 four.setPreferredSize(new Dimension(1000, 1000));
		 five.setPreferredSize(new Dimension(1000, 1000));
		 six.setPreferredSize(new Dimension(1000, 1000));
		 seven.setPreferredSize(new Dimension(1000, 1000));
		 eight.setPreferredSize(new Dimension(1000, 1000));
		 nine.setPreferredSize(new Dimension(1000, 1000));
		 zero.setPreferredSize(new Dimension(1000, 1000));
		 divide.setPreferredSize(new Dimension(1000, 1000));
		 plus.setPreferredSize(new Dimension(1000, 1000));
		 minus.setPreferredSize(new Dimension(1000, 1000));
		 equals.setPreferredSize(new Dimension(1000, 1000));
		 multiply.setPreferredSize(new Dimension(1000, 1000));
		 
		 bottomPanel.add(one);
		 bottomPanel.add(two);
		 bottomPanel.add(three);
		 bottomPanel.add(four);
		 bottomPanel.add(five);
		 bottomPanel.add(six);
		 bottomPanel.add(seven);
		 bottomPanel.add(eight);
		 bottomPanel.add(nine);
		 bottomPanel.add(multiply);
		 bottomPanel.add(zero);
		 bottomPanel.add(divide);
		 bottomPanel.add(plus);
		 bottomPanel.add(minus);
		 bottomPanel.add(equals);
		 
		 
		 frame.add(topPanel, BorderLayout.NORTH);
		 frame.add(bottomPanel, BorderLayout.CENTER);
		 frame.pack();
		 
		//Display the window.
	        frame.pack();
	        frame.setVisible(true);
	}
	
}

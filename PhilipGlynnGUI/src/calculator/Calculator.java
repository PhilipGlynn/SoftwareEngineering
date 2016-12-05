package calculator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	  private JButton clear;
	  private boolean answerState = false;
	  private static int state = 0;
	  private static Integer sum = 0;
	  int answer = 0;
	  StringBuilder stringbuilder = new StringBuilder();
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		

	}
	
	public Calculator(){
		createGUI();
	}
	
	
	private void createGUI() {
		
		 JFrame frame = new JFrame("Calculator");
		 frame.setPreferredSize(new Dimension(500,600));
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
		 
		 multiply = new JButton ("*");
		 multiply.setFont(font2);
		 divide = new JButton ("÷");
		 divide.setFont(font2);
		 plus = new JButton ("+");
		 plus.setFont(font2);
		 minus = new JButton ("-");
		 minus.setFont(font2);
		 equals = new JButton ("=");
		 equals.setFont(font2);
		 clear = new JButton ("clear");
		 clear.setFont(font2);
		 
		 bottomPanel = new JPanel(new MigLayout("fill, wrap 4", "[25%][25%][25%][25%]","[20lp, fill]0"));
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
		 clear.setPreferredSize(new Dimension(1000, 1000));
		 
		 bottomPanel.add(seven);
		 bottomPanel.add(eight);
		 bottomPanel.add(nine);
		 bottomPanel.add(clear);
		 bottomPanel.add(four);
		 bottomPanel.add(five);
		 bottomPanel.add(six);
		 bottomPanel.add(multiply);
		 bottomPanel.add(one);
		 bottomPanel.add(two);
		 bottomPanel.add(three);
		 bottomPanel.add(divide);
		 bottomPanel.add(plus);
		 bottomPanel.add(zero);
		 bottomPanel.add(minus);
		 bottomPanel.add(equals);
		 
		 
		 frame.add(topPanel, BorderLayout.NORTH);
		 frame.add(bottomPanel, BorderLayout.CENTER);
		 frame.pack();
		 
		//Display the window.
        frame.pack();
        frame.setVisible(true);
        clear.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				stringbuilder.delete(0, stringbuilder.length());
				display.setText(stringbuilder.toString());
				display.setText("");
				answer = 0;
				state = 0;
				answerState = false;
			}
		});    
        nine.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				
				stringbuilder.append("9");
				display.setText(stringbuilder.toString());
				if (answerState == true){
					answerState = false;
				}
			}
		});
		
		eight.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				
				stringbuilder.append("8");
				display.setText(stringbuilder.toString());
				if (answerState == true){
					answerState = false;
				}
			}
		});
		seven.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				
				stringbuilder.append("7");
				display.setText(stringbuilder.toString());
				if (answerState == true){
					answerState = false;
				}
			}
		});
		six.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				
				stringbuilder.append("6");
				display.setText(stringbuilder.toString());
				if (answerState == true){
					answerState = false;
				}
			}
		});
		five.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				
				stringbuilder.append("5");
				display.setText(stringbuilder.toString());
				if (answerState == true){
					answerState = false;
				}
			}
		});
		four.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {	
				stringbuilder.append("4");
				display.setText(stringbuilder.toString());
				if (answerState == true){
					answerState = false;
				}
			}
		});
		three.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				
				stringbuilder.append("3");
				display.setText(stringbuilder.toString());
				if (answerState == true){
					answerState = false;
				}
			}
		});
		two.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				
				stringbuilder.append("2");
				display.setText(stringbuilder.toString());
				if (answerState == true){
					answerState = false;
				}
			}
		});
		one.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				
				stringbuilder.append("1");
				display.setText(stringbuilder.toString());
				if (answerState == true){
					answerState = false;
				}
			}
		});
		zero.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				
				stringbuilder.append("0");
				display.setText(stringbuilder.toString());
				if (answerState == true){
					answerState = false;
				}
			}
		});
		divide.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				
				if(state == 1){
					answer = ans(stringbuilder.toString());
					stringbuilder.delete(0, stringbuilder.length());
					stringbuilder.append(answer + " ");
					stringbuilder.append("÷");
				}
				else if( answerState == true){
					stringbuilder.delete(0,stringbuilder.length());
					stringbuilder.append(answer + " ÷ ");
					answer = 0;
				}
				else{
					state = 1;
					stringbuilder.append("÷");
				}
				
				display.setText(stringbuilder.toString());
			}
		});
		plus.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				if(state == 1){
					answer = ans(stringbuilder.toString());
					stringbuilder.delete(0, stringbuilder.length());
					stringbuilder.append(answer + " ");
					stringbuilder.append(" + ");
				}
				else if( answerState == true){
					stringbuilder.delete(0,stringbuilder.length());
					stringbuilder.append(answer + " + ");
					answer = 0;
				}
				else{
					state = 1;
					stringbuilder.append(" + ");
				}
				
				display.setText(stringbuilder.toString());
			}
		});
		minus.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				if(state == 1){
					answer = ans(stringbuilder.toString());
					answer = ans(stringbuilder.toString());
					stringbuilder.delete(0, stringbuilder.length());
					stringbuilder.append(" - ");
				}
				else if( answerState == true){
					stringbuilder.delete(0,stringbuilder.length());
					stringbuilder.append(answer + " - ");
					answer = 0;
				}
				else{
					state = 1;
					stringbuilder.append(" - ");
				}
				display.setText(stringbuilder.toString());
			}
		});
		multiply.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				if(state == 1){
					answer = ans(stringbuilder.toString());
					answer = ans(stringbuilder.toString());
					stringbuilder.delete(0, stringbuilder.length());
					stringbuilder.append(" x ");
				}
				else if( answerState == true){
					stringbuilder.delete(0,stringbuilder.length());
					stringbuilder.append(answer + " x ");
					answer = 0;
				}
				else{
					state = 1;
					stringbuilder.append(" x ");
				}
				
				display.setText(stringbuilder.toString());
			}
		});
		equals.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e) {
				answer = ans(stringbuilder.toString());
				display.setText(answer + "");
				stringbuilder.delete(0, stringbuilder.length());
				answerState = true;
				
			}
		});    
	    
	}
	private int ans(String equation){
		int ans = 0;
		if(equation.contains("+"))
		{
		    String parts[] = equation.split("\\+");
		    String partOne =  parts[0].toString();
		    String partTwo =  parts[1].toString();
		    //System.out.println(Integer.parseInt(partOne.replaceAll("[\\D]", "")));	
		    ans = (Integer.parseInt(partOne.replaceAll("[\\D]", "")) + (Integer.parseInt(partTwo.replaceAll("[\\D]", ""))));
		    
		}
		else if(equation.contains("-"))
		{
		    String parts[] = equation.split("-");
		    String partOne =  parts[0].toString();
		    String partTwo =  parts[1].toString();
		    ans = (Integer.parseInt(partOne.replaceAll("[\\D]", "")) - (Integer.parseInt(partTwo.replaceAll("[\\D]", ""))));
		    
		}
		else if(equation.contains("x"))
		{
		    String parts[] = equation.split("x");
		    String partOne =  parts[0].toString();
		    String partTwo =  parts[1].toString();
		    ans = (Integer.parseInt(partOne.replaceAll("[\\D]", "")) * (Integer.parseInt(partTwo.replaceAll("[\\D]", ""))));
		    
		}
		else if(equation.contains("÷"))
		{
		    String parts[] = equation.split("÷");
		    String partOne =  parts[0].toString();
		    String partTwo =  parts[1].toString();
		    ans = (Integer.parseInt(partOne.replaceAll("[\\D]", "")) / (Integer.parseInt(partTwo.replaceAll("[\\D]", ""))));
		    
		}
    	state = 0;
    	return ans;	
    	
    }
	
}

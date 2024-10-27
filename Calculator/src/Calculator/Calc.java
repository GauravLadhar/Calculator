package Calculator;

import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		frame.setTitle("Calculator");
		frame.setBounds(100, 100, 404, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// set background icon for backspace button
		Icon icon = new ImageIcon("backspace.png");
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setFont(new Font("Verdana", Font.BOLD, 20));
		textField.setBounds(10, 25, 370, 85);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				// if the textField is not empty
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backspace = str.toString();
					textField.setText(backspace);
				}
			}
		});
		//btnBack.setIcon(icon);
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBack.setBounds(295, 120, 85, 64);
		frame.getContentPane().add(btnBack);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setForeground(Color.BLACK);
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setFont(new Font("Verdana", Font.BOLD, 16));
		btn7.setBounds(10, 194, 85, 64);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setFont(new Font("Verdana", Font.BOLD, 16));
		btn4.setBounds(10, 268, 85, 64);
		frame.getContentPane().add(btn4);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setFont(new Font("Verdana", Font.BOLD, 16));
		btn8.setBounds(105, 194, 85, 64);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setFont(new Font("Verdana", Font.BOLD, 16));
		btn9.setBounds(200, 194, 85, 64);
		frame.getContentPane().add(btn9);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setFont(new Font("Verdana", Font.BOLD, 16));
		btn5.setBounds(105, 268, 85, 64);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setFont(new Font("Verdana", Font.BOLD, 16));
		btn6.setBounds(200, 268, 85, 64);
		frame.getContentPane().add(btn6);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setFont(new Font("Verdana", Font.BOLD, 16));
		btn2.setBounds(105, 342, 85, 64);
		frame.getContentPane().add(btn2);
		
		JButton btnDivide = new JButton("\u00F7");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "÷";
			}
		});
		btnDivide.setBackground(Color.LIGHT_GRAY);
		btnDivide.setFont(new Font("Verdana", Font.BOLD, 18));
		btnDivide.setBounds(295, 194, 85, 64);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "x";
			}
		});
		btnMultiply.setBackground(Color.LIGHT_GRAY);
		btnMultiply.setFont(new Font("Verdana", Font.BOLD, 18));
		btnMultiply.setBounds(295, 268, 85, 64);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSubtract.setBackground(Color.LIGHT_GRAY);
		btnSubtract.setFont(new Font("Verdana", Font.BOLD, 20));
		btnSubtract.setBounds(295, 342, 85, 64);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setFont(new Font("Verdana", Font.BOLD, 18));
		btnAdd.setBounds(295, 416, 85, 64);
		frame.getContentPane().add(btnAdd);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				
				if (operation == "+") {
					result = first + second;
					textField.setText(String.valueOf(result));
				}
				if (operation == "-") {
					result = first - second;
					textField.setText(String.valueOf(result));
				}
				if (operation == "x") {
					result = first * second;
					textField.setText(String.valueOf(result));
				}
				if (operation == "÷") {
					result = first / second;
					textField.setText(String.valueOf(result));
				}
			}
		});
		btnEquals.setBackground(new Color(192, 192, 192));
		btnEquals.setOpaque(true);
		btnEquals.setFont(new Font("Verdana", Font.BOLD, 18));
		btnEquals.setBounds(295, 490, 85, 64);
		frame.getContentPane().add(btnEquals);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setFont(new Font("Verdana", Font.BOLD, 16));
		btn1.setBounds(10, 342, 85, 64);
		frame.getContentPane().add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setFont(new Font("Verdana", Font.BOLD, 16));
		btn3.setBounds(200, 342, 85, 64);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setFont(new Font("Verdana", Font.BOLD, 16));
		btn0.setBounds(105, 416, 85, 64);
		frame.getContentPane().add(btn0);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				first = Double.parseDouble(textField.getText());
				result = first / 100;
				answer = String.format("%.2f", result);
				textField.setText(answer + "%");
			}
		});
		btnPercent.setFont(new Font("Verdana", Font.BOLD, 18));
		btnPercent.setBackground(Color.LIGHT_GRAY);
		btnPercent.setBounds(200, 416, 85, 64);
		frame.getContentPane().add(btnPercent);
		
		JButton btnClear = new JButton("CLR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Verdana", Font.BOLD, 16));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBounds(10, 120, 85, 64);
		frame.getContentPane().add(btnClear);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat("."));
			}
		});
		btnDecimal.setFont(new Font("Verdana", Font.BOLD, 20));
		btnDecimal.setBackground(Color.LIGHT_GRAY);
		btnDecimal.setBounds(10, 416, 85, 64);
		frame.getContentPane().add(btnDecimal);
		
		JButton btnNegative = new JButton("(-)");
		btnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				temp = temp * -1;
				textField.setText(String.valueOf(temp));
			}
		});
		btnNegative.setFont(new Font("Verdana", Font.BOLD, 18));
		btnNegative.setBackground(Color.LIGHT_GRAY);
		btnNegative.setBounds(200, 490, 85, 64);
		frame.getContentPane().add(btnNegative);
	}
}

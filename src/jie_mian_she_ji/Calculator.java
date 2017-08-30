package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame {

	private Button plus;
	private Button minus;
	private Button multiply;
	private Button divide;
	
	private TextField num1;
	private TextField num2;
	private TextField result;
	
	public Calculator(){
		super("����");
		this.setLayout(new FlowLayout());
		num1 = new TextField(5);
		num2 = new TextField(5);
		result = new TextField(5);
		
		plus = new Button("��");
		minus = new Button("��");
		multiply = new Button("��");
		divide = new Button("��");
		
		this.add(new Label("  ����1:  "));
		this.add(num1);
		this.add(new Label("  ����2:  "));
		this.add(num2);
		this.add(new Label("  ���:  "));
		this.add(result);
		
		this.add(plus);
		this.add(minus);
		this.add(multiply);
		this.add(divide);
		
		plus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double a = Double.parseDouble(num1.getText());
				double b = Double.parseDouble(num2.getText());
				result.setText(Double.toString(a+b));
			}
		});
		
		minus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double a = Double.parseDouble(num1.getText());
				double b = Double.parseDouble(num2.getText());
				result.setText(Double.toString(a-b));
			}
		});
		
		multiply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double a = Double.parseDouble(num1.getText());
				double b = Double.parseDouble(num2.getText());
				result.setText(Double.toString(a*b));
			}
		});
		
		divide.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double a = Double.parseDouble(num1.getText());
				double b = Double.parseDouble(num2.getText());
				result.setText(Double.toString(a/b));
			}
		});
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		this.setSize(150,200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	}
}

package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;

public class ChangeColor extends Frame{

	private Button red = new Button("ºì");
	private Button blue = new Button("À¶");
	private Button green = new Button("ÂÌ");
	private TextField text = new TextField();
	
	public ChangeColor(){
		super("¸Ä±äÑÕÉ«");
		this.setLayout(null);
		text.setBackground(Color.WHITE);
		
		red.setBounds(25, 50, 50, 20);
		this.add(red);
		
		green.setBounds(125, 50, 50, 20);
		this.add(green);
		
		blue.setBounds(225,50,50,20);
		this.add(blue);
		
		text.setBounds(25, 100, 250, 30);
		this.add(text);
		
		red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.setBackground(Color.red);
			}
		});
		
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				text.setBackground(Color.green);
			}
		});
		
		blue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.setBackground(Color.blue);
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		this.setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ChangeColor color = new ChangeColor();
	}
}

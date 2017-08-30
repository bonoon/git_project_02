package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;

public class Temperature extends Frame{

	private Label inputLab = new Label("�����뻪���¶�: ");
	private TextField input = new TextField();   //������������
	private Label temperCLab = new Label("�����¶�: ");
	private TextField temperC = new TextField();  //������������¶�
	private Label temperKLab = new Label("K���¶�: ");
	private TextField temperK = new TextField();  //����k������¶�
	
	public Temperature(){
		super("�¶�ת������");
		this.setLayout(new GridLayout(3,2));
		this.add(inputLab);
		this.add(input);
		this.add(temperCLab);
		this.add(temperC);
		this.add(temperKLab);
		this.add(temperK);
		
		input.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				double tempH = Double.parseDouble(input.getText());
				double tempC = (tempH-32)/9*5;
				double tempK = tempC + 273;
				temperC.setText(Double.toString(tempC));
				temperK.setText(Double.toString(tempK));
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		Temperature temper = new Temperature();
	}
}

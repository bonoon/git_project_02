package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;

public class FirstFrame extends Frame implements ActionListener{

	private Button quit = new Button("ÍË³ö");
	public FirstFrame(){
		super("First Window");
		add(quit);
		quit.addActionListener(this);
		setSize(250,80);
        setVisible(true);		
	}
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
	public static void main(String[] args) {
		FirstFrame ff = new FirstFrame();
	}
}

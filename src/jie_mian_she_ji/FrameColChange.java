package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;

public class FrameColChange extends Frame implements ActionListener{

	private Button change = new Button("变色");
	public FrameColChange(){
		super("屏幕变色程序");
		this.setLayout(new FlowLayout());
		this.add(change);
		change.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setSize(300, 200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0){
		int r = (int)(Math.random()*1000)%256;
		int g = (int)(Math.random()*1000)%256;
		int b = (int)(Math.random()*1000)%256;
		this.setBackground(new Color(r,g,b));
	}
	public static void main(String[] args) {
		FrameColChange frame = new FrameColChange();
	}
	
}

package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseExample extends JFrame{

	private JTextField txf = new JTextField();
	JLabel lbl = new JLabel();
	
	public MouseExample(){
		super("Mouse Example");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(txf, BorderLayout.SOUTH);
		c.add(lbl, BorderLayout.NORTH);
		c.addMouseMotionListener(new MouseMotionHandler());
		c.addMouseListener(new MouseHandler());
		setSize(300,150);
		setVisible(true);
	}
	
	class MouseMotionHandler extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e){
			String s = "Mouse is dragged at (" +e.getX()+","+e.getY()+")";
			txf.setText(s);
		}
	}
	
	public class MouseHandler extends MouseAdapter{
		public void mouseEntered(MouseEvent e){
			String s = "Mouse enters!";
			lbl.setText(s);
		}
		public void mouseExited(MouseEvent e){
			String s = "Mouse leavers!";
			lbl.setText(s);
		}
	}
	
	public static void main(String[] args) {
		MouseExample app = new MouseExample();
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}

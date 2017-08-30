package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class ListExample extends JFrame{

	private JList list;
	private JLabel lbl;
	private String[] name = {"������ͨ��ѧ","������ѧ","������ҵ��ѧ","���ľ�ҽ��ѧ"};
	private String[] address = {"����·","��ѧ��·","������·","���ֶ�·"};
	
	public ListExample(){
		super("ListExample");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		lbl = new JLabel();
		c.add(lbl, BorderLayout.SOUTH);
		
		list = new JList(name);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		c.add(list, BorderLayout.NORTH);
	    
		list.addListSelectionListener(new Handler());
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setSize(250,170);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ListExample app = new ListExample();
	}
	
	private class Handler implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent e){
			//String s;
			lbl.setText("��ַ: "+address[list.getSelectedIndex()]);
		}
	}
}

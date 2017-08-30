package duo_xian_cheng;

import java.awt.*;
import java.awt.event.*;
import java.nio.charset.MalformedInputException;

import javax.swing.*;

class MyWindow extends JFrame{
	
	JLabel[] label;
	public MyWindow(){
		label = new JLabel[4];
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,2,20,20));
		//c.setBackground(Color.RED);
		for(int i = 0;i < 4;i++){
			label[i] = new JLabel("标签"+(i+1));
			c.add(label[i]);
		}
		setSize(100,100);
		setVisible(true);
	}
}

public class WindowThread extends Thread{
	
	int j,time;
	MyWindow myWindow;
	public WindowThread(MyWindow myWindow,int j,int time){
		this.myWindow = myWindow;
		this.j = j;
		this.time = time;
	}
	
	public void run(){
		while(true){
			try{
				myWindow.label[j].setVisible(true);  //使label[j]可见
				Thread.sleep(time);
				myWindow.label[j].setVisible(false);
				Thread.sleep(time);
			}
			catch(InterruptedException e){}
		}
	}
	public static void main(String[] args) {
		MyWindow myWindow = new MyWindow();
		WindowThread w1 = new WindowThread(myWindow, 0, 5000);
		WindowThread w2 = new WindowThread(myWindow, 1, 6000);
		WindowThread w3 = new WindowThread(myWindow, 2, 3000);
		WindowThread w4 = new WindowThread(myWindow, 3, 4000);
		w1.start();
		w2.start();
		w3.start();
		w4.start();
	}
}
package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame{

	private int guessNum;  //要猜的数字
	private JLabel message;  //显示提示信息
	private JTextField input;  //数据输入区域
	
	public Game(){
		super("Guess Game");
		Container pane = this.getContentPane();
		pane.setLayout(new BorderLayout());
		
		guessNum = ((int)(Math.random()*10))+1;   //产生1~200之间的随机数
		input = new JTextField();
		message = new JLabel("有一个数，在1~200之间。猜猜看，这个数是多少?");
		message.setHorizontalAlignment(SwingConstants.CENTER);
		pane.setBackground(Color.YELLOW);
		//message.setFont(new Font("TimesRoman",Font.PLAIN,20));
		pane.add(input, BorderLayout.NORTH);
		pane.add(message, BorderLayout.CENTER);
		
		input.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int guessed = Integer.parseInt(input.getText());  //获得输入的数字
				if(guess(guessed)==-1){
					message.setText("太小");
					pane.setBackground(Color.BLUE);
					input.setText("");
				}
				else if(guess(guessed)==1){
					
					message.setText("太大");
					pane.setBackground(Color.RED);
				input.setText("");
				}
				else if(guess(guessed)==0){
					message.setText("");
					pane.setBackground(Color.GREEN);
					message.setText("恭喜你! 答对了!");
				}
			}
		});
		this.setSize(500,300);
		this.setVisible(true);
	}
	
	private int guess(int num){
		if(num < this.guessNum)
			return -1;
		else if(num > this.guessNum)
			return 1;
		else 
			return 0;
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		
		game.addWindowFocusListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}

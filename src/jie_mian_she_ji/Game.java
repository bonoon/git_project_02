package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame{

	private int guessNum;  //Ҫ�µ�����
	private JLabel message;  //��ʾ��ʾ��Ϣ
	private JTextField input;  //������������
	
	public Game(){
		super("Guess Game");
		Container pane = this.getContentPane();
		pane.setLayout(new BorderLayout());
		
		guessNum = ((int)(Math.random()*10))+1;   //����1~200֮��������
		input = new JTextField();
		message = new JLabel("��һ��������1~200֮�䡣�²¿���������Ƕ���?");
		message.setHorizontalAlignment(SwingConstants.CENTER);
		pane.setBackground(Color.YELLOW);
		//message.setFont(new Font("TimesRoman",Font.PLAIN,20));
		pane.add(input, BorderLayout.NORTH);
		pane.add(message, BorderLayout.CENTER);
		
		input.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int guessed = Integer.parseInt(input.getText());  //������������
				if(guess(guessed)==-1){
					message.setText("̫С");
					pane.setBackground(Color.BLUE);
					input.setText("");
				}
				else if(guess(guessed)==1){
					
					message.setText("̫��");
					pane.setBackground(Color.RED);
				input.setText("");
				}
				else if(guess(guessed)==0){
					message.setText("");
					pane.setBackground(Color.GREEN);
					message.setText("��ϲ��! �����!");
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

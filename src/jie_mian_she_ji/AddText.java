package jie_mian_she_ji;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class AddText extends JFrame {

	private JTextField textField;
	private JTextArea textArea;
	private JButton button;
	
	public AddText(){
		super("Add text to textarea");
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout(5,5));
		
		textField = new JTextField(20);
		textArea = new JTextArea(8,10);
		button = new JButton("µ¥»÷°´Å¥Ìí¼Ó");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
				String text = textField.getText()+" ";
				textArea.append(text);
			}
		});
		pane.add(textField, BorderLayout.NORTH);
		pane.add(button, BorderLayout.CENTER);
		pane.add(textArea, BorderLayout.SOUTH);
		setSize(300,300);
		this.show();
	}
	
	public static void main(String[] args) {
		
		AddText addText = new AddText();
		
		addText.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}

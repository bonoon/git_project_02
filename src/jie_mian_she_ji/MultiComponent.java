package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MultiComponent extends JFrame{

	private JLabel name = new JLabel("姓名: ");
	private JLabel sex = new JLabel("性别: ");
	private JTextField txf = new JTextField(15);
	private JRadioButton man = new JRadioButton("男",true);
	private JRadioButton woman = new JRadioButton("女",true);
	
	private ButtonGroup radioGroup;
	
	private JCheckBox math = new JCheckBox("数学");
	private JCheckBox chinese = new JCheckBox("语文");
	private JButton ok = new JButton("确定");
	private JButton cancel = new JButton("取消");
	
	private String[] str = new String[4];
	private String output = "";
	private JTextArea txa = new JTextArea(5,20);
	
	public MultiComponent(){
		super("MultiComponent");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(name);
		c.add(txf);
		c.add(sex);
		c.add(man);
		c.add(woman);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(man);
		radioGroup.add(woman);
		
		ok.addActionListener(new handler());
		cancel.addActionListener(new handler());
		
		c.add(math);
		c.add(chinese);
		c.add(ok);
		c.add(cancel);
		c.add(txa);
		
		setSize(230,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MultiComponent app = new MultiComponent();
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	private class handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == ok){
				str[0] = "姓名: "+txf.getText();
				if(man.isSelected())
					str[1] = "性别: 男";
				else
					str[1] = "性别: 女";
				if(math.isSelected())
					str[2] = "mathematics";
				else
					str[2] = "";
				if(chinese.isSelected())
					str[3] = "chinese";
				else
					str[3] = "";
				output = "";
				for(int i = 0;i < 2;i++)
					output = output+str[i]+"\n";
				output = output+"所选课程如下: "+"\n";
				for(int i = 2;i < 4;i++)
					output = output+str[i]+"\n";
				txa.setText(output);
			}
			if(e.getSource() == cancel)
				System.exit(0);
		}
	}
}

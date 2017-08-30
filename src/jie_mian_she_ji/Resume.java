package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Resume extends JFrame{

	private JLabel name;
	private JTextField nameInput;
	
	private JLabel sex;
	private JRadioButton male;           //性别选择按钮
	private JRadioButton female;
	private ButtonGroup sexSelect;
	
	private JLabel provinceLab;
	private String province[] = {"北京市","陕西省","河南省"};
	private JComboBox provinceBox;   //籍贯组合框
	
	private JLabel degreeLab;
	private String degree[] = {"中学","本科","硕士","博士","其他"};
	private JList degreeList;   //文化程度列表框
	
	private JButton ok,cancel;
	private String[] str = new String[4];
	private String output = " ";
	private JTextArea txa;
	
	public Resume(){
		super("简单的个人简历程序");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		name = new JLabel("姓名: ");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		nameInput = new JTextField(8);
		
		sex = new JLabel("性别: ");
		sex.setHorizontalAlignment(SwingConstants.CENTER);
		male = new JRadioButton("男",true);
		female = new JRadioButton("女",true);
		sexSelect = new ButtonGroup();
		sexSelect.add(male);
		sexSelect.add(female);
		
		provinceLab = new JLabel("籍贯: ");
		provinceLab.setHorizontalAlignment(SwingConstants.CENTER);
		provinceBox = new JComboBox(province);
		
		degreeLab = new JLabel("文化程度: ");
		degreeLab.setHorizontalAlignment(SwingConstants.CENTER);
		degreeList = new JList(degree);
		degreeList.setVisibleRowCount(2);
		
		ok = new JButton("确定");
		cancel = new JButton("取消"	);
		txa = new JTextArea(5,20);
		
		JPanel namePan = new JPanel();
		namePan.add(sex);
		namePan.add(nameInput);
		c.add(namePan);
		
		JPanel sexPan = new JPanel();
		sexPan.add(sex);
		sexPan.add(male);
		sexPan.add(female);
		c.add(sexPan);
		
		JPanel provincePan = new JPanel();
		provincePan.add(provinceLab);
		provincePan.add(this.provinceBox);
		c.add(provincePan);
		
		JPanel degreePan = new JPanel();
		degreePan.add(degreeLab);
		degreePan.add(degreeList);
		c.add(degreePan);
		
		JPanel buttonPan = new JPanel();
		buttonPan.add(ok);
		buttonPan.add(cancel);
		ok.addActionListener(new Handlel());
		cancel.addActionListener(new Handlel());
		c.add(buttonPan);
		
		c.add(txa);
		this.setSize(350,350);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Resume resume = new Resume();
		resume.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	private class Handlel implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==ok){
				str[0] = "姓名: "+nameInput.getText();
				if(male.isSelected())
					str[1] = "性别: 男";
				else
					str[1] = "性别: 女";
				str[2] = "籍贯: "+province[provinceBox.getSelectedIndex()];
				str[3] = "文化程度: "+degree[degreeList.getSelectedIndex()];
				output = "";
				for(int i = 0;i < 4;i++)
					output = output +str[i]+"\n";
				txa.setText(output);
			}
			if(e.getSource()==cancel)
				System.exit(0);
		}
	}
}

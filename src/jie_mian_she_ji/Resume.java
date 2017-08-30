package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Resume extends JFrame{

	private JLabel name;
	private JTextField nameInput;
	
	private JLabel sex;
	private JRadioButton male;           //�Ա�ѡ��ť
	private JRadioButton female;
	private ButtonGroup sexSelect;
	
	private JLabel provinceLab;
	private String province[] = {"������","����ʡ","����ʡ"};
	private JComboBox provinceBox;   //������Ͽ�
	
	private JLabel degreeLab;
	private String degree[] = {"��ѧ","����","˶ʿ","��ʿ","����"};
	private JList degreeList;   //�Ļ��̶��б��
	
	private JButton ok,cancel;
	private String[] str = new String[4];
	private String output = " ";
	private JTextArea txa;
	
	public Resume(){
		super("�򵥵ĸ��˼�������");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		name = new JLabel("����: ");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		nameInput = new JTextField(8);
		
		sex = new JLabel("�Ա�: ");
		sex.setHorizontalAlignment(SwingConstants.CENTER);
		male = new JRadioButton("��",true);
		female = new JRadioButton("Ů",true);
		sexSelect = new ButtonGroup();
		sexSelect.add(male);
		sexSelect.add(female);
		
		provinceLab = new JLabel("����: ");
		provinceLab.setHorizontalAlignment(SwingConstants.CENTER);
		provinceBox = new JComboBox(province);
		
		degreeLab = new JLabel("�Ļ��̶�: ");
		degreeLab.setHorizontalAlignment(SwingConstants.CENTER);
		degreeList = new JList(degree);
		degreeList.setVisibleRowCount(2);
		
		ok = new JButton("ȷ��");
		cancel = new JButton("ȡ��"	);
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
				str[0] = "����: "+nameInput.getText();
				if(male.isSelected())
					str[1] = "�Ա�: ��";
				else
					str[1] = "�Ա�: Ů";
				str[2] = "����: "+province[provinceBox.getSelectedIndex()];
				str[3] = "�Ļ��̶�: "+degree[degreeList.getSelectedIndex()];
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

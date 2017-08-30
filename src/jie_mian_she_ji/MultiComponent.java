package jie_mian_she_ji;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MultiComponent extends JFrame{

	private JLabel name = new JLabel("����: ");
	private JLabel sex = new JLabel("�Ա�: ");
	private JTextField txf = new JTextField(15);
	private JRadioButton man = new JRadioButton("��",true);
	private JRadioButton woman = new JRadioButton("Ů",true);
	
	private ButtonGroup radioGroup;
	
	private JCheckBox math = new JCheckBox("��ѧ");
	private JCheckBox chinese = new JCheckBox("����");
	private JButton ok = new JButton("ȷ��");
	private JButton cancel = new JButton("ȡ��");
	
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
				str[0] = "����: "+txf.getText();
				if(man.isSelected())
					str[1] = "�Ա�: ��";
				else
					str[1] = "�Ա�: Ů";
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
				output = output+"��ѡ�γ�����: "+"\n";
				for(int i = 2;i < 4;i++)
					output = output+str[i]+"\n";
				txa.setText(output);
			}
			if(e.getSource() == cancel)
				System.exit(0);
		}
	}
}

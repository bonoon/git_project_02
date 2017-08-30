package io;

import java.io.*;

public class SaveGrade {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new FileWriter("grade.txt"));
			String s;
			while(true){
				System.out.println("��������");
				s = br.readLine();
				if(s.length() == 0)
					break;
				bw.write(s);
				bw.newLine();
				System.out.println("����ѧ��");
				s = br.readLine();
				bw.write(s);
				bw.newLine();
				System.out.println("����ɼ�");
				s = br.readLine();
				bw.write(s);
				bw.newLine();
			}
			br.close();
			bw.close();
			int max = 0,min = 100,total = 0,num = 0;
			BufferedReader bf = new BufferedReader(new FileReader("grade.txt"));
			while(true){
				String ss = bf.readLine();
				if(ss == null)
					break;
				ss = bf.readLine();
				ss = bf.readLine();
				int grade = Integer.parseInt(ss);  //ת������
				total += grade;
				num += 1;
				
				if(grade > max)
					max = grade;
				if(grade < min)
					min = grade;
			}
			System.out.println("ѧ���ɼ�����ߵ�Ϊ: "+max+",��͵�Ϊ: "+min+",ƽ���ɼ�Ϊ: "+total*1.0/num);
			bf.close();
		}
		catch(FileNotFoundException fe){
			System.out.println(fe.toString());
		}
		catch(IOException ie){
			System.out.println(ie.toString());
		}
	}
}

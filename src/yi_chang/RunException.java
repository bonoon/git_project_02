package yi_chang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunException {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //�������뻺����
		int a = 2,b = 2;
		String s;
		for(int i = 1;i < 5;i++){
		try{
			System.out.println("�������һ������:");
			s = br.readLine();
			a = Integer.parseInt(s);  //���ַ���ת��������
			System.out.println("������ڶ�������:");
			s = br.readLine();
			b = Integer.parseInt(s);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e+"�������ݳ���");
		}
		}
	}
}

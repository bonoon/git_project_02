package yi_chang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunException {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //定义输入缓冲区
		int a = 2,b = 2;
		String s;
		for(int i = 1;i < 5;i++){
		try{
			System.out.println("请输入第一个整数:");
			s = br.readLine();
			a = Integer.parseInt(s);  //将字符串转换成整数
			System.out.println("请输入第二个整数:");
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
			System.out.println(e+"输入数据出错");
		}
		}
	}
}

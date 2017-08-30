package io;

import java.io.*;

public class SaveName2File {
  public static void main(String[] args){
	try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("name.txt"));
		String s;
		
		while(true){
			System.out.println(" ‰»Î–’√˚: ");
			s = br.readLine();
			if(s.length()==0)
				break;
			bw.write(s);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
	catch(FileNotFoundException fe){
		System.out.println(fe.toString());
	}
	catch(IOException ie){
		System.out.println(ie.toString());
	}
}
}

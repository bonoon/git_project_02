package io;

import java.io.*;

public class DataOutput {

	public static void main(String[] args) throws Exception{
		DataOutputStream out = new DataOutputStream(new FileOutputStream("Data.txt"));
		out.writeDouble(3.14159);
		out.writeBoolean(true);
		out.close();
		DataInputStream in = new DataInputStream(new FileInputStream("Data.txt"));
		System.out.println(in.readDouble());
		System.out.println(in.readBoolean());
	}
}

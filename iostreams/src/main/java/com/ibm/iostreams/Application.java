package com.ibm.iostreams;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application 
{
	public static void main(String[] args) 
	{
		short s=123;
		try(DataOutputStream out=new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("./src/main/resources/ibm/bifile1.txt")))){
					out.writeInt(s);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}


//		FileInputStream in = null;
//		FileOutputStream out = null;
//		
//		try {
//			in = new FileInputStream("./src/main/resources/file1.txt");
//			out = new FileOutputStream("./src/main/resources/file2.txt");
//			byte c;
//			while((c =(byte)in.read()) !=-1) 
//			{
//				out.write(c);
//			}
//		} catch (FileNotFoundException e)
//		{
//			e.printStackTrace();
//			
//		}catch (IOException e)
//		{
//			e.printStackTrace();
//		}finally{
//			if(in !=null) 
//			{
//				try {
//					in.close();
//				}catch(IOException e) {
//					e.printStackTrace();
//				}
//			}
//			if(out !=null)
//			{
//				try {
//					out.close();
//				}catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}

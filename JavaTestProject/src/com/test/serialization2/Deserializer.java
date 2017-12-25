package com.test.serialization2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {
	
	public static void main(String [] args)
	   {
	      Address e = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("D://check2.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Address) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Employee...");
	      System.out.println(e);
	    }

}

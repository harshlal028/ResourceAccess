package com.test.serialization1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {

   public static void main (String args[]) {
    
	   Serializer serializer = new Serializer();
	   serializer.serializeAddress("wall street", "united state", 1000);
   }

   public void serializeAddress(String street, String country, int pop){
	   
	   Address address = new Address();
	   address.setStreet(street);
	   address.setCountry(country);
	   address.setPopulation(pop);
	   
	   try{
		   
		FileOutputStream fout = new FileOutputStream("D://check1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fout);   
		oos.writeObject(address);
		oos.close();
		System.out.println("Done");
		   
	   }catch(Exception ex){
		   ex.printStackTrace();
	   }
   }
}
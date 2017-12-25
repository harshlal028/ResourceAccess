package com.lal.test.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CheckMsg {
	
	public static void main(String[] args) throws IOException {
		
		/*UNCOMENT A SECTION TO KNOW RESULTS*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numSubscriber, numMsg, numCh, numEditor;
		int chunk;
		
		System.out.println("Enter the number of subscriber per Channel:");
		numSubscriber = br.readLine();
		
		System.out.println("Enter number of Channel:");
		numCh = br.readLine();
		
		System.out.println("Enter number of Message per channel:");
		numMsg = br.readLine();
		
		System.out.println("Enter number of Editor per channel:");
		numEditor = br.readLine();
		
		System.out.println("Enter Chunk Size:");
		chunk = Integer.parseInt(br.readLine());
		
		/*Uncomment this for number of status messages to server*/
		System.out.println("Number of status messages ="+statusMessages(new BigInteger(numSubscriber)));
		
		/*Uncomment this for number channel creation messages to server*/
		System.out.println("Number of status messages ="+channelCreateMsg(new BigInteger(numCh)));
		
		/*Uncomment this for number of editor choosing messages to server*/
		System.out.println("Number of status messages ="+editorCreateMsg(new BigInteger(numCh)));
				
		/*Uncomment this for the number of subscription messages*/
		System.out.println("Number of Messages for Subscribing = "+subscriptionMsg(new BigInteger(numSubscriber), 
				new BigInteger(numEditor), 
				new BigInteger(numCh)));
				
		/*Uncomment this for number of messages for content propagation*/
		System.out.println("Number of Messages for Broadcasting = "+broadcastMsg(new BigInteger(numSubscriber), 
									new BigInteger(numMsg), 
									new BigInteger(numCh), 
									chunk));
		
		
		
		System.out.println("========================================================================================================");
		System.out.println("The Total number maybe multiplied by a factor of 2 to take into account the response msg of server too ");
		System.out.println("========================================================================================================");
		
	}
	
	public static String broadcastMsg(BigInteger subscriber, BigInteger numMsg, BigInteger numCh, int chunkSize)
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("\t 1 msg by Editor to get a list of ChunkSize");
		System.out.println("\t ChunkSize messgaes to get a list of chunkSize");
		
		BigInteger sum = BigInteger.ZERO;
		BigInteger chunk = new BigInteger(chunkSize+"");
		BigInteger val;
		BigInteger finalVal;
		
		for(int i = 0; sum.compareTo(subscriber) < 0 ;i++)
		{
			val = chunk.pow(i);
			if(subscriber.compareTo(sum.add(val)) > 0)
			{
				sum = sum.add(val);
			}
			else
			{
				finalVal = (sum).multiply(numCh).multiply(numMsg);
				return((finalVal/*.multiply(new BigInteger("2"))*/).toString());
			}
			System.out.println("Level:"+i+"------->"+(val/*.multiply(new BigInteger("2"))*/)+"\t\t messages");
		}
		
		finalVal = (sum).multiply(numCh).multiply(numMsg);
		return((finalVal/*.multiply(new BigInteger("2"))*/).toString());
	}
	
	public static String channelCreateMsg(BigInteger numCh)
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("\t 1 msg for creation of each channel");
		return(numCh.toString());
	}
	
	public static String editorCreateMsg(BigInteger numCh)
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("\t 1 msg for choosing editor of each channel");
		return(numCh.toString());
	}
	
	public static String subscriptionMsg(BigInteger subscriber, BigInteger editor, BigInteger numCh)
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("\t 1 msg by each client to query for channel");
		System.out.println("\t 1 msg by each client to subscribe for queried channel");
		
		BigInteger val = subscriber.subtract(editor).multiply(new BigInteger("2")).multiply(numCh);
		
		return val.toString();
	}
	
	public static String statusMessages(BigInteger subscriber)
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("\t 1 msg by each client to update status");

		return(subscriber.toString());
	}

}

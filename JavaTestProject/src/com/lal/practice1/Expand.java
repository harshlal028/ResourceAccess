package com.lal.practice1;

public class Expand {
	
	public static void main(String[] args) {
		
		String input = "za3b66c44";
		int nNos=0, sum=0;
		String result = "";
		int len = input.length();
		int tlen = 0;
		for(int i=0; i<len; i++)
		{
			if((i+1) < len)
			{
				if(Character.isLetter(input.charAt(i)))
				{
					if(Character.isDigit(input.charAt(i+1)))
					{
						tlen = Character.getNumericValue(input.charAt(i+1));
						for(int j=0; j<tlen; j++)
						{
							result += input.charAt(i);
						}
						i = i+1;
					}
					else
					{
						result += input.charAt(i);
					}
				}
				else
				{
					result += input.charAt(i);
				}
			}
			else
			{
				if(!Character.isLetter(input.charAt(i-1)))
				{
					result += input.charAt(i);
				}
			}
			
			if(Character.isDigit(input.charAt(i)))
			{
				sum+=Character.getNumericValue(input.charAt(i));
				nNos+=1;
			}
		}
		 int size = input.length() - (2*nNos) + sum ;
		 System.out.println("Total size = "+ size);
		 System.out.println("Result="+result);
		
	}
	

}

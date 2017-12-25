package com.lal.practice1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceAccess {
	
	public static void main(String[] args) throws IOException {
		
		//final File f = new File(ResourceAccess.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		
		//Reads if a file is in src folder in some package structure
		/*InputStream stream = ResourceAccess.class.getResourceAsStream("/com/ddd/SomeTextFile.txt");
        System.out.println(stream != null);
        if(stream != null)
        {
        	InputStreamReader ir = new InputStreamReader(stream);
        	BufferedReader br = new BufferedReader(ir);
        	System.out.println(br.readLine());
        }*/
        
        //Reads if file is directly in src folder(no package)
        /*InputStream stream1 = ResourceAccess.class.getClassLoader().getResourceAsStream("SomeTextFile.txt");
        System.out.println(stream1 != null);
        if(stream1 != null)
        {
        	InputStreamReader ir = new InputStreamReader(stream1);
        	BufferedReader br = new BufferedReader(ir);
        	System.out.println(br.readLine());
        }*/
        
		//System.out.println("CLASSPATH="+System.getProperties().getProperty("java.class.path"));
		
		//Read file from external path
		/*try(BufferedReader br = new BufferedReader(new FileReader("SomeTextFile.txt"))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		    System.out.println(everything);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//To Read a file at same level as the Project
		/*FileReader stream = new FileReader("SomeTextFile.txt");
        System.out.println(stream != null);
        if(stream != null)
        {
        	BufferedReader br = new BufferedReader(stream);
        	System.out.println(br.readLine());
        }*/
		
		final Map<String, String> value1 = System.getenv();
		final String value = System.getenv("HARSH");
		System.out.println("EXE4J_JAVA_HOME="+value);
		
		/*SecurityManager m = new SecurityManager();
		m.checkPropertyAccess("EXE4J_JAVA_HOME");*/
		
		/*System.out.println("===== ENV VARIABLES =====");
		dumpVars(System.getenv());
		
		System.out.println("===== PROPERTIES =====");
		dumpVars(new HashMap(System.getProperties()));*/
		
	}
	
	private static void dumpVars(Map<String, ?> m) 
	{
		List<String> keys = new ArrayList<String>(m.keySet());
		Collections.sort(keys);
		for (String k : keys) {
			System.out.println(k + " : " + m.get(k));
		}
	}

}

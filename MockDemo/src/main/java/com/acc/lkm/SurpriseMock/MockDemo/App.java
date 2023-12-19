package com.acc.lkm.SurpriseMock.MockDemo;

/**
 * Hello world!
 *
 */
import java.util.Map;
import java.util.TreeMap;

public class App 
{
    public static void main( String[] args )
    {
    	Map<String,String> treemap = new TreeMap<String,String>();
    	treemap.put("PROJ-1","JAVA");
    	treemap.put("PROJ-2","PYTHON");
    	treemap.put("PROJ-3","SQL");
    	treemap.put("PROJ-4","SAP");
    	
    	for (String i: treemap.keySet()) {
    		System.out.println("Project: "+i+"\n"+"Technology: "+treemap.get(i));
    		System.out.println();
    	}
    	
    	
    }
}

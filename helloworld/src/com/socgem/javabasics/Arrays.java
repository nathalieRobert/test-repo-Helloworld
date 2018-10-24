package com.socgem.javabasics;

public class Arrays {
    
    public static void main(String[] args) {
	int ints[] = new int[10];
	ints[3] = 5;
	System.out.println(ints[3]);
	
	boolean bool [] = new boolean[10];
	//bool[3] = true;
	//bool[7] = true;
	System.out.println(bool[3]);
	
	
	for (int i = 0; i < bool.length; i++) {
	    bool[i] = true;
	    System.out.println("index = "+i+" value = "+bool[i]);
	    
	}
	
    
    }

}

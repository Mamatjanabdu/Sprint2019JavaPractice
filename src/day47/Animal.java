package day47;
import java. util.*;
public class Animal {
	
	public static int[] addElements(int[] ints1, int[] ints2) {
	    int [] newArray= new int[5];
	   int[] newArr = null;
	newArr [0] = 0;
	    for (int i =0; i<newArray.length; i++){
	       newArr[i]+=ints1[i]+ints2[i];
	       newArray+=newArr[i];
	    }
	    //newArray[0]=ints1[0]+ints2[0];
		return newArray;
	
//		protected String breed; 
//		protected String color; 
//		public boolean wild; 
//		int legCount; 
//
//
//		// what if 
//		// i want to access the members 
//		// in sub classes located in different package 
//
//
//
//		// PROTECTED ACCESS MODIFER 
//		// ENABLE SUB CLASSES OUTSIDE PACKAGE 
//		// TO ACCESS SUPER CLASSES PROTECTED(access modifier) FIELDS 

	}}


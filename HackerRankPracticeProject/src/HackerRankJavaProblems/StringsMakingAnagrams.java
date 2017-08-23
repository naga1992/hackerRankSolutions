package HackerRankJavaProblems;


import java.util.Scanner;
import java.util.Set;

import static java.util.Arrays.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StringsMakingAnagrams {
	
	   public static int numberNeeded(String first, String second) {
		 
	    char[] a_arr= first.toLowerCase().toCharArray();
	    char[] b_arr=second.toLowerCase().toCharArray();
	  sort(a_arr);
	  sort(b_arr);
	     
	  
	   
	      List<Character> listA= new ArrayList<>();
	      List<Character> listB= new ArrayList<>();
	      for (char character : a_arr) {
			listA.add(character);
		}    
	      for (char character : b_arr) {
				listB.add(character);
			} 
	      System.out.println("listA"+ listA+listA.size());
	      System.out.println("listB"+ listB+listB.size());
	        
	    
	      Set<Character> common= new HashSet<>(listA);
	      common.retainAll(listB);
	       
	       common.removeAll(Collections.singleton(null));
	       System.out.println("the commsdfs"+ common);
	      return  (a_arr.length-common.size()+b_arr.length-common.size());
		
		 
	    }
	 
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));
	    }
}

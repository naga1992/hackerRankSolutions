package HackerRankJavaProblems;


import java.util.Scanner;
import static java.util.Arrays.sort;

import java.util.Arrays;

public class solutionJavaAnagrams {
	
	 static boolean isAnagram(String a, String b) {
	    char[] a_arr= a.toLowerCase().toCharArray();
	    char[] b_arr=b.toLowerCase().toCharArray();
	  sort(a_arr);
	  sort(b_arr);
	     
		 return Arrays.equals(a_arr,b_arr);
	    }
	 
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
   String a = sc.nextLine();
   String b = sc.nextLine();
   b=b.intern();
   sc.close();
   boolean ret=isAnagram(a, b);
   System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
   
  
}
}

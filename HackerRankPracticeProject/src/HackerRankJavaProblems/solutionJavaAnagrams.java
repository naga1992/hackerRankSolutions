package HackerRankJavaProblems;


import java.util.Scanner;
import static java.util.Arrays.sort;

import java.util.Arrays;

public class solutionJavaAnagrams {
	
	 static boolean isAnagram(String a, String b) {
	    char[] a_arr= a.toLowerCase().toCharArray();
	    
	    char[] b_arr=b.toLowerCase().toCharArray();
	    int same=0;
	    		System.out.println("size of arrays"+ a_arr.length+","+b_arr.length);
	 
	    		if(a_arr.length<=b_arr.length)
	    		{
	    for(int i=0;i<b_arr.length;i++)
	    {
	    	for(int j=0;j<a_arr.length;j++)
	    	{
	    	  if(a_arr[j]==b_arr[i])
	    		  same++;
	    		  
	    	}
	    }
	    		}
	    		

	    		if(a_arr.length>=b_arr.length)
	    		{
	    for(int i=0;i<a_arr.length;i++)
	    {
	    	for(int j=0;j<b_arr.length;j++)
	    	{
	    	  if(a_arr[i]==b_arr[j])
	    		  same++;
	    		  
	    	}
	    }
	    		}
	     int ctr=a_arr.length-same;
	     int bctr=b_arr.length-same;
	    System.out.println((ctr+bctr));
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

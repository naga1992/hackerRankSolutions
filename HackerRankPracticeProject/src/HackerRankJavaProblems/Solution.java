package HackerRankJavaProblems;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
       ArrayList<String> arr= new ArrayList<>();
          
         int start=0,i=0;
			while (k<=s.length()) {
				if(start!=k)
				{
				  arr.add(s.substring(start, Math.min(k, s.length())));
			 
			  start=start+1;
			  k=k+1;
				}
		}
   
			 Collections.sort(arr);
           
           smallest=arr.get(0);
           largest=arr.get(arr.size()-1);
          
          
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

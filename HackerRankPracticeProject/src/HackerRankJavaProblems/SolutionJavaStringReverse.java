package HackerRankJavaProblems;

import java.io.*;
import java.util.*;

public class SolutionJavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
         if(A.equals(new StringBuffer(A).reverse().toString()))
         {
        	 System.out.println("Yes");
         }
         else
         {
        	 System.out.println("No");
        	 
         }
         sc.close();
    }
}

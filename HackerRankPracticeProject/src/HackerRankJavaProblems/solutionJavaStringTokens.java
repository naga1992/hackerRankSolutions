package HackerRankJavaProblems;

import java.io.*;
import java.util.*;


public class solutionJavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        String[] arr=  s.split("[ !,?._'@]+");
        if(arr.length==1&&arr[0].equals(""))
        {
        System.out.println(0);
        }
        else
        {
        	   System.out.println(arr.length);
        }
        for (String string : arr) {
			System.out.println(string);
		}
          
        scan.close();
    }
}

package HackerRankAlgos;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class arrayManipulation {

    public static void main(String[] args) {
    	int cores = Runtime.getRuntime().availableProcessors();
    //	System.out.println("the no of cores are "+ cores);
    	System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","\""+cores+"\"");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
         
        long arr[]  = new long[size];
       
        Arrays.stream(arr).parallel().forEach(c -> c=0);
         
        int operations = in.nextInt();
        
        for(int a0 = 0; a0 < operations; a0++){
            long startIdx = in.nextLong();
            startIdx=startIdx-1;
            long EndIdx = in.nextLong();
            EndIdx=EndIdx-1;
            long NumberTobeUpdated = in.nextLong();
            
            for(long ctr=startIdx;ctr<=(Math.min(EndIdx,arr.length-1));ctr++)
            {
            
            	
            	arr[(int)ctr]=arr[(int)ctr]+NumberTobeUpdated;
            	
            }
          
            
        }
        Arrays.parallelSort(arr);
        System.out.println(arr[arr.length-1]);
        in.close();
    }
}

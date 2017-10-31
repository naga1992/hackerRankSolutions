package HackerRankAlgos;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Apple_Orange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int applecount=0, orangecount=0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int appledistance=a+apple[apple_i];
            if(appledistance>=s&&appledistance<=t)
            	applecount++;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int orrangedistance=b+orange[orange_i];
            if(orrangedistance>=s&&orrangedistance<=t)
            	orangecount++;
        }
        
        System.out.println(applecount);
        System.out.println(orangecount);
        
    }
}

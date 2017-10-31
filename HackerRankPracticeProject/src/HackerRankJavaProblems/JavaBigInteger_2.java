package HackerRankJavaProblems;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

class JavaBigInteger_2{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
    
        ArrayList<BigDecimal> bm = new ArrayList<>(s.length);
        for(String i : s)
        {
           try{
        	bm.add(new BigDecimal(i,MathContext.UNLIMITED));
           }catch(NullPointerException npe)
           {
        	   bm.add(new BigDecimal(0,MathContext.UNLIMITED));
           }
        	 }
      Stream<BigDecimal> bms=bm.parallelStream().sorted();
      bms.forEach(a->{
    	  int i=0;
    	  s[i]=a.toString()	;
    	  i++;
    			  
      });

    for(int i=0;i<n;i++)
    {
        System.out.println(s[i]);
    }
}
}


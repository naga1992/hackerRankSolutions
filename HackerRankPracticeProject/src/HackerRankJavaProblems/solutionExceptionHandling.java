package HackerRankJavaProblems;
import java.util.Scanner;


class MyCalculator {

	public double power(int n, int p) {
		try{
			if(n==0||p==0)
			{
				 throw new Exception("n and p should not be zero.");
			}
			if(n<0||p<0)
			{
				 throw new Exception("n or p should not be negative..");
			}
				System.out.println(Math.pow(n,p));
	}catch(Exception e)
		{
		  System.out.println(e);
		 

		}
		return p;
		 
		
}
}
public class solutionExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

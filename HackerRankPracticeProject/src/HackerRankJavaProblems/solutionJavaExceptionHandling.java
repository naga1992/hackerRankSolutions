package HackerRankJavaProblems;


import java.util.*;


public class solutionJavaExceptionHandling {

    public static void main(String[] args) {
      try{
    	Scanner sc = new Scanner(System.in);
    	 int a = sc.nextInt();
    	 int b= sc.nextInt();
    	 
    	 sc.close();
    	 System.out.println(a/b);
      }catch(InputMismatchException e)
      {
    	 System.out.println("java.util.InputMismatchException");
    	 
      } catch (ArithmeticException e) {
    	  System.out.println(e);
		
	}
    }
}
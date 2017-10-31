package HackerRankJavaProblems;

import java.util.Scanner;

public class DiagonalDifference {
	
	public static void main(String[] args) {
		// int size of the array
		   Scanner sc = new Scanner(System.in);
		   
		   int size= sc.nextInt();
		   int arr[][]= new int[size][size];
		   int row=0,col=0;
		   for ( row = 0; row < size; row++) {
			   for(col=0;col<size;col++)
			   {
				   arr[row][col]=sc.nextInt();
			   }
			
		}
		
		 int dia1=0,dia2=0;
		 for ( row = 0; row < size; row++) {
			   for(col=0;col<size;col++)
			   {
				   if(row==col)
				  dia1= dia1+arr[row][col];
				   
				   
			   }
			
		}
		 
		 for ( row = 0; row < size; row++) {
			   for(col=size-1;col>=0;col--)
			   {
				  dia2= dia2+arr[row][col];
				   row++;
				   
			   }
			
		}
         System.out.println(Math.abs((dia1-dia2)));   
	}

}

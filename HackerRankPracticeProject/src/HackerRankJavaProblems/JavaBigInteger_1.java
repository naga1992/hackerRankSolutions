package HackerRankJavaProblems;
import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigInteger_1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	 BigDecimal b1 = new BigDecimal(sc.next());
	 BigDecimal b2 = new BigDecimal(sc.next());
	 sc.close();
      System.out.println(b1.add(b2));
      System.out.println(b1.multiply(b2));

	}

}

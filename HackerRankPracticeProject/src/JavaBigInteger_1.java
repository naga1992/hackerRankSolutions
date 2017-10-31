import java.math.BigDecimal;

public class JavaBigInteger_1 {

	public static void main(String[] args) {
	 BigDecimal b1 = new BigDecimal(args[0]);
	 BigDecimal b2 = new BigDecimal(args[1]);
      System.out.println(b1.add(b2));
      System.out.println(b1.multiply(b2));

	}

}


import java.math.BigDecimal;
import java.math.BigInteger;

public class Test1 {

	public static void main(String[] args) {

				
		BigInteger x1 = BigInteger.valueOf(100);
		BigDecimal x2;
		Object o = (Object) x1;
		
		System.out.println(o == x1);
		
		for (int i = 0, y = 10; i < 10; i++, y++) {
			x1 = x1.multiply(x1);
			System.out.println("y=" + y);
		}
		
		
 
		System.out.println(o == x1);
		System.out.println(x1);
		System.out.println(o);
		
		float i1 = 17;
		float i2 = 3.3F;
		System.out.println(i2 % i1);
		
		int x3 = 100;
		x3 += 2.5;
		System.out.println(x3);
		
		System.out.println(args.length);
		
		for (String s : args) {
			System.out.print(s + " ");
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Test1 []";
	}
	
	

}


public class bitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 boolean a, b;
         a = false;
         System.out.println("a   	b     a && b   	a&b");
         do {
               b = false;
               do {
                     System.out.println(a + "\t" + b + "\t" + (a && b) + "\t" + (a & b));
                     b = !b;
               } while (b);
               a = !a;
         } while (a);
	}

}

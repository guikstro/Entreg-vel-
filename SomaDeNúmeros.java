import java.util.Scanner;
 
class Suma {
 
   public static void main( String[] args ) {
      int a, b, c, d = 0;
      try (Scanner s = new Scanner( System.in )) {
		System.out.println( "Digite os números: ");
		  a = s.nextInt();
		  b = s.nextInt();
		  d = s.nextInt();
	}
      c = a + b + d;
      System.out.println( "A soma dos números é: " + c );
   }
 
}

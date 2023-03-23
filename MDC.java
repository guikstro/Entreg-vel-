import java.util.Scanner;

public class MaximoDivisorComum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor de x: ");
		int x = input.nextInt();

		System.out.print("Digite o valor de y: ");
		int y = input.nextInt();
		input.close();

		System.out.printf("MDC(%d, %d) = %d", x, y, gcd(x, y));
	}

	public static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}
}

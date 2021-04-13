package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int prim = 0;
		int seg = 1;
		int ter = 0;
		int n;
		System.out.println("Informe um n�mero: ");
		n = sc.nextInt();

		while (n > ter) {
			ter = prim + seg;
			prim = seg;
			seg = ter;

		}
		if (n == 0) {
			System.out.println("N�mero 0 est� na sequ�ncia Fibonacci. O n�mero 1 � o pr�ximo da sequ�ncia.");
		} else if (n == ter) {
			System.out.println("O n�mero " + n + ", est� na sequ�ncia Fibonacci. O pr�ximo � o n�mero " + (prim + n));
		} else {
			System.out.println("O n�mero digitado n�o se enquadra na sequ�ncia Fibonacci!.");
		}

	}
}
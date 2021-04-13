package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int prim = 0;
		int seg = 1;
		int ter = 0;
		int n;
		System.out.println("Informe um número: ");
		n = sc.nextInt();

		while (n > ter) {
			ter = prim + seg;
			prim = seg;
			seg = ter;

		}
		if (n == 0) {
			System.out.println("Número 0 está na sequência Fibonacci. O número 1 é o próximo da sequência.");
		} else if (n == ter) {
			System.out.println("O número " + n + ", está na sequência Fibonacci. O próximo é o número " + (prim + n));
		} else {
			System.out.println("O número digitado não se enquadra na sequência Fibonacci!.");
		}

	}
}
package baek.quest2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int x = a * b * c;

		int[] count = new int[10];

		for (int i = 0; i < 10; i++) {
			count[i] = 0;
		}
		
		for (int i = 0; i < 10; i++) {

			if (x < Math.pow(10, 7)) {
				for (int j = 0; j < 7; j++) {
					if (i == (int) x % (int) Math.pow(10, j + 1) / (int) Math.pow(10, j)) {
						count[i] += 1;
					}
				}
			} 
			else if (x < Math.pow(10, 8)) {
				for (int j = 0; j < 8; j++) {
					if (i == (int) x % (int) Math.pow(10, j + 1) / (int) Math.pow(10, j)) {
						count[i] += 1;
					}
				}
			}
			else {
				for (int j = 0; j < 9; j++) {
					if (i == (int) x % (int) Math.pow(10, j + 1) / (int) Math.pow(10, j)) {
						count[i] += 1;
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}

	}

}

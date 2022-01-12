package baek.quest1193;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X = Integer.parseInt(br.readLine());

		int sum = 1;
		int a = 0;
		int A = 0;
		for (int i = 1; X >= sum; i++) {
			sum = sum + 4 * i - 1;
			a += 2;
		}
		if (sum - X > a) {
			A = a - (sum - X - a);
		} 
		else {
			A = sum - X;
		}
		
		sum = 1;
		int b = -1;
		int B = 0;
		
		for (int i = 1; X >= sum; i++) {
			sum = sum + 4 * i - 3;
			b = b + 2;
		}

		if (sum - X > b) {
			B = b - (sum - X - b);
		} 
		else {
			B = sum - X;
		}
		bw.write(B + "/" + A);
		bw.flush();
		bw.close();
	}

}

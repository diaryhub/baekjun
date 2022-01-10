package baek.quest1152;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i] != "") {
				count++;
			}
		}
		bw.write(count+"");
		bw.flush();
		bw.close();

	}

}

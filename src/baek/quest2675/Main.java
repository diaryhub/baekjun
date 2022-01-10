package baek.quest2675;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			String str = br.readLine();

			String[] strs1 = str.split(" ");

			int R = Integer.parseInt(strs1[0]);

			String[] strs2 = strs1[1].split("");

			for (int j = 0; j < strs2.length; j++) {
				for (int k = 0; k < R; k++) {
					bw.write(strs2[j]);
				}
			}
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}

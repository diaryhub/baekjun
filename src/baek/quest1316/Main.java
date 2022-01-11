package baek.quest1316;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int count = 0;

		boolean[] check = new boolean[26];
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 26; j++) {
				check[j] = true;
				}
			String word = br.readLine();
			boolean check2=true;
			for (int j = 1; j < word.length(); j++) {
				if(word.charAt(j)!=word.charAt(j-1)) {
					if(check[(int)(word.charAt(j)-97)]==false) {
						check2=false;
					}
					else
					check[(int)(word.charAt(j-1)-97)]=false;
				}
			}
			if(check2)
				count++;
		}
		
		bw.write(count+"");
		bw.flush();
		bw.close();
	}

}

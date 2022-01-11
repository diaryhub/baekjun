package baek.quest2292;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 1;
		int room = 1;
			for(int i=0;n>sum;i++) {
				sum+=6*i;
				room=i+1;
			}
		bw.write(room+"");
		bw.flush();
		bw.close();
	}

}

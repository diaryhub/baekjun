package baek.quest1011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int j = 0; j < T; j++) {
			String[] str = br.readLine().trim().split(" ");
			int distance = Integer.parseInt(str[1])-Integer.parseInt(str[0]);
			int b = (int)Math.sqrt(distance);
			
			if (b*(b+1) < distance) {
				bw.write(b*2+1 + "\n");
			}else if(b*b==distance){
				bw.write(b*2-1+"\n");
			}else {
				bw.write(b*2 + "\n");
			}
		}
		bw.flush();
		bw.close();

	}

}

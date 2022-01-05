package baek.quest4344;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int C = Integer.parseInt(br.readLine());

		for (int i = 0; i < C; i++) {

			String[] stus = br.readLine().split(" "); // 5 10 20 30 40 50 
													//stus[0]=5, stus[1]~[5]={10,20,30,40,50}

			double avg = Integer.parseInt(stus[1]); //avg = 0

			for (int j = 1; j < Integer.parseInt(stus[0]); j++) {  // stus[0]=5

				avg = avg + Integer.parseInt(stus[j+1]);

			}

			avg = avg / (double)Integer.parseInt(stus[0]);

			int avgOver = 0;

			double persent;

			for (int j = 0; j < Integer.parseInt(stus[0]); j++) {

				if (Integer.parseInt(stus[j+1]) > avg)
					avgOver += 1;

			}

			persent = (double) avgOver / Integer.parseInt(stus[0])*100;

			bw.write(String.format("%.3f", persent)+"%\n");
			

		}
		bw.flush();
		bw.close();
		
	}
	
}

package baek.quest2941;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		
		line = line.replace("c=", "a");
		line = line.replace("c-", "a");
		line = line.replace("dz=", "a");
		line = line.replace("d-", "a");
		line = line.replace("lj", "a");
		line = line.replace("nj", "a");
		line = line.replace("s=", "a");
		line = line.replace("z=", "a");
		
		bw.write(line.length()+"");
		bw.flush();
		bw.close();
		
	}

}

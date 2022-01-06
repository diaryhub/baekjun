package baek.quest11720;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String [] strs = br.readLine().split("");
		
		int ans=0;
		
		for(int i=0;i<N;i++) {
			
			ans = ans + Integer.parseInt(strs[i]);
			
		}
		
		bw.write(""+ans);
		bw.flush();
		bw.close();
		
	}

}

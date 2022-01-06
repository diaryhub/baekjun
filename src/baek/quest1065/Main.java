package baek.quest1065;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		if(n<100)
			ans = n;
		else
		{
			ans = 99;
			
			for(int i=100;i<=n;i++) {
				String str = ""+i;
				
				String [] strs = str.split("");
				
				
				
				
			}
		}
			
		
		
		
		
	}

}

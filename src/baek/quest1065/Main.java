package baek.quest1065;

import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		if(n<100) {
			ans = n;
			bw.write(""+ans);
			bw.flush();
			bw.close();
		}
		else
		{
			ans = 99;
			for(int i=100;i<=n;i++) {
				boolean check = true;
				String str = ""+i;
				String [] strs = str.split("");
				for(int j=0;j+2<strs.length;j++) {
					if(Integer.parseInt(strs[j+2])-Integer.parseInt(strs[j+1])!=Integer.parseInt(strs[j+1])-Integer.parseInt(strs[j])) {					
					check = false;						
					}				
				}	
				if(check) {
					ans +=1;
				}
			}
			bw.write(""+ans);
			bw.flush();
			bw.close();		
		}
	}
}

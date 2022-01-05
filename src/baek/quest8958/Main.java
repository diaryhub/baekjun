package baek.quest8958;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
		
			int a = 0;
			
			int result = 0;
			
			String [] str = br.readLine().split("");
			
			for(int j=0;j<str.length;j++) {
				
				
				
				if(str[j].equals("O")) {
					
					a+=1;
					
				}
				else {
					
					a = 0;
					
				}
				
				result+=a;
				
			}
			
			bw.write(result+"\n");
			bw.flush();
			
		}
		
		bw.close();
		
	}

}

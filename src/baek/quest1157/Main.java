package baek.quest1157;

import java.io.*;

public class Main {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char [] ch =br.readLine().toCharArray();
		
		int [] alpha = new int [26];
		
		for (int i=0;i<26;i++) {
			
			alpha[i]=0;
			
		}
		
		for(int i=0;i<26;i++) {
			
			for(int j=0;j<ch.length;j++) {
				
				if((int)ch[j]==i+65||(int)ch[j]==i+97) {
					
					alpha[i]+=1;
				}
				
			}
			
		}
		
		int max=0;
		int save=0;
		for(int i=0;i<26;i++) {
			
			if(max<alpha[i]) {
				max = alpha[i];
				save=i+65;
			}
			
		}
		int check =0;
		
		for(int i=0;i<26;i++) {
			if(max==alpha[i])
				check+=1;
		}
		if(check>1) bw.write("?");
		else bw.write(save);
		bw.flush();
		bw.close();
	}

}

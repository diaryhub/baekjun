package baek.quest1712;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = 0;
		
		
		String [] strs = br.readLine().split(" ");
		
		
		int A = Integer.parseInt(strs[0]);
		int B = Integer.parseInt(strs[1]);
		int C = Integer.parseInt(strs[2]);
		if(C<=B) {
			System.out.println(-1);
			bw.flush();
			bw.close();
			return ;
		}
		else
			{
			int a = A/(C-B);
			bw.write(a+1+"");
			}
		bw.flush();
		bw.close();

	}

}

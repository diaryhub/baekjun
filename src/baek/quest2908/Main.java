package baek.quest2908;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] str = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		int A1 = A%10;
		int A10 = A%100/10;
		int A100 = A/100;

		int B1 = B%10;
		int B10 = B%100/10;
		int B100 = B/100;
		
		A=A1*100+A10*10+A100;
		B=B1*100+B10*10+B100;
		
		if(A>B)
			bw.write(A+"");
		if(A<B)
			bw.write(B+"");
		
		bw.flush();
		bw.close();
	}

}

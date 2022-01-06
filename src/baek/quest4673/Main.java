package baek.quest4673;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// d(n)은 n에 각 자리의 자릿수를 더하는 함수
		// d(n)에서 n을 생성자
		// n이 없을 경우 이 숫자를 셀프 넘버
		// 셀프 넘버를 한 줄에 하나씩 출력

	
		int n = 0;
		
		int [] ints = new int [10001];
		ints[0]=0;
		for (int i = 1; i <= 10000; i++) {
			n = i;

			String str = "" + i;

			String[] strs = str.split("");

			for (int j = 0; j < strs.length; j++) {
				n = n + Integer.parseInt(strs[j]);
				
			}
			
				ints[i]=n;
			
		}
		
		for(int i=1;i<=10000;i++) {
			boolean check = true;
			for(int j=1;j<=10000;j++) {
				if(i==ints[j])
					check = false;
			}
			if(check) {
				bw.write(i+"\n");
				bw.flush();
			}
			
		}
		bw.close();
	}

}

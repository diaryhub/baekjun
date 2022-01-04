package baek.quest2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] integer = new int[9];
		
		for(int i=0;i<9;i++) {
			
			integer[i]=sc.nextInt();
			
		}
		
		int max = Integer.MIN_VALUE;
		int count = 1;
		
		for(int i=0;i<9;i++) {
			
			if(max<integer[i]) {
				max=integer[i];
				count = i+1;
			}
		}
		System.out.println(max+"\n"+count);
		
		
		
	}

}

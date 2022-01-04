package baek.quest3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int [10];
		
		int a;
		
		for(int i=0;i<10;i++) {
			
		a = sc.nextInt();
		
		array[i]=a%42;
			
		}
		
		for(int i=0;i<10;i++) {
			
			for(int j=i;j<10;j++) {
				
				if(i!=j&&array[i]==array[j]) {
					
					
					
				}
				
			}
			
		}
		
		System.out.println();
		
	}

}

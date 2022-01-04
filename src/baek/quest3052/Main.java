package baek.quest3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int [10];
		
		int a;
		
		for(int i=0;i<10;i++) {
			
		a = sc.nextInt();
		
		array[i]= a % 42;
			
		}
		
		int [] array2 = new int [42];
		
		for(int i=0;i<42;i++) {
			
			array2[i]=0;
		
		}
		
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<42;j++) {
				
				if(j==array[i]) {
					
					array2[j]=array2[j]+1;	
					
				}
				
			}
			
		}
		
		int print = 10;
		
		for(int i=0;i<42;i++) {
			
			if(array2[i]>1) {
				
				print= print -array2[i] + 1;
				
			}
			
		}
		
		System.out.println(print);
		
	}

}

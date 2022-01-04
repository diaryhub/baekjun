package baek.quest1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String [] exam = new String [N];
		
		exam = sc.next().split(" ");
		
		int [] grade = new int [N];
		
		for(int i=0;i<grade.length;i++) {
			
			grade[i] = Integer.parseInt(exam[i]);
			
		}
		
		int max = 0;
		
		for(int i=0;i<grade.length;i++) {
			
			if(max<grade[i]) {
				
				max = grade[i];
				
			}
			
		}
		
		double totalAvg = 0.0;
		
		double [] avg = new double [N];
		
		for(int i=0;i<grade.length;i++) {
		
			avg[i] = (double)grade[i]/max*100;
			
			totalAvg = totalAvg + avg[i];
			
		}
		
		totalAvg = totalAvg / (double)N;
		
		System.out.println(totalAvg);
		
	}

}

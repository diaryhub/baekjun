package baek.quest10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String [] str = s.split("");
		char [] ch = new char [str.length];
		int [] ints = new int [ch.length];
		for(int i=0;i<str.length;i++) {
			ch[i]=str[i].charAt(0);
			ints[i]=(int)ch[i];
		}
		for(int i=97;i<123;i++) {
			boolean check=true;
			for(int j=0;j<ints.length;j++) {
				if(ints[j]==i) {
					System.out.print(j+" ");
					check=false;
					break;
				}			
			}
			if(check) {
				System.out.print(-1+" ");
			}
		}
	}
}

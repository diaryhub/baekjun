package baek.quest5622;

	import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
			String [] str = br.readLine().split("");
			
			int count = 0;
			
			for(int i=0;i<str.length;i++) {
	
				if(str[i].equals("A")||str[i].equals("B")||str[i].equals("C")) {
					count+=3;
				}
				else if(str[i].equals("D")||str[i].equals("E")||str[i].equals("F")) {
					count+=4;
				}
				else if(str[i].equals("G")||str[i].equals("H")||str[i].equals("I")) {
					count+=5;
				}
				else if(str[i].equals("J")||str[i].equals("K")||str[i].equals("L")) {
					count+=6;
				}
				else if(str[i].equals("M")||str[i].equals("N")||str[i].equals("O")) {
					count+=7;
				}
				else if(str[i].equals("P")||str[i].equals("Q")||str[i].equals("R")||str[i].equals("S")) {
					count+=8;
				}
				else if(str[i].equals("T")||str[i].equals("U")||str[i].equals("V")) {
					count+=9;
				}
				else if(str[i].equals("W")||str[i].equals("X")||str[i].equals("Y")||str[i].equals("Z")) {
					count+=10;
				}
				else 
					count+=11;
			}
			bw.write(count+"");
			bw.flush();
			bw.close();
			
		}
	
	}

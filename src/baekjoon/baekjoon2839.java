package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2839{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		int input = Integer.parseInt(s);
		int result = 0;
		
		while(input > 0 ) {
			if(input % 5 == 0) {
				input = input - 5;
				result++;
			}
			else if(input % 3 == 0) {
				input = input - 3;
				result++;
			}
			else if(input > 5) {
				input = input - 5;
				result++;
			}
			else {
				result = -1;
				break;
			}
		}
		
		bf.close();
		
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		
	}

}

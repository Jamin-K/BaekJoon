package baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon2751 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = bf.readLine();
		int num[] = new int[Integer.parseInt(n)];
		for(int i = 0; i<num.length; i++) {
			String input_num = bf.readLine();
			num[i] = Integer.parseInt(input_num);
		}
		Arrays.sort(num);
		for(int i = 0 ; i<num.length; i++) {
		bw.write(Integer.toString(num[i]));
		bw.newLine();
		
		}
		bw.close();
		
	}

}

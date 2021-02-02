package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10989 {
	public static void main(String args[]) throws IOException{
		//long start = System.currentTimeMillis();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String N = bf.readLine();
		int n = Integer.parseInt(N);
		
		int num[] = new int[Integer.parseInt(N)];
		int resultarr[] = new int[Integer.parseInt(N)];
		

		for(int i = 0 ; i<n; i++) {
			num[i] = Integer.parseInt(bf.readLine());
		}

		bf.close();	
		
		/*
		 * 최대값 구하기
		 */
		int max = -1;
		for(int i = 0 ; i<num.length; i++) {
			if(num[i] > max)
				max = num[i];
		}
		
		/*
		 * countarr 만들기 및 채우기
		 */
		int countarr[] = new int[max+1];
		for(int i = 0 ; i<n ; i++) {
			countarr[num[i]] = countarr[num[i]]+1;
		}
		
		for(int i = 1 ; i<max+1 ; i++) {
			countarr[i] = countarr[i-1] + countarr[i];
		}
		

		/*
		 * resultarr 만들기
		 */
		for(int i = n-1 ; i>=0 ; i--) {
			int index = num[i];
			countarr[index] = countarr[index]-1;
			resultarr[countarr[index]] = num[i];
			
		}
		
		for(int i = 0 ; i<n ; i++) {
		bw.write(Integer.toString(resultarr[i]));
		bw.newLine();
	}
		//long end = System.currentTimeMillis();
		//System.out.println("실행시간 : " + (end-start));
		bw.flush();
		bw.close();
		
		

	}
	
	
}

package baekjoon;

import java.util.Scanner;

public class Blackjack {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); //카드의 개수
		int m = s.nextInt(); //숫자 합
		
		int num[] = new int[n];
		for(int i = 0 ; i<num.length ; i++) {
			num[i] = s.nextInt();
		}
		System.out.print(find_Sum(m, num));
		
	}
	
	public static int find_Sum(int m, int num[]) {
		int sum = 0;
		int now_sum = 0;
		for(int i = 0 ; i<num.length ; i++) {
			for(int j = i+1 ; j<num.length ; j++) {
				for(int k = j+1 ; k<num.length ; k++) {
					now_sum = num[i] + num[j] + num[k];
					if(sum<= now_sum && now_sum <= m) {
						sum = now_sum;
					}
				}
			}
		}
		return sum;
	}

}

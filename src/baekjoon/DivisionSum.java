package baekjoon;

import java.util.Scanner;

public class DivisionSum {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(div_Sum(n));
	}

	private static int div_Sum(int n) {
		// TODO Auto-generated method stub 
		int num = (int)(Math.log10(n)+1); //num은 n의 자릿수
		int minimum = n-(9*num);
		int result = 0;
		boolean bool = true;
		
		while(bool) {
			if(find_Sum(minimum,n)==true) {
				bool = false;
				result = minimum;
			}
			else {
				minimum++;
				bool = true;
			}
		}
		
		return result;
		
	}
	
	
	private static boolean find_Sum(int a, int n) {
		int sum = a;
		while(a != 0) {
			sum = sum+a%10;
			a = a/10;
		}
		if(sum == n || n==9)
			return true;
		else
			return false;
	}


}


/*public class DivisionSum {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
    
		// 자릿수의 길이를 알기위해 일단 문자열로 입력받는다.
		String str_N = in.nextLine();
 
		// 해당 문자열의 길이 변수
		int N_len = str_N.length();
 
		// 문자열을 정수(int)로 변환 
		int N = Integer.parseInt(str_N);
		int result = 0;
 
		
		// i 는 가능한 최솟값인 N - 9 * N의 각 자릿수부터 시작 
		for(int i = (N - (N_len * 9)); i < N; i++) {
			int number = i;
			int sum = 0;	// 각 자릿수 합 변수 
			
			while(number != 0) {
				sum += number % 10;	// 각 자릿수 더하기
				number /= 10;
			}
			
			// i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우) 
			if(sum + i == N) {
				result = i;
				break;
			}
			
		}
 
		System.out.println(result);
	}
 
}*/

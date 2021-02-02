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
		int num = (int)(Math.log10(n)+1); //num�� n�� �ڸ���
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
    
		// �ڸ����� ���̸� �˱����� �ϴ� ���ڿ��� �Է¹޴´�.
		String str_N = in.nextLine();
 
		// �ش� ���ڿ��� ���� ����
		int N_len = str_N.length();
 
		// ���ڿ��� ����(int)�� ��ȯ 
		int N = Integer.parseInt(str_N);
		int result = 0;
 
		
		// i �� ������ �ּڰ��� N - 9 * N�� �� �ڸ������� ���� 
		for(int i = (N - (N_len * 9)); i < N; i++) {
			int number = i;
			int sum = 0;	// �� �ڸ��� �� ���� 
			
			while(number != 0) {
				sum += number % 10;	// �� �ڸ��� ���ϱ�
				number /= 10;
			}
			
			// i ���� �� �ڸ��� �������� ���� ��� (�����ڸ� ã���� ���) 
			if(sum + i == N) {
				result = i;
				break;
			}
			
		}
 
		System.out.println(result);
	}
 
}*/

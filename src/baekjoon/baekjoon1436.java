package baekjoon;

import java.util.Scanner;

public class baekjoon1436 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int number = 666;
		int count = 0;
		
		while(count!=n) {
			String str = Integer.toString(number);
			if(str.contains("666")){
				count++;
				if(count == n)
					break;
				else
					number++;
			}
			else
				number++;
		}
		
		System.out.print(number);

	}

}

package baekjoon;


import java.util.Scanner;

public class dungchi {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int size[][] = new int[N][2]; // <¸ö¹«°Ô, Å°>
		int count;
		for(int i = 0 ; i<size.length ; i++) {
			size[i][0] = s.nextInt();
			size[i][1] = s.nextInt();
		}
		s.close();
		
		for(int i = 0; i<size.length; i++) {
			count = 1;
			
			for(int j = 0; j<size.length ; j++) {
				if(size[i][0] < size[j][0] && size[i][1] < size[j][1]) {
					count++;
				}
			}
			
			System.out.print(count+" ");
		}


	}
	

}

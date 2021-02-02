package baekjoon;

import java.util.Scanner;

public class baekjoon1018 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int result = Integer.MAX_VALUE;
		char divarr[][] = new char[8][8]; //분할된 배열이 저장
		String strarr[] = new String[N];
		String substr;
		char chessW[][] = {{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'}};
		char chessB[][] = {{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'}};
		
		for(int i = 0 ; i<strarr.length; i++) {
			strarr[i] = s.next();
		}
		s.close();
		
		for(int i = 0 ; i<M-7; i++) { //입력 배열을 8x8 배열로 분할
			for(int k = 0; k<N-7; k++) {
				for(int j = 0 ; j<8 ; j++) {
					substr = strarr[j+k].substring(i, 8+i);
					divarr[j] = substr.toCharArray();
					
				}
				//result = findMin1(divarr, result, chessW, chessB);
				result = findMin(divarr, result);
			}
			
			
			
		}
		System.out.print(result);	
	}

	private static int findMin1(char[][] divarr, int result, char[][] chessW, char[][] chessB) { //버전1
		// TODO Auto-generated method stub
		int countW = 0;
		int countB = 0;
		int min = 0;
			for(int i = 0 ; i<divarr.length ; i++) {
				for(int j = 0 ; j<divarr.length ; j++) {
					if(chessB[i][j] != divarr[i][j])
						countB++;
				}
			}
		
			for(int i = 0 ; i<divarr.length ; i++) {
				for(int j = 0 ; j<divarr.length ; j++) {
					if(chessW[i][j] != divarr[i][j])
						countW++;
				}
			}
	
		
		if(countB > countW) {
			if(countW>result)
				return result;
			else
				return countW;
			
		}
		else
			if(countB > result)
				return result;
			else
				return countB;
			
			
				
		
	}

	private static int findMin(char[][] divarr, int result) { //버전2
		// TODO Auto-generated method stub
		int count = 0 ;
		int countB=0;
		int countW=0;
		int min = 0;
		
		for(int i = 0 ; i<divarr.length; i++) {
			for(int j = 0 ; j<divarr[i].length ; j++) {
					if(i%2==0) {
						if(j%2==0) {
							if(divarr[i][j] != 'B') {
								countB++;
							}
						}
						else if(j%2==1) {
							if(divarr[i][j] != 'W') {
								countB++;
							}
						}
					}
					else if(i%2==1) {
						if(j%2==0) {
							if(divarr[i][j] != 'W') {
								countB++;
							}
						}
						else if(j%2==1) {
							if(divarr[i][j] != 'B') {
								countB++;
							}
						}
					}
			}
		}
		
		for(int i = 0 ; i<divarr.length; i++) {
			for(int j = 0 ; j<divarr[i].length ; j++) {
					if(i%2==0) {
						if(j%2==0) {
							if(divarr[i][j] != 'W') {
								countW++;
							}
						}
						else if(j%2==1) {
							if(divarr[i][j] != 'B') {
								countW++;
							}
						}
					}
					else if(i%2==1) {
						if(j%2==0) {
							if(divarr[i][j] != 'B') {
								countW++;
							}
						}
						else if(j%2==1) {
							if(divarr[i][j] != 'W') {
								countW++;
							}
						}
					}
			}
		}
		if(countB > countW) {
			if(countW>result)
				return result;
			else
				return countW;
			
		}
		else
			if(countB > result)
				return result;
			else
				return countB;
	
	}
}



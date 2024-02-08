package for_;

import java.util.Scanner;

public class quiz003 { //5조문제 //홀수 합이 맞는지 모르겠다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		
		for(int i = 1 ; i <=10000 ; i++ ) { //int!!!
			if(i%2 != 0) {
				sum += i;
				System.out.println("홀수 합 : "+sum);
			}
		}
	}

}

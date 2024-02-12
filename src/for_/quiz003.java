package for_;

import java.util.Scanner;

public class quiz003 { //5조문제 //답이 맞지 않은듯
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
		
		for(i = 1 ; sum <10000 ; i++ ) {
			if(i%2 == 1) {
				sum += i;
			}
			i--;
			System.out.println("마지마에 더해진 홀수 : "+i);
			System.out.println("마지막에 더해진 합 : "+sum);
		}
	}

}


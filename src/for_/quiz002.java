package for_;

import java.util.Scanner;

public class quiz002 { //7조문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Psum=0, Hsum=0, sum=0;
		
			
		for( int i = 1 ; i<=100 ; i++ ) { //초기값에 int를 까먹지 말자
			if(i%2 == 0) {
				Psum += i;
			}
			else {
				Hsum += i;
			}
				System.out.println("짝수 합 : "+Psum);
				System.out.println("홀수 합 : "+Hsum);
			}
			
		
			
	}

}

package for_;

import java.util.Scanner;

public class quiz005 { //4조문제 //다시
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1, num2;
		
		System.out.println("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		
		int big, small;
		if(num1>num2) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;
		}
		
		for(int i = small ; i<=big ; i++) {
				System.out.println( i );
		}
	}

}

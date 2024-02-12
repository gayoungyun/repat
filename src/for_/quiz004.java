package for_;

import java.util.Scanner;

public class quiz004 { //1조문제 //
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		
		System.out.print("num의 값");
		num = sc.nextInt();
		
		for(int i=1 ; i<=num ; i++) {
			sum += i; //s = s+n
			
		}
		
		
		System.out.println("정수 : "+num);
		System.out.println("합 : "+sum);
		
	}

}

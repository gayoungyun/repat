package for_;

import java.util.Scanner;

public class quiz004 { //1조문제 //답이 안써있음 나중에 다시
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		
		System.out.println("정수 입력");
		num = sc.nextInt();
		
		for(int i ; i>0 ; i++) {
			sum += i; //s = s+n
			
		}
		
		
		System.out.println("정수 : "+num);
		System.out.println("합 : "+sum);
		
	}

}

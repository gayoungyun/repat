package for_;

import java.util.Scanner;

public class quiz006 { // 2조문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while(true)// true조심
		{
			System.out.println("점수 입력 : ");
			i = sc.nextInt(); 
			
			if(i<=0 || i>=100) {
				System.out.println("종료");
				break;
			}else if(i >= 80) {
				System.out.println("합격");
				break;
			}else { // 식을 쓰지 않는다
			System.out.println("불합격");
			
	}
		}
	}
}

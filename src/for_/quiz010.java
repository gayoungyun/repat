package for_;

import java.util.Scanner;

public class quiz010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.난수 생성기 사용 \n2.사용 종료 \n 원하시는 기능의 숫자를 입력해주세요");
			int choice = sc.nextInt();
			
			if(choice == 2) {
				break;
			}
			else if(choice == 1) {
				System.out.println("시행 횟수를 입력해주세요");
				int cnt = sc.nextInt();
				
				System.out.println("범위의 최소를 입력해주세요");
				int min = sc.nextInt();
				
				System.out.println("범위의 최대를 입력해주세요");
				int max = sc.nextInt();
				
				for(int i = 1; i<=cnt; i++) {
					int num= (int)((Math.random()*(max-min))+min);
					System.out.println(i+",range("+min+"~"+max+"):"+num);
				}
			}
		}
	}

}

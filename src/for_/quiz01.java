package for_;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("과목 선택해 주세요");
		System.out.println("1. 수학 2. 과학 3. 영어 4. 역사1");
		System.out.println("과목번호 : ");
		int num = input.nextInt();
		
		switch(num) {
		case 1 :System.out.println("101호 입니다"); break;
		case 2 :System.out.println("102호 입니다"); break;
		case 3 :System.out.println("201호 입니다"); break;
		case 4 :System.out.println("202호 입니다"); break;
		default :System.out.println("상담원에게 문의 해주세요"); break;
		}
		
	}

}

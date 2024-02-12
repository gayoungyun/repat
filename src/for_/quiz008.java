package for_;

import java.util.Scanner;

public class quiz008 { //5조문제 ~번숫자 해결 못함, 출력시 문장하나 확인
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int kor = 0, num = 0, j= 1,  kor1= 0;// kor 점수 두개해야함
		double avg_kor = 0;
		
		System.out.println("명수 : ");
		num = sc.nextInt();
		
		for(int i = 0 ; i<num ; i++) { // 조건식 확인
			
			System.out.print(j + "번 국어 성적 : ");
			kor = sc.nextInt();
		
			if (kor<=100 && kor>0) {
				kor1 += kor;
				j++; //위치확인
			}
			else {
				System.out.println(j +"번 학생 다시 입력해주세요");
				kor = sc.nextInt();
			}
		}//괄호 위치 확인
				avg_kor = kor1/(double)num;
		
		System.out.println("총점 : "+kor1);
		System.out.println("총 평균 : "+avg_kor);
		
	}
}

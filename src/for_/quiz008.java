package for_;

import java.util.Scanner;

public class quiz008 { //5조문제 ~번숫자 해결 못함, 출력시 문장하나 확인
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int kor = 0, num = 0, j= 1, sum = 0, kor1= 0, j1 = 1;// kor 점수 두개해야함
		double avg = 0;
		
		System.out.println("명수 : ");
		num = sc.nextInt();
		
		for(int i = 0 ; i<num ; i++) { // 조건식 확인
		System.out.print(j+ "번 국어 성적 : ");
		kor = sc.nextInt();
		sum = kor + kor1; //조심
		avg = sum/num;
		
		if (kor<=100 && kor>0) {
			kor1 += kor;
			j++; //위치확인
			
			System.out.println("총 점 : "+sum);
			System.out.println("평균 : "+avg);
		}
		else {
			System.out.println(j+"번 학생 다시 입력해주세요");
			kor = sc.nextInt();
		}
		j--;
		System.out.println("-----------------");
		System.out.println(j+"번 학생 국어 성적"+kor);
		System.out.println(j1+"번 학생 국어 성적"+kor1);
		System.out.println("                            ");
		System.out.println("총점"+sum);
		System.out.println("총 평균"+avg);
		
			
		/*sum = kor + num;
		System.out.println();
		avg = sum/+num;
		System.out.println();
		
		System.out.println("명수 : "+num);
		System.out.println(j+"국어 성적 : "+kor);
		j++;
		System.out.println(j+"국어 성적 : "+kor1);
		System.out.println("총 점 : "+sum);
		System.out.println("평균 : "+avg);
		*/
	}
		
	}
}

package for_;

public class Ex02 {
	public static void main(String[] args) {
		int sum = 0;
		//sum = sum +1; i++; 
		for( int i = 1 ; i <= 100000 ; i++ ) {
			System.out.println( i );
			sum = sum +i;
		}
		System.out.println("sum : "+sum);
		/*
		 F11:디버깅 시작 모드
		 F6 : 한줄씩 실행(메소드로 거너뜀)
		 F7 : 한줄씩 실행(메소드로 이동)
		 F8 : 다음 브레이크 포인터로 이동
		 ctrl+F2 : 디버깅 종료
		 */
		
	}
}

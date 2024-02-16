package while_;

public class Ex03 {
	public static void main(String[] args) {
		int i = 0;
		//while(i<5) {
		for( ; i<5 ; ) {
			i++;
			if(i ==3 ) {
				System.out.println("333333");
				//break;
				continue; //반복문 위로 다시 올라간다
			}
			System.out.println("i : "+i);
		}
		System.out.println("다음 문장을 실행!!");
	}

}

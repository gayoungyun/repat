package while_;

public class Ex02 {
	public static void main(String[] args) {
		int i =0;
		while(true) {
			i++;
			System.out.println("i : "+i);
			if(i>3)
				break;
		}
		System.out.println("다음 문장 실행!!");
		
		for(; ;) {
			System.out.println("for i : "+i);
			i++;
			if(i>5) {
				break;
			}
		}
		System.out.println("다음 문장 실행");
		if(i == 6) {
			System.out.println(i);
			//break; //if안에서가 아니라 반복문안에서 또는 스위치문에서 사용
		}
	}

}

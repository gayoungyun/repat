package while_;

public class Ex08 {//do while 잘 안쓰인다
	public static void main(String[] args) {
		int i=5, su=10;
		do {
			//su++;
			System.out.println("do while : "+su); //종속문장은 무조건 1번실행
		}while(su<i);
		System.out.println("다음 문장 실행");
	}

}

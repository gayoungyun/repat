package while_;

import java.util.Scanner; //웹 만들때 사용가능

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, temp;
		System.out.println("수 입력");
		i = input.nextInt();
		boolean bool = true;
		while(bool) {
			System.out.println("while");
			// i = 123
			temp = i%10; //3->12 :2
			i = i/10; //12->1
			System.out.println(temp+", ");
			if(i == 0) {
				System.out.println("bool : "+bool);
				bool = false;
				break;
			}
			System.out.println("while 종속문장"); //break쓰면 실행x
		}
		System.out.println("다음 문장들 실행 : "+bool);
	}

}

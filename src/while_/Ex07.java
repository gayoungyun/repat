package while_;

public class Ex07 {
	public static void main(String[] args) {
		String n1 = null, n2 = "test"; //첫째열이 대문자면 .을 찍으면 특정기능있음
		int num = 1000;
		//System.out.println(n1.equals(n2))); , null값은 사용 x
		System.out.println(n2.equals(n1));
		if(n1 == null ) {
			System.out.println("n1입력하세요");
		}else {
			if(n1.equals(n2)) {
				System.out.println("두 문자열은 같다");
			}else {
				System.out.println("다르다...");
			}
		
		}
	}

}

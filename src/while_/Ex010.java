package while_;

import java.util.Scanner;

public class Ex010 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int log, n, out,num=0 ;
		String name1, name2, id= null, pass;
		/*while (true) {
			System.out.println(">>>");
			num = input.nextInt();
			if(num<0 && num>3) {
				break;*/
				/*for(int k=1; k<4; k++) {
					for(int i=1; i<2; i++) 
						System.out.println(i+"로그인");
						System.out.print("아이디 입력");
						id = input.next();
						System.out.print("비밀번호 입력");
						pass = input.next();
				}
				for(int i=2; i<3; i++) {
						System.out.println(i+"회원가입");
						System.out.print("아이디 입력");
						id = input.next();
						System.out.print("비밀번호 입력");
						pass = input.next();
					}
					
					System.out.println("아이디입력 : ");
					name1 = input.next();
					if(name1.equals(id)) { 
						System.out.println("인증성공");
					}else {
						System.out.println("인증실패!!");	
						break ;*/
				
		for(int k=0 ; k<3 ; k++) {
			System.out.println(">>>");
			for(int i=1 ; i<4 ; i++) {
				System.out.println(i+" ");
				//break;
			}
			System.out.println(num);
			num = input.nextInt();
			if(num == 1) {
			System.out.print("로그인 아이디 입력 : ");
			id = input.next();
			System.out.print("비밀번호 입력 : ");
			pass = input.next();
			break;
			
			System.out.println(num);
			num = input.nextInt();
			if(num == 2) {
			System.out.print("회원가입 아이디 입력 : ");
			id = input.next();
			System.out.print("비밀번호 입력 : ");
			pass = input.next();
			break;
		}
		System.out.println("아이디입력 : ");
		name1 = input.next();
		System.out.println("비밀번호 입력 : ");
		name2 = input.next();
		if(name1.equals(id)) { 
			System.out.println("인증성공");
		}else {
			System.out.println("인증실패!!");	
					
		}		
			}
		}
	}
}

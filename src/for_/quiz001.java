package for_;

import java.util.Scanner;

public class quiz001 { //7조문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1 ; i<7 ; i++) {
			for(int j = 1 ; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

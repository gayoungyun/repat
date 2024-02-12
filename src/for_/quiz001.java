package for_;

import java.util.Scanner;

public class quiz001 { //7조문제, 이해안감
	public static void main(String[] args) {
		
		for(int i = 0 ; i<5 ; i++) {
			for(int j = 0 ; j<5-i-1 ; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
		}
			System.out.println();
	}
	}
}

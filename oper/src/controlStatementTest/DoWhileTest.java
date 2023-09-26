package controlStatementTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		String message ="1. 통식 요금 조회\n2. 분실 신고\n3. 통신사 이동\n0. 상담원 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println(message);
			choice = sc.nextInt();
		}while(choice != 0);
		
		
	}
}

package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		두 정수를 입력한 뒤 곱셈 결과 출력
//		단, next()만 사용한다.
		
//		String one = null, two = null, result = null;
		
//		System.out.println("첫번째 정수를 입력하시오.");
//		one = scan.next();
//		System.out.println("두번째 정수를 입력하시오.");
//		two = scan.next();
//		result = Integer(Integer.parseInt(one)) + Integer(Integer.parsInt(two));
//		System.out.println("곱셈의 결과는 " + result + " 입니다");
		
		
		int num1 = 0, num2 = 0, result = 0;
		Scanner sc = new Scanner(System.in);
		String message1 = "정수값 입력: ", message2 = "곱셈 결과값: ";
		String format = "%d * %d = %d";
		
		System.out.print(message1);
		num1 = Integer.parseInt(sc.next());
		
		System.out.print(message2);
		num2 = Integer.parseInt(sc.next());
		
		result = num1 * num2;
		
		System.out.printf(format, num1, num2, result);
		
		
				
		
		
		
	}
}

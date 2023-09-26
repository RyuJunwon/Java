

package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		boolean isBigger = false, isEqual = false;
		String message = "두개의 정수를 입력하세요. ", num1Message = null, num2Message = null, result = null;
		String equalMessage = "두 수가 같습니다. ";
		
		System.out.print(message);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		num1Message = "더 큰 값: " + num1;
		num2Message = "더 큰 값: " + num2;
		
		
		
		isBigger = num1 > num2;
		isEqual = num1 == num2;
		
		result = isBigger ? num1Message : isEqual ? equalMessage : num2Message;
		System.out.println(result);
	}

}

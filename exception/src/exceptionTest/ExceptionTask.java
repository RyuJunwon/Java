package exceptionTest;

import java.util.Iterator;
import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		
//	5개의 정수만 입력받기
//	- 무한 입력 상태로 구현
//	- q 입력 시 나가기
//	- 각 정수는 배열에 담기
//	- if문은 딱 한 번만 사용하기
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0, result = 0;
		String message = "정수 입력: ";
		char ch = 'q';
		
		int[] arData = new int[5];
		int i = 0;
		String temp = null;
		
		while(true) {
			System.out.println(++i + "번째 정수: ");
			temp = sc.next();
			
			if(temp.equals("q")) {
				break;
			}
			try {
				arData[i - 1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력해주세요.");
				i--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개 정수만 입력할 수 있습니다.");
				for (int j = 0; j < arData.length; j++) {
					System.out.println(arData[j] + " ");
				}
				break;
			} catch (Exception e) {
				System.out.println("다시 시도해주세요.");
				i--;
			}
		}
	}
}

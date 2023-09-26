package methodTest;

import java.util.Iterator;
import java.util.Scanner;

public class MethodTask {
//	1~10까지 println()으로 출력하는 메소드
	
	void printFrom1To10(){
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	
//	"홍길동"을 n번 println()으로 출력하는 메소드
	
	void printHong(int end) {
		for (int i = 0; i < end; i++) {
			System.out.println("홍길동");
		}
	}
	
//	이름을 n번 println()으로 출력하는 메소드
	
	void printName(String name, int end) {
		for (int i = 0; i < end; i++) {
			System.out.println(name);
		}
	}
	
//	세 정수를 뺄셈해주는 메소드
	
	int sub(int num1, int num2, int num3) { 
		return num1 - num2 - num3;
	}
	
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
	
	int[] div(int num1, int num2) { 
		int[] results = null;
		
		if(num2 != 0) {
			results = new int[] {num1 / num2, num1 % num2};
		}
		
		return results;
	}
	
//	1~N까지의 합을 구해주는 메소드
	
	int getTotalFrom1(int end) {
		int result = 0;
		
		for (int i = 0; i < end; i++) {
			result += i + 1;
		}
		return result;
	}
	
//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	
	int change(int num) {
		return ++num;
	}
	
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	
	String changeLetter(String string) {
		String result = "";
	
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			
			if(c >= 97 && c <= 122) {
				result += (char)(c - 32);
			}else if(c >= 65 && c <= 90) {
				result += (char)(c + 32);
			}else {
				result += c;
			}
		}
		
		return result;
	}
	
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	
	int getCount(String string, char character) {
		int count = 0;
		
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if(c == character) { 
				count++;
			}
		}
		return count;
	}
	
//	5개의 정수를 입력받은 후 원하는 인덱스 값을 구해주는 메소드
	
	int getIndex(int[] arNumber, int index) {
		return arNumber[index];
	}
	
//	한글을 정수로 바꿔주는 메소드("일공이사" -> 1024)
	
	int changeToInteger(String hangle) {
		String hangles = "공일이삼사오육칠팔구";
		String result = "";
		for (int i = 0; i < hangle.length(); i++) {
			char c = hangle.charAt(i);
			result += hangles.indexOf(c);
		}
		return Integer.parseInt(result);
	}
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	
	void getMaxAndMin(int[] arNumber, int[] results) {
		
		for (int i = 1; i < arNumber.length; i++) {
			if(results[0] < arNumber[i]) {results[0] = arNumber[i];}
			if(results[1] > arNumber[i]) {results[1] = arNumber[i];}
		}
	}
	
//	String 클래스에 있는 indexOf() 만들기, 문자열과 검색 문자를 전달받아서 처리한다.
	
	int indexOf(String string, char character) {
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if(c == character) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		MethodTask methodTask = new MethodTask();
		
//		System.out.println(methodTask.indexOf("ABC", 'C'));

		int[] arNumber = {3, 5, 2, 1, 7};
		int[] results = {arNumber[0], arNumber[0]};
		
		methodTask.getMaxAndMin(arNumber, results);
		
		System.out.println(results[0]);
		System.out.println(results[1]);
		
//		System.out.println(methodTask.changeToInteger("공일이삼"));
		
//		
//		int count = methodTask.getCount("apple", 'p');
//		System.out.println(count + "개");
//		
		
//		boolean isEven = methodTask.change(6) % 2 == 0;
	
		
//		String 초기값이 null일 때에는 아래에서 새로운 값을 대입한다는 뜻이고,
//		""(빈 문자열)일 때에는 아래에서 누적 연결을 한다는 뜻이다.
		
//		String resultMessage = null;
//		
//		resultMessage = isEven ? "홀수가 짝수로 변경되었습니다." : "짝수가 홀수로 변경되었습니다";
//	
//		System.out.println(resultMessage);
	
//		int[] result = methodTask.div(10, 3);
//		
//		if(result != null) {
//			System.out.println("몫 : " + results[0]);
//			System.out.println("나머지 : " + results[1]);
//		}else {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
	}






}



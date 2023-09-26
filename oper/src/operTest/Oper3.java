package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		심리 테스트
		
//		Q. 당신이 좋아하는 색을 선택하세요.
//		1. 빨간색
//		2. 노란색
//		3. 검은색
//		4. 흰색
		
//		빨간색 : 불같고 열정적이고 적극적이다.
//		노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//		검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//		흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		
		Scanner sc = new Scanner(System.in);
		String message = "Q. 당신이 좋아하는 색을 선택하세요. ";
		String menu = "1. 빨간색\n"
					+ "2. 노란색\n"
					+ "3. 검은색\n"
					+ "4. 흰색";
		String redResult = "빨간색 : 불같고 열정적이고 적극적이다.";
		String yellowResult = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackResult = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteResult = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "다시 시도해주세요. ";
		String result = null;
		int choise = 0;
		
		
		
		
		System.out.println(message);
		System.out.println(menu);
		
		choise = sc.nextInt();
		
		result = choise == 1 ? redResult :
					choise == 2 ? yellowResult :
						choise == 3 ? blackResult :
							choise == 4 ? whiteResult : errorMessage;
	
		System.out.println(result);
		
	}
}

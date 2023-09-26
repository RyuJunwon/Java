package controlStatementTest;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
//		이름 10번 출력
//		int count = 0;
//		
//		while(count != 10) { 
//			count++;
//			System.out.println(count + ".류준원");
//		}
		
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
		String errorResult = "다시 시도해주세요. ";
		String result = null;
		int choice = 0;
		
		while(true) {
			System.out.println(message);
			System.out.println(menu);
			
			choice = sc.nextInt();
			
			if(choice == 5) {
				break;
			}
			
			switch(choice) {
			case 1:
				result = redResult;
				break;
			case 2:
				result = redResult;
				break;
			case 3:
				result = redResult;
				break;
			case 4:
				result = redResult;
				break;
			default:
				result = errorResult;
				break;
			}
			
			System.out.println(result);		
			}
		}
}

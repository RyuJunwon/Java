package myPrintTest;

public class PrintTest {
	public static void main(String[] args) {
		
//		글자 크기 키우기 : CTRL + +, CTRL + SHIFT + +
//		글자 크기 줄이기 : CTRL + -, CTRL + SHIFT + -
		
//		주석(CTRL + /)
//		1. 소스코드에 설명글을 작성할 때
//		2. 지금 당장 사용하지 않는 코드를 번역하고 싶지 않을 때
		
		/*
		 *  범위 주석(CTRL + SHIFT + /), 해제(CTRL + SHIFT + \)
		 */
		
//		제어문자
//		반드시 따옴표 안에서 작성한다.
		
//		\n : new line, 줄바꿈, 개행문자
//		\t : tab, 위 아래 줄 간격 맞춰 띄기
//		\" : " 표현
//		\' : ' 표현
			
		//이름을 출력하는 부분
		System.out.print("\"류준원\"");
		
		//나이를 출력하는 부분
		System.out.print("27살\\");
		
		System.out.println("안녕");
		System.out.println("하세요");
	}
}

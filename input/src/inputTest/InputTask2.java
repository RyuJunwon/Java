package inputTest;

import java.util.Scanner; 
public class InputTask2 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 출력
//		※엔터를 한 번만 쳐도 3개의 정수가 한번에 저장되어야 한다.
//		nextInt() : 입력받은 정수값
		
//		int num1 = 0, num2 = 0, num3 = 0, result = 0;
//		Scanner sc = new Scanner(System.in);
//		String message1 = "3개의 정수를 입력하시오. ";
//		
//		
//		System.out.print(message1);
//		num1 = Integer.parseInt(sc.next());
//		num2 = Integer.parseInt(sc.next());
//		num3 = Integer.parseInt(sc.next());
//		
//		result = num1 + num2 + num3;
//		
//		System.out.println("덧셈값은 "+ result + "입니다.");
		
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		Scanner sc = new Scanner(System.in);
		
		String message = "세 정수를 입력하세요.", example = "예)1 5 7";
				
		System.out.println(message);
		System.out.println(example);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		result = num1 + num2 + num3;
		
		System.out.println("덧셈값은 " + result + " 입니다.");
	}

}

package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		
//		브론즈
//		1~10까지 배열에 담고 출력
		
//		int[] arData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(i+1);
//		}
				
//		10~1까지 중 짝수만 배열에 담고 출력
		
//		int[] arData = new int[5];
		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (5 - i) * 2;
//		}
		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		1~100까지 배열에 담은 후 홀수만 출력
		
//		int[] arData = new int[100];
		
//		for (int i = 0; i < args.length; i++) {
//			arData[i] = i + 1;
//		}
				
//		for (int i = 0; i < arData.length; i++) {
//			if(i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
		
//		실버
//		1~100까지 배열에 담은 후 짝수의 합 출력
		
//		int result = 0;
//		int[] arData = new int[100];
		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
		
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i] % 2 == 0) {
//				result += arData[i];
//			}
//		}
//		System.out.println(result);
			
		
//		A~F까지 배열에 담고 출력
		
//		char[] arData = new char[6];
		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
			
//		A~F까지 중 C제외하고 배열에 담은 후 출력
		
//		char[] arData = new char[5];
		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? i + 66 : i + 65);
//		}
		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}

//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		
//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[5];
//		int max = 0, min = 0;
//		String message = null;
		
//		for (int i = 0; i < arData.length; i++) {
//			message = i + 1 + "번째 번호: ";
//			System.out.print(message);
			
//			arData[i] = sc.nextInt();
//		}
		
//		max = arData[0];
//		min = arData[0];
		
//		for (int i = 1; i < arData.length; i++) {
//			if(max < arData[i]) {max = arData[i];}
//			if(min > arData[i]) {min = arData[i];}
//		}
//		
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
		

//		다이아
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력 받고 평균 구하기
		
		int[] arData = null;
		String messageOfIntegerCount = "입력하실 정수의 개수: ";
		String message = null;
		int total = 0;
		double average = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(messageOfIntegerCount);
		arData = new int[sc.nextInt()];
		
		for (int i = 0; i < arData.length; i++) {
			message = i + 1 + "번째 번호: ";
			System.out.print(message);
			arData[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.print(arData[i] + " ");
		}	
		
		for (int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		
		average = total / (double)arData.length;
		System.out.println(average);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

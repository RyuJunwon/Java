package wrapperTest;

public class WrapperTask {
	public static void main(String[] args) {
//		1, 10.9, 'A', true, "ABC"
//		위 5개의 값을 5칸 배열에 담은 뒤 출력
//		기본 자료형은 하나의 타입으로 묶을 수 없다.
//		하지만 클래스 타입은 모두 Object 타입이다.
		
		Object[] datas = {Integer.valueOf(1), Double.valueOf(10.9), 'A', true, "ABC"};
		
//		빠른 for문, forEach문, 향상되니 for문
		for(Object data : datas) {
			System.out.println(data);
		}
	}
}

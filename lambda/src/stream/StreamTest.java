package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	
	public void printDouble(int data) {
		System.out.println(data * 2);
	}
	
	public static void main(String[] args) {
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		StreamTest streamTest = new StreamTest();
		
//		forEach() : 반복
//		여러 값을 가지고 있는 컬렉션 객체에서 forEach 메소드를 사용할 수 있다.
//		forEach() 메소드에는 Consumer 인터페이스 타입의 값을 전달해야 한다.
//		Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
//		매개변수에는 컬렉션 객체 안에 있는 값들이 순서대로 담기고,
//		화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
		
//		datas.stream().forEach(data -> System.out.println(data));
//		datas.forEach(data -> System.out.println(data));
//		datas.forEach(System.out::println);
//		datas.forEach(streamTest::printDouble);
//		
//		IntStream
//		- range(start, end) : start부터 end-1까지
//		- rangeClosed(start, end) : start부터 end까지
		
//		IntStream.range(1, 11).forEach(System.out::println);
//		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
//		map() : 기존 값 변경
		
//		IntStream.range(1, 11).map(data -> data * 2).forEach(System.out::println);
		
//		chars() : 문자열을 문자 컬렉션으로 변경
		
//		"ABC".chars().forEach(System.out::println);
//		"ABC".chars().forEach(c -> System.out.println((char)c));
		
//		filter() : 조건식이 true일 경우 추출
//		IntStream.rangeClosed(1, 10).filter(data -> data % 2 == 1).forEach(System.out::println);
		
//		collect() : 결과를 다양한 타입으로 리턴해준다.
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach(datas::add);
//		List<Integer> results = datas.stream().map(data -> data * 2).collect(Collectors.toList());
//		results.forEach(System.out::println);
		
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("10", "25", "15"));
//		String result = datas.stream().collect(Collectors.joining(":"));
//		System.out.println(result);
		
//		sorted() : 정렬
		
		ArrayList<Integer> datas = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(datas::add);
		
//		정렬 후 Stream API 작업 가능
		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		직접 주소로 접근하여 정렬
		datas.sort(null);
		System.out.println(datas);
		
		datas.sort(Collections.reverseOrder());
		System.out.println(datas);
			
	}
}

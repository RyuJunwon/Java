package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> 제네릭(이름이 없는)
//		객체화 시 타입을 지정하는 기법.
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수도 있기 때문에
//		Object가 아닌 제네릭으로 선언한다.
		
		
//		capacity(용량) : 미리 확보해 놓을 공간, 나의 메모리의 한계를 확인할 수 있다.
//		용량에 제한을 주는 것이 아니다!
		ArrayList<Integer> datas = new ArrayList<>();
		
		datas.add(10);
		datas.add(40);
		datas.add(50);
		datas.add(90);
		datas.add(80);
		datas.add(30);
		datas.add(70);
		datas.add(20);
		datas.add(60);
		
		System.out.println(datas.size());
		
		for(int data : datas) {
			System.out.println(data);
		}
		
		System.out.println(datas);
		
//		오름 차순		
		Collections.sort(datas);
		System.out.println(datas);
		
//		가운데를 기준으로 좌우 반대로 바꾸기
		Collections.reverse(datas);			
		System.out.println(datas);
		
//		섞기
		Collections.shuffle(datas);
		System.out.println(datas);
		
//		삽입, 60은 항상 30뒤에 삽입된다. (검색하는 메소드도 찾기, 삽입하는 메소드도)
		
		if(datas.contains(60)) {
			datas.add(datas.indexOf(60) + 1, 30);
			System.out.println(datas);
		}
		
//		수정, 10을 1로 수정
		
		if(datas.contains(10)) {
			datas.set(datas.indexOf(10), 1);
			System.out.println(datas);
		}
		
//		삭제, 20을 삭제한다.
//		1. 인덱스로 삭제
		
//		if(datas.contains(20)) {
//			datas.indexOf(datas.indexOf(20));
//			System.out.println(datas.contains(20));
//		}
		
		
//		2. 값으로 삭제	
		if(datas.remove(Integer.valueOf(20))) {
			System.out.println(datas.contains(20));
		}
	}
}

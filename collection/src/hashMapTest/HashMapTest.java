package hashMapTest;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> productMap = new HashMap<String, Integer>();
		productMap.put("핸드폰", 1_000_000);
		productMap.put("람보르기니", 400_000_000);
		productMap.put("아이스크림", 3_000);
		
		System.out.println(productMap);
		
		System.out.println("이전 가격: " + productMap.put("람보르기니", 450_000_000));
	
		System.out.println(productMap);
		
		System.out.println(productMap.get("핸드폰") + "원");
	}
}

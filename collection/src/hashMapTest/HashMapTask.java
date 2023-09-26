package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTask {
	public static void main(String[] args) {
//		아이디, 비밀번호, 이름, 나이
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		JSONObject userJSON = null, resultJSON = null;
		String json = null;
		
		userMap.put("id", "rjw1234");
		userMap.put("password", "1234");
		userMap.put("name", "류준원");
		userMap.put("age", 27);
		
		
		
		System.out.println(userMap);
		
		System.out.println(userMap.get("name") + "님 환영합니다.");
		
		userJSON = new JSONObject(userMap);
		json = userJSON.toString();
		
		System.out.println(json);
		
		try {
			resultJSON = new JSONObject(json);
			System.out.println(resultJSON.get("name"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}

package hashMapTest.json;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONTest {
	public static void main(String[] args) {
//		보낼 때
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<JSONObject> userJSONs = new ArrayList<JSONObject>();
		JSONArray jsonArray = null;
		
		users.add(new User("rjw1234", "1234", "류준원", 20));
		users.add(new User("hgd1234", "9999", "홍길동", 33));
		users.add(new User("lss1234", "7777", "이순신", 60));
		
		for(User user : users) {
			JSONObject userJSON = new JSONObject(user);
			userJSONs.add(userJSON);
		}
		
		jsonArray = new JSONArray(userJSONs);
		
		System.out.println(jsonArray.toString());
		
		try {
			System.out.println(jsonArray.get(0));
			System.out.println(jsonArray.getJSONObject(0).get("name"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		받을 때
//		String json = "{\"password\":\"1234\",\"name\":\"류준원\",\"id\":\"rjw1234\",\"age\":20}";
//		JSONObject userJSON;
//		try {
//			userJSON = new JSONObject(json);
//			System.out.println(userJSON.get("id"));
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
		
//		보낼 때
//		User user = new User("rjw1234", "1234", "류준원", 20);
//		JSONObject userJSON = new JSONObject(user);
//		String json = userJSON.toString();
		
//		System.out.println(json);
	}
	


}

package hashMapTest.json;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONTask {
	public static void main(String[] args) {
//		상품번호, 상품명, 상품가격, 상품재고
		
//		1. 상품 3개를 JSONArray로 보내기
//		2. 받은 JSONArray의 각 정보를 모두 출력하기	
		
//      상품번호, 상품명, 상품가격, 상품재고 : Product 클래스로 선언
	      
//      1. 상품 3개를 JSONArray로 보내기
//      ArrayList<JSONObject> productJSONs 
//         = new ArrayList<JSONObject>(
//               Arrays.asList(
//                     new JSONObject(new Product(1, "지우개", 300, 200)),
//                     new JSONObject(new Product(2, "연필", 1000, 500)),
//                     new JSONObject(new Product(3, "필통", 3000, 150))
//               ));
//      
//      JSONArray arProductJSON = new JSONArray(productJSONs);
//      String products = arProductJSON.toString();
//      
//      System.out.println(products);
      
//      2. 받은 JSONArray의 각 정보를 모두 출력하기
      String products = "[{\"number\":1,\"price\":300,\"name\":\"지우개\",\"stock\":200},{\"number\":2,\"price\":1000,\"name\":\"연필\",\"stock\":500},{\"number\":3,\"price\":3000,\"name\":\"필통\",\"stock\":150}]";
      try {
         JSONArray arProudctJSON = new JSONArray(products);
         
         for(int i=0; i<arProudctJSON.length(); i++) {
            JSONObject productJSON = arProudctJSON.getJSONObject(i);
            System.out.println(productJSON.get("number"));
            System.out.println(productJSON.get("name"));
            System.out.println(productJSON.get("price"));
            System.out.println(productJSON.get("stock"));
            System.out.println("=============================");
         }
         
      } catch (JSONException e) {
         e.printStackTrace();
      }
		
			
//		ArrayList<Product> products = new ArrayList<Product>();
//		ArrayList<JSONObject> productsJSONs = new ArrayList<JSONObject>();
//		JSONArray jsonArray = null;
//		
//		products.add(new Product("1", "감자", 2000, 30));
//		products.add(new Product("2", "고구마", 3000, 20));
//		products.add(new Product("3", "파", 4000, 50));
//		
//		for(Product product : products) {
//			JSONObject productsJSON = new JSONObject(product);
//			productsJSONs.add(productsJSON);
//		}
//		
//		jsonArray = new JSONArray(productsJSONs);
//		
//		System.out.println(jsonArray.toString());
//		
//		try {
//			System.out.println(jsonArray.get(0));
//			System.out.println(jsonArray.getJSONObject(0).get("productName"));
//			System.out.println(jsonArray.getJSONObject(0).get("productNumber"));
//			System.out.println(jsonArray.getJSONObject(0).get("productPrice"));
//			System.out.println(jsonArray.getJSONObject(0).get("productStock"));
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
	}
}

package arrayListTask.food;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Restaurant {
//   - 음식 추가
   public void insert(Food food) {
      DBConnecter.foods.add(food);
   }
   
//   - 음식 이름으로 음식 종류 조회
   public Food select(String name) {
      Food result = null;
      for(Food food : DBConnecter.foods) {
         if(food.getName().equals(name)) {
            result = food;
            break;
         }
      }
      return result;
   }
   
//   - 사용자가 원하는 종류의 음식 전체 조회
   public ArrayList<Food> selectAllByType(String type) {
      ArrayList<Food> results = new ArrayList<Food>();
      for(Food food : DBConnecter.foods) {
         if(food.getType().equals(type)) {
            results.add(food);
         }
      }
      return results;
   }
   
//   - 음식 종류 수정 후 가격 10% 상승
   public void update(Food food) {
      for(Food data : DBConnecter.foods) {
         if(data.getName().equals(food.getName())) {
            data.setType(food.getType());
            data.setPrice((int)(data.getPrice() * 1.1));
         }
      }
   }
   
//   - 사용자가 원하는 종류의 음식 개수 조회
   public int getCountOfFoodByType(String type) {
      int count = 0;
      for(Food food : DBConnecter.foods) {
         if(food.getType().equals(type)) {
            count++;
         }
      }
      
      return count;
   }
   
   
}






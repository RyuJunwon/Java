package arrayListTask.fruit;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Market {
   
   private final int LESS = 1;
   private final int MORE_OR_EQUAL = 0;
   private final int NOT_FOUND = -1;
   
//   - 과일 추가
   public void insert(Fruit fruit) {
      DBConnecter.fruits.add(fruit);
   }
   
//   - 과일 삭제
   public void delete(String name) {
      for(int i=0; i<DBConnecter.fruits.size(); i++) {
         if(DBConnecter.fruits.get(i).getName().equals(name)) {
            DBConnecter.fruits.remove(i);
         }
      }
      
//      for(Fruit fruit : DBConnecter.fruits) {
//         if(fruit.getName().equals(name)) {
//            DBConnecter.fruits.remove(fruit);
//         }
//      }
   }
   
//   - 과일 가격이 평균 가격보다 낮은 지 검사
//   1. 전체 과일 중 평균 가격보다 낮은 과일 조회
//   2. 선택한 과일이 평균 가격보다 낮은 지 조회
   public int checkPrice(String name) {
      for(Fruit fruit : DBConnecter.fruits) {
         if(fruit.getName().equals(name)) {
            return fruit.getPrice() < getAverage() ? LESS : MORE_OR_EQUAL;
         }
      }
      return NOT_FOUND;
   }
   
   public ArrayList<Fruit> checkPrice() {
      ArrayList<Fruit> results = new ArrayList<Fruit>();
      
      for(Fruit fruit : DBConnecter.fruits) {
         if(fruit.getPrice() < getAverage()) {
            results.add(fruit);
         }
      }
      return results;
   }
   
   public double getAverage() {
      int total = 0;
      for(Fruit fruit : DBConnecter.fruits) {
         total += fruit.getPrice();
      }
      return (double)total / DBConnecter.fruits.size();
   }
   
   
//   - 과일 전체 조회
   public ArrayList<Fruit> selectAll(){
      return DBConnecter.fruits;
   }
   
//   - 과일 이름으로 가격 조회
   public int selectPrice(String name) {
      for(Fruit fruit : DBConnecter.fruits) {
         if(fruit.getName().equals(name)) {
            return fruit.getPrice();
         }
      }
      
      return NOT_FOUND;
   }

}
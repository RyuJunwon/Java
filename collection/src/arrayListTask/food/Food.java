package arrayListTask.food;

public class Food {
//   - 음식 이름
//   - 음식 가격
//   - 음식 종류(한식, 중식, 일식, 양식)
   private String name;
   private int price;
   private String type;
   
   public Food() {;}

   public Food(String name, int price, String type) {
      super();
      this.name = name;
      this.price = price;
      this.type = type;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   @Override
   public String toString() {
      return "Food [name=" + name + ", price=" + price + ", type=" + type + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Food other = (Food) obj;
      if (name == null) {
         if (other.name != null)
            return false;
      } else if (!name.equals(other.name))
         return false;
      return true;
   }
}
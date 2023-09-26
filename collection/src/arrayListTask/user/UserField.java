package arrayListTask.user;

import arrayListTask.DBConnecter;

public class UserField {
   
   public static String userId;
   
//   아이디 중복검사
   public User checkId(String id) {
      User temp = null;
      for(User user : DBConnecter.users) {
         if(user.getId().equals(id)) {
            temp = user;
            break;
         }
      }
      return temp;
   }
   
//   회원가입
   public void join(User user) {
      DBConnecter.users.add(user);
   }
   
//   로그인
   public boolean login(String id, String password) {
      User user = checkId(id);
      if(user != null) {
         if(user.getPassword().equals(password)) {
            userId = id;
            return true;
         }
      }
      return false;
   }
   
//   로그아웃
   public void logout() {
      userId = null;
   }
   
//   회원정보 조회
   public User select() {
      return checkId(userId);
   }
   
//   정보 수정
   public void update(User user) {
      User foundUser = checkId(user.getId());
      foundUser.setName(user.getName());
      foundUser.setPassword(user.getPassword());
      foundUser.setPhoneNumber(user.getPhoneNumber());
   }
}

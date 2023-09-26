package arrayListTask.user;

import arrayListTask.DBConnecter;

public class Test {
   public static void main(String[] args) {
      UserField userField = new UserField();
      
//      회원 가입
      User user = new User();
      user.setId("hds1234");
      user.setName("한동석");
      user.setPassword("1234");
      user.setPhoneNumber("01012341234");
      
      userField.join(user);
      System.out.println(DBConnecter.users);
      
//      아이디 중복 검사
      if(userField.checkId("hds1234") != null) {
         System.out.println("중복된 아이디");
      }else {
         System.out.println("사용 가능한 아이디");
      }
      
//      로그인
      if(userField.login("hds1234", "1234")) {
         System.out.println("로그인 성공");
         System.out.println(UserField.userId);
      }else {
         System.out.println("로그인 실패");
      }
      
//      회원정보 조회
      user = userField.select();
      System.out.println(user);
      
//      정보 수정
      user.setName("홍길동");
      userField.update(user);
      
      System.out.println(DBConnecter.users);
      
      userField.logout();
      
      if(UserField.userId == null) {
         System.out.println("로그아웃 성공");
      }
   }
}

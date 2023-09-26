package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
   public static void main(String[] args) {
      StreamTask streamTask = new StreamTask();
//      1~10까지 ArrayList에 담고 역순으로 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      datas.forEach(data -> System.out.println(11 - data));
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//      datas.forEach(data -> System.out.println(11 - data));
      
//      1~10까지 ArrayList에 담고 2의 배수만 출력
//      ※ 1~10까지 중 2의 배수만 ArrayList에 담기, map() 사용
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 5).map(data -> data * 2).forEach(datas::add);
//      datas.forEach(System.out::println);
      
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      datas.forEach(data -> {
//         if(data % 2 == 0) {
//            System.out.println(data);
//         }
//      });
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//      datas.forEach(data -> {
//         if(data % 2 == 0) {
//            System.out.println(data);   
//         }
//      });
      
//      ABCDEF를 BCDEFG로 변경
//      "ABCDEF".chars().map(c -> c + 1).forEach(c -> System.out.println((char)c));
      
//      ABCD 중에서 B를 제외하고 출력
//      "ABCD".chars().filter(c -> c != 66).forEach(c -> System.out.println((char)c));
      
//      성과 이름을 ArrayList에 담은 뒤 이름 전체 출력
//      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("한", "동석"));
//      String name = datas.stream().collect(Collectors.joining());
//      System.out.println(name);
      
//      10~1까지 ArrayList에 담고 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.range(0, 10).map(streamTask::change).forEach(datas::add);
//      System.out.println(datas);
      
//      1~10까지 ArrayList에 담고 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.range(1, 11).forEach(datas::add);
//      System.out.println(datas);
      
//      ABCDEF를 각 문자별로 출력
//      String data = "ABCDEF";
//      data.chars().forEach(c -> System.out.println((char)c));
      
//      1~100까지 중 홀수만 ArrayList에 담고 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 100).filter(streamTask::checkOdd).forEach(datas::add);
//      System.out.println(datas);
//      IntStream.rangeClosed(1, 50).map(streamTask::changeToOdd).forEach(datas::add); 
//      System.out.println(datas);
      
//      A~F까지 중 D제외하고 ArrayList에 담고 출력
//      ArrayList<Character> datas = new ArrayList<Character>();
////      IntStream.rangeClosed(65, 70).filter(data -> data != 68).forEach(data -> datas.add((char)data));
////      System.out.println(datas);
//      
////      IntStream.rangeClosed(65, 69).map(number -> number > 67 ? number + 1 : number).forEach(data -> datas.add((char)data));
//      IntStream.rangeClosed(65, 69).map(streamTask::exclude_D).forEach(data -> datas.add((char)data));
//
//      System.out.println(datas);
      
//      5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk"), toLowerCase() 사용
//      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//      datas.stream().map(String::toLowerCase).forEach(System.out::println);
      
//      1~100까지 중 짝수만 ArrayList에 담고 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 50).map(streamTask::changeToEven).forEach(datas::add);
//      System.out.println(datas);
      
//      한글을 정수로 변경, 일공이사 -> 1024
//      String hangle = "공일이삼사오육칠팔구";
//      String input = "일공이사";
      
//      input.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
      
//      정수를 한글로 변경, 1024 -> 일공이사
//      String hangle = "공일이삼사오육칠팔구";
//      String input = "1024";
//      
//      input.chars().map(i -> i - 48).forEach(i -> System.out.print(hangle.charAt(i)));
      
   }
   
   public int exclude_D(int number) {
      return number > 67 ? number + 1 : number;
   }
   
   public boolean checkOdd(int number) {
      return number % 2 == 1;
   }
   
   
   public int change(int number) {
      return 10 - number;
   }
   
   public int changeToOdd(int number) {
      return number * 2 - 1;
   }
   
   public int changeToEven(int number) {
      return number * 2;
   }
   
}













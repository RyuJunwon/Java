package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
	
//		문자열을 Date로 변경해야 할 때 : 전달받은 문자열에 날짜 연산을 해야할 때
//		Date를 문자열로 변경해야 할 때 : 화면에 뿌려야 할 때		
		
//		▶ String -> LocalDate
//		System.out.println(LocalDate.parse("2020/12/04", DateTimeFormatter.ofPattern("yyyy/MM/dd")));
		
//		▶ String -> String
//		LocalDate localDate = LocalDate.of(2020, 12, 4);
//		System.out.println(localDate);
		
//		System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
		
		
//		> Calendar
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH시 mm분 ss초");
		
//		▶ String -> Date
//		try {
//			System.out.println(simpleDateFormat.parse("1900/12/04 12시 30분 20초"));
//		} catch (ParseException e) {
//			System.out.println("형식 오류");
//		}
		
		
//		싱글턴 패턴
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(1900, 11, 4);
//		System.out.println(calendar);
//		
		
//		▶ Date -> String
//		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
		
//		Date date = new Date(0, 11, 4);
//		date.setYear(0);
//		date.setMonth(11);	//0부터 시작
//		System.out.println(date);
	}
}

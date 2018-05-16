package Date_Calender;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

//Date클래스는 지역화에 대한 부분이 고려되지 않았다.
//Date클래스를 보면 대부분 생성자와 메소드가 Deprecated되어 있다.
public class DateReview {

	public static void main(String[] args) {
		/*Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy~MM~dd 'at' hh:mm:ss a 표준시:zzz");
	
		System.out.println(ft.format(date));
		
		System.out.println(date.getTime());
		
		long today = System.currentTimeMillis();
		System.out.println(today);
		
		System.out.println(today - date.getTime());*/
		// Date 클래스의 단점을 해결하고 등장한 것이 Calender 클래스
	
		/*Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));*/
		//Calender 클래스 ---------------------
		
		LocalDate tp = LocalDate.now();
		System.out.println(tp);
		
		LocalDate tp1 = LocalDate.of(2018, 3, 29);
		System.out.println(tp1);
		
		LocalTime time = LocalTime.of(17, 18);
		System.out.println(time);
		
		LocalTime time1 = LocalTime.parse("10:15:30");
		System.out.println(time1);
	}
}

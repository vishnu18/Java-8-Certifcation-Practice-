import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
enum Days{MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY, SATURDAY,SUNDAY}
public class CreatingDateAndTime {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		LocalDate localdate=LocalDate.of(2018, Month.JULY, 1);
		LocalTime localtime=LocalTime.of(10, 30);
		LocalDateTime localdatetime=LocalDateTime.of(localdate, localtime);
		System.out.println(localdate);
		System.out.println(localtime);
		System.out.println(localdatetime);
		for(Days k:Days.values()) {
			System.out.println(k);
		}
		System.out.println(new Date());
		Calendar calendar =Calendar.getInstance();
		calendar.set(2015, Calendar.JANUARY,1);
		Date t=calendar.getTime();
		System.out.println(t);
		
	}

}

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class UsingDate {
public static void main(String[] args) {
	LocalDate date=LocalDate.of(2070, Month.DECEMBER, 17);
	System.out.println(date);
	date.plusDays(10).plusMonths(12).plusYears(2);
	System.out.println(date);
	date=date.plusDays(10).plusMonths(12).plusYears(2);
	System.out.println(date);
	LocalTime time=LocalTime.now();
	System.out.println(time);
	time.plusHours(10).plus(Duration.ofHours(12));
	System.out.println(time);
	time=time.plusHours(10).plus(Duration.ofHours(12));
	System.out.println(time);
	LocalDateTime localdatetime=LocalDateTime.of(date, time);
	System.out.println(localdatetime);
	localdatetime.plusDays(200).minusHours(10);
	System.out.println(localdatetime);
	localdatetime=localdatetime.plusDays(200).minusHours(10);
	System.out.println(localdatetime);
	//Before Java 8
	System.out.println("Before Java 8");
	Date date7=new Date();
	System.out.println(date7);
	Calendar calendar=Calendar.getInstance();
	Calendar calendar2=Calendar.getInstance();
	System.out.println(calendar);
	calendar.setTime(date7);
	System.out.println(calendar);
	calendar.set(Calendar.DATE, 1);
	calendar.set(Calendar.MONTH,4);
	System.out.println(calendar);
	date7=calendar.getTime();
	System.out.println(date7);
	date7=calendar2.getTime();
	System.out.println(date7);
	
	LocalDate ld=LocalDate.of(2010, Month.APRIL, 1);
	ld.plusDays(10);//return result is ignored
	System.out.println(ld);
	//ld.plusMinutes(10); does not compile no method for localdate
	LocalTime lt=LocalTime.now();
	//lt.plusDays(10);
	
}
}

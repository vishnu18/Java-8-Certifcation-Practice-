import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
class test{
	static String result;
	static{
		result+="c";
	}
	static{
		result+="u";
	}
	{result+="r";}
}
public abstract class UsingDateAndTime {
	abstract void print();
	static{
		System.out.println("Static Initializer");
	}
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalTime.now());
		LocalDate localdate=LocalDate.of(2017, Month.DECEMBER, 15);
		LocalTime localtime=LocalTime.of(10, 12);
		LocalDateTime localdatetime=LocalDateTime.of(localdate, localtime);
		System.out.println(localdate);
		System.out.println(localtime);
		System.out.println(localdatetime);
		System.out.println("Before Java 8");
		System.out.println(new Date());
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Date datefromcalendar=calendar.getTime();
		System.out.println(datefromcalendar);
		
	}

}

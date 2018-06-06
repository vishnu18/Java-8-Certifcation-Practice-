import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {
public static void main(String[] args) {
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM dd yyyy");
	LocalDate ld=LocalDate.parse("10 10 2012", dtf);
	LocalTime lt=LocalTime.parse("10:10");
	System.out.println("Will print with the Default Setting");
	System.out.println(ld);
	System.out.println(lt);
	System.out.println("Will print with the Custom Format");
	String customformat=ld.format(dtf);
	System.out.println(customformat);
	String today="03 23 2017";
	LocalDate todaysDate=LocalDate.parse(today, dtf);
	System.out.println(todaysDate);
	
	todaysDate.plusMonths(6).plusDays(30);
	System.out.println("Date time Instances are immutable");
	System.out.println(todaysDate);
	customformat=todaysDate.format(dtf);
	System.out.println(customformat);
	
	
}
}

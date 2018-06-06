import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormattingDate {
public static void main(String[] args) {
	LocalDate ld=LocalDate.now();
	LocalTime lt=LocalTime.now();
	LocalDateTime ldt=LocalDateTime.of(ld, lt);
	System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE));
	System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_TIME));
	System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	DateTimeFormatter shortFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
	DateTimeFormatter mediumFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	DateTimeFormatter longFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
	DateTimeFormatter fullFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
    System.out.println("Formating using LocalDateTime instance");
	System.out.println(ldt.format(shortFormatter));
    System.out.println(ldt.format(mediumFormatter));
    System.out.println(ldt.format(longFormatter));
    System.out.println(ldt.format(fullFormatter));
   System.out.println("Format using DateTimeFormater Instance");
   System.out.println(shortFormatter.format(ldt));
   System.out.println("Printing Date and time using LocalDate time instance");
   DateTimeFormatter shortdt=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
   DateTimeFormatter mediumdt=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
   DateTimeFormatter longdt=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
   DateTimeFormatter fulldt=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
   System.out.println(ldt.format(shortdt));
   System.out.println(ldt.format(mediumdt));
   ZonedDateTime zdt=ZonedDateTime.of(ldt,ZoneId.of("America/Denver"));
   System.out.println(zdt.format(longdt));
   System.out.println(zdt.format(fulldt));
   System.out.println("Printing Date and time using DateTimeFormatter instance");
   System.out.println(shortdt.format(zdt));
   System.out.println(mediumdt.format(zdt));
   System.out.println(longdt.format(zdt));
   System.out.println(fulldt.format(zdt));
   DateTimeFormatter customFormatter=DateTimeFormatter.ofPattern("MMMM dd yyyy hh:mm");
   System.out.println(customFormatter.format(zdt)); 
   System.out.println("Before Java 8");
   SimpleDateFormat sdt=new SimpleDateFormat("MM dd YYYY hh:mm");
   System.out.println(sdt.format(new Date()));


	}
}


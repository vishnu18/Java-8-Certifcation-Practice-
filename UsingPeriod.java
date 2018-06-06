import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {
	public static void main(String[] args) {
		LocalDate start=LocalDate.of(2017, Month.DECEMBER, 1);
		LocalDate end=LocalDate.of(2018, Month.JUNE, 1);
		System.out.println(start.toEpochDay());
		Period period=Period.ofWeeks(3);
		cleanAnimalCage(start,end,period);
		//start from January 1st 2017
		
		System.out.println(LocalDate.now().plus(period));
		System.out.println(LocalDateTime.now().plus(period));
		//System.out.println(LocalTime.now().plus(period));
	//UnsupportedTemporalTypeException
		cleanAnimalCage(start,end);
		Period yearAndmonth=Period.ofYears(1).ofMonths(3);
		System.out.println(yearAndmonth);
		yearAndmonth=period.of(1, 2, 0);
		System.out.println(yearAndmonth);
	}
private static void cleanAnimalCage(LocalDate start,LocalDate end) {
	// TODO Auto-generated method stub
	while(start.isBefore(end)) {
		System.out.println("Need to clean the cage on Date: "+start);
		start=start.plusMonths(2);
	}

}
private static void cleanAnimalCage(LocalDate start,LocalDate end,Period period){
	while(start.isBefore(end)) {
		System.out.println("Need to clean the Cage on Date "+start);
		start=start.plus(period);
	}
}
}


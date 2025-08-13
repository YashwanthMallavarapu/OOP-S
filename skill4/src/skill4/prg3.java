package skill4;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class prg3 {
	public static void main(String[] args) {
		String dateStr = "2007-02-12";
		LocalDate parsedDate = LocalDate.parse(dateStr);
		System.out.println("Parsed Date: " + parsedDate);
		DayOfWeek day=parsedDate.getDayOfWeek();
		System.out.println(day);

		
	}

}

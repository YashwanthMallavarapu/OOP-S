package skill4;

import java.time.LocalDate;
import java.time.Period;

public class prg2 {
	public static void main(String[] args) {
		Period period=Period.between(LocalDate.of(2007, 02, 12),LocalDate.now());
		System.out.println("Period: " +period.getYears()+" years "+period.getMonths() +  " months");
	}

}

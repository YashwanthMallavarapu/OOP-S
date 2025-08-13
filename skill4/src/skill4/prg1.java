package skill4;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class prg1 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the format ");
		String format=inp.nextLine();
		
		LocalDateTime date=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern(format);
		String FormattedDate=date.format(formatter);
		
		System.out.println(FormattedDate);
		
	}

}

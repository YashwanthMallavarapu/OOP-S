package skill3;
import java.util.Scanner;

public class prg1 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
		int units=inp.nextInt();
		int rpu,extra;
		double total;
		
		if(units>=51 && units<=100) {
			rpu=3;
			extra=0;
			
		}
		else if(units>=101 && units<=300) {
			rpu=5;
			extra=100;
		}
		else if(units>=301 && units<=450) {
			rpu=6;
			extra=200;
		}
		else if(units>450) {
			rpu=8;
			extra=250;
		}
		else {
			rpu=0;
			extra=0;
			System.out.println("Enter nuber above 50");
		}
		
		total=(units*rpu)+extra;
		System.out.println("The total amount is : "+total);
	}

}

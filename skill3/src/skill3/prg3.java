package skill3;
import java.util.Scanner;
public class prg3 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		int sqrt=(int) Math.sqrt(n);	
		if(sqrt*sqrt==n) {
			System.out.println(n+" is a perfect square of "+sqrt);
		}
		else
		{
			System.out.print("It is not a perfect square");
		}
		inp.close();
		
	}

}

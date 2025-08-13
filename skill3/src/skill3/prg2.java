package skill3;
import java.util.Scanner;
public class prg2 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=inp.nextInt();
		//int n=10;
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		for (int i=2;i<n;i++) {
			int next=a+b;
			System.out.print(next+" ");
			a=b;
			b=next;
		}
		
	}

}

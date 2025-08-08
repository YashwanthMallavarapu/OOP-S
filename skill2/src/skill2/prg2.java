package skill2;
import java.util.Scanner;

public class prg2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		StringBuilder sb1=new StringBuilder(str1);
		String str2=input.next();
		StringBuilder sb2=new StringBuilder(str2);
		System.out.println(sb1);
		System.out.println(sb2);
		sb1.append(sb2);
		System.out.println("Concatenated String: "+sb1.toString());
		
		
	}
	

}

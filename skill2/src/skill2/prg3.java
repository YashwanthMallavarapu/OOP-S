package skill2;
import java.util.Scanner;
public class prg3 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String str=input.next();
		StringBuffer sb=new StringBuffer(str);
		System.out.println("The string is : "+sb);
		int lt=sb.length();
		System.out.println("length of string "+lt);
		char ch=sb.charAt(0);
		System.out.println("char at 0: "+ch);
		StringBuffer ns=sb.insert(5, "hii");
		System.out.println("new string: "+ns );
		String rstr = str.replace("o", "a");
		System.out.println("repla: "+rstr);
		StringBuffer ds=sb.delete(0, 2);
		System.out.println("string after deletion: "+ds);
		
	}

}

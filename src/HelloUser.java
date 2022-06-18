import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your name..");
		String str=scan.nextLine();
		System.out.printf("Hello %s Welcome",str);
	}

}

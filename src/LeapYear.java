import java.util.Scanner;

/**
 * @author Ankit
 * 
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("----------Leap Year-------------\nPlease enter year to Check ");
		int year=sc.nextInt();
		if(year==0) {
			System.out.println("Please enter non Zero value");
		}
		if(year%400==0) {
			System.out.println(year +" is Leap Year");
		}
		else if(year%100==0) {
			System.out.println(year +" Not Leap Year");
		}
		else if(year%4==0) {
			System.out.println(year +" is Leap Year");
		}
		else {
			System.out.println("Not Leap year");
		}
		sc.close();
	}

}

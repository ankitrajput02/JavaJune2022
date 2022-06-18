/**
 * Programs to take three names from user and print in proper Message
 */
import java.util.*;
/**
 * @author Ankit
 *
 */
public class PrintThreeNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName,secondName,thirdName;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
	System.out.println("Hello User Please enter Three Names");
	fName=scan.nextLine();
	sName=scan.nextLine();
	tName=scan.nextLine();
	System.out.printf("Hi "+ firstName+" ,"+ secondName +" and "+ thirdName);
		

	}

}

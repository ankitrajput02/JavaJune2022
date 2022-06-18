import java.util.*;

/**
 * @author Ankit
 *
 */
public class IntOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Please enter the value of A, B and C");
		a=sc.nextInt();	//A
		b=sc.nextInt();	//B	
		c=sc.nextInt();	//C
		System.out.print("\nResult of A + B * C= "+(a+b*c));
		System.out.print("\nResult of A * B + C= "+(a*b+c));
		System.out.print("\nResult of C + A / B= "+(c+a/b));
		System.out.print("\nResult of A % B + C= "+(a%b+c));
		sc.close();
	}

}

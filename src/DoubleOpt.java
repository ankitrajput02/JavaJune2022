import java.util.Scanner;

/**
 * @author Ankit
 *
 */
public class DoubleOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double a,b,c;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Please enter the value of A, B and C");
		a=sc.nextDouble();	//A
		b=sc.nextDouble();	//B	
		c=sc.nextDouble();	//C
		System.out.print("\nResult of A + B * C= "+(a+b*c));
		System.out.print("\nResult of A * B + C= "+(a*b+c));
		System.out.print("\nResult of C + A / B= "+(c+a/b));
		System.out.print("\nResult of A % B + C= "+(a%b+c));
		sc.close();

	}

}

/*This class is client code that handles interactions with user and call quadrDescriber
 * @author Nicole Boie
 * @Version October 5, 2018
 */
import java.util.Scanner;
public class QuadraticClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		System.out.println();
		
		String Cont="";
		while (!Cont.equals("quit")) {
			double a;
			double b;
			double c;
			
			System.out.println("a:");
			a = Double.parseDouble(sc.next());
	
			System.out.println("b:");
			b = Double.parseDouble(sc.next());
	
			System.out.println("c:");
			c = Double.parseDouble(sc.next());
			System.out.println();
			Quadratic.quadrDescriber(a, b, c);
			
			System.out.println("Do you want to keep going? "+"(Type \"quit\" to end )");
			Cont=sc.next();
		}
	}
}



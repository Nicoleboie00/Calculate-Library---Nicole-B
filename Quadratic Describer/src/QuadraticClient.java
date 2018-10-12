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

		double a;
		double b;
		double c;
		
		System.out.println("a:");
		a = Double.parseDouble(sc.next());

		System.out.println("b:");
		b = Double.parseDouble(sc.next());

		System.out.println("c:");
		c = Double.parseDouble(sc.next());

		System.out.println(quadraticDescriber(a, b, c));
		
		System.out.println("\n Do you want to keep going? "+"(Type \"quit\" to end )");
		If ()
			
	}
}

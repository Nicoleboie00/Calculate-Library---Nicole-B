/*This class is client code that uses the Calculate Library to perform various mathematical tasks
 * @author Nicole Boie
 * @Version September 6, 2018
 */
public class DoMath {
	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(25,125));
		System.out.println(Calculate.average(5,6,7));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(1,2,-3));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,6,7,"n"));
		System.out.println(Calculate.isDivisibleBy(4,2));
		System.out.println(Calculate.absValue(1));
		System.out.println(Calculate.max(1, 2));
		System.out.println(Calculate.max(1, 2, 3));
		System.out.println(Calculate.min(1, 2));
		System.out.println(Calculate.round2(-3.1445));
		System.out.println(Calculate.exponent(2,2));
		System.out.println(Calculate.factorial(2));
		System.out.println(Calculate.isPrime(2));
		System.out.println(Calculate.gcf(3,31));
		System.out.println(Calculate.sqrt(16));
		System.out.println(Calculate.quadForm(1,-3, 4));

	}
}

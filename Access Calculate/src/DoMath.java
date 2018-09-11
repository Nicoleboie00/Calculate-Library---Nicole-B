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
		System.out.println(Calculate.discriminant(1,2,3));
	}
}
	
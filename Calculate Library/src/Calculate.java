/*This class contains methods that perform various math operations
 * @author Nicole Boie
 * @version September 6, 2018
 */
public class Calculate {
	//returns the square of the input
	public static int square(int number) {
		return number*number;
	}
	public static int cube(int number) {
		return number*number*number;
	}
	public static double average(double number1, double number2) {
		return ((number1+number2)/2);
	}
	public static double average(double number1, double number2, double number3) {
		return ((number1+number2+number3)/3);
	}
	public static double toDegrees(double number) {
		return (number*(180/3.14159));
	}
	public static double toRadians(double number) {
		return (number*(3.14159/180));
	}
	public static double discriminant(double number1, double number2, double number3) {
		return ((number2*number2)-4*number1*number3);
	}
	public static string 
}
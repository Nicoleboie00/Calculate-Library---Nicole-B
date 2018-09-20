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
		//returns the cube of the imput
		return number*number*number;
	}
	public static double average(double number1, double number2) {
		//returns the average of two doubles
		return ((number1+number2)/2);
	}
	public static double average(double number1, double number2, double number3) {
		//returns the average of three doubles
		return ((number1+number2+number3)/3);
	}
	public static double toDegrees(double number) {
		//returns the double from radians to degrees
		return (number*(180/3.14159));
	}
	public static double toRadians(double number) {
		//returns the double from degrees to radians
		return (number*(3.14159/180));
	}
	public static double discriminant(double number1, double number2, double number3) {
		//returns the discriminant of three doubles
		return ((number2*number2)-4*number1*number3);
	}
	public static String toImproperFrac(int number1, int number2, int number3) {
		//returns the improper fraction from a proper fraction
		return ((number1*number3)+number2+"/"+number3);
	}
	public static String toMixedNum(int number1, int number2) {
		//returns a mixed fraction from an improper fraction
		return((number1/number2)+"_"+(number1%number2)+ "/" + number2);
	}
	public static String foil(int num1, int num2, int num3, int num4, String variable ) {
		//foils the binomial form of a quadratic equation
		return (num1*num3+"n^2")+ "+" +((num1*num4)+(num2*num3))+ "n" + "+" + (num2*num4);
	}
	public static boolean isDivisbleBy(int num1, int num2) {
		//determines whether or not a number is divisible by another number
		return (num1%num2==0);
	}
	public static double absValue(double num1) {
		//returns the absolute value of a number
		if (num1<0){
		 return (num1*-1);
		} else { 
			return (num1);
		}
	}
	public static double max(double num1, double num2) {
		//returns the larger of two numbers
		if (num1<num2) {
			return (num2);
		} else { 
			return (num1);
		}
	}
	public static double max(double num1, double num2, double num3) {
		//returns the largets of three numbers
		if (num1<num2) {
			if (num2<num3) {
				return (num3);
			}
		}
		if (num3<num2) {
			if (num2<num1) {
				return (num1);
		} else { 
			return (num2);
			}
		}
		return (num2);
	}
	public static int min(int num1, int num2) {
		//returns the smaller of two numbers
		if (num1>num2) {
			return (num1);
		}else {
			return (num2);
		}
			
		}
	//rounds to 2 decimal places
	public static double round2(double num1) {
		double num2= (num1+.005);
		double num3= (num2*100);
		int num4= (int)num3;
		double num5= (double)num4/100;
		return (num5);	
		}	
	//returns a number raised by a positive exponent
	public static double exponent(double num1, int num2) {
			double num3 = 1;
			for (int i = 0; i < num2; i++) {
				num3 *= num1;
			}
			return num3;
		}
	//returns the factorial of a number
	public static int factorial(int num1) {
		int num2= 1;
		for (int i = 1; i <= num1; i++) {
			num2 *= i;
		}
		return num2;
	}
	//determines if a number is prime
	public static boolean isPrime (int num1) {
		int num2 = 2;
		while(!isDivisbleBy(num1, num2)) {
			num2++;
		}
		if(num2 == num1) {
			return true;
		} else {
			return false;
		}
	}
	public static int gcf(int num1, int num2) {
		//returns the greatest common factor of two numbers
		int num3 = (int) max(num1, num2);
		if (isPrime(num1));
		return num3;
	}
	public static double sqrt(double num1, double num2) {
		int num2 = 1
	}
}

		
	

	
	

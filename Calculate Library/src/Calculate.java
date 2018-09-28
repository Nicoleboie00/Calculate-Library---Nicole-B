/*This class contains methods that perform various math operations
 * @author Nicole Boie
 * @version September 6, 2018
 */
public class Calculate {
	//returns the number times itself
	public static int square(int number) {
		return number*number;
	}
	public static int cube(int number) {
		//returns the number times itself 3 times
		return number*number*number;
	}
	public static double average(double number1, double number2) {
		//returns the add two doubles then divide by two
		return ((number1+number2)/2);
	}
	public static double average(double number1, double number2, double number3) {
		//returns the add three doubles together and divide by three
		return ((number1+number2+number3)/3);
	}
	public static double toDegrees(double number) {
		//returns the the double from radians to degrees)
		return (number*(180/3.14159));
	}
	public static double toRadians(double deg1) {
		//returns the double from degrees to radians
		return (deg1*(3.14159/180));
	}
	public static double discriminant(double a, double b, double c) {
		//returns the discriminant(the numbers under the root symbol in a quadratic formula) of three doubles
		return ((b*b)-4*a*c);
	}
	public static String toImproperFrac(int wholenum, int num, int den) {
		//returns the improper fraction from a proper fraction
		if(den==0)throw new IllegalArgumentException("Denominator can't be zero");
		return ((wholenum*den)+num+"/"+den);
	}
	public static String toMixedNum(int num, int den) {
		//returns a mixed fraction from an improper fraction
		return((num/den)+"_"+(num%den)+ "/" + den);
		//divide one number by another, add a space, find the remainder from mod, print a division symbol, add 2
	}
	public static String foil(int num1, int num2, int num3, int num4, String variable ) {
		//foils the binomial form of a quadratic equation
		return (num1*num3+"n^2")+ "+" +((num1*num4)+(num2*num3))+ "n" + "+" + (num2*num4);
		//foil the numbers adding n^2, n, or nothing to show it not a normal number but has a variable
	}
	public static boolean isDivisibleBy(int num1, int num2) {
		//determines whether or not a number is divisible by another number
		if(num2==0)throw new IllegalArgumentException("Can't divide by 2");
		return (num1%num2==0);
		//mod checks the remainder
	}
	public static double absValue(double num1) {
		//returns the absolute value of a number
		if (num1<0){
		 return (num1*-1);
		 //makes the negative value always positive
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
		//returns the largest of three numbers
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
		if (num1<num2) {
			return (num1);
		}else{
			return (num2);
		}	
	}
	public static double round2(double num1) {
		//rounds to 2 decimal places
		double num2= (num1+.005);
		//add .005 to num1
		double num3= (num2*100);
		//multiply by 100 to be capable of turning into an int
		int num4= (int)num3;
		//turn num3 into an int and call it num4 cutting off any remaining decimal numbers
		double num5= (double)num4/100;
		//turn back into a double so it is able to return
		return (num5);	
		}	
	public static double exponent(double num1, int exp) {
	//returns a number raised by a positive exponent
		double num2 = 1;
		//intialize a variable
		if(exp<0)throw new IllegalArgumentException("no negative numbers");
				for (int a = 0; a < exp; a++) {
					//num1 is always positive 
					num2*=num1 ;
					//num2 is the old num2 times num1
				}
		return (num2);
	}
	public static int factorial(int num1) {
	//returns the factorial of a number
		int num2 = 1;
		if(num1<0)throw new IllegalArgumentException("no negative numbers");
		for (int a = 1; a <= num1;a++) {
				//as long as a is less than or equal to one, starting from zero, add 1 to a
				num2*=a;
		}
			return(num2);
		
	}	
	public static boolean isPrime (int num1) {
		//determines if a number is prime
		int num2 = 2;
			while(!isDivisibleBy(num1, num2)) {
				num2++;
			//if num1 is divisible by num2 add 1 to two
		}
		if(num2 == num1) {
			//determining if they are the same number
			return (true);
		} else {
			return (false);
		}
	}
	public static int gcf (int num1, int num2) {
		//returns the greatest common factor between 2 numbers
        int a = (int) max(num1, num2);
        //finds the max number
        if(isPrime(a)) {
        	//finds if the max number is prime, which if true means the gcf is 1
            return 1;
        } else {
        	 int b= (int) min(num1, num2);
        	 //find the minimum number
            while (!isDivisibleBy(b,a))
            	//if the minimum number is divisible by  the max number subtract one from the max
                a--;
            }
            return a;
        }
	public static double sqrt (double num1) {
		//returns a  number squared
		if(num1<0)throw new IllegalArgumentException("Can't square a negative number");
		double Test1 = (num1/10);	
		while (Test1*Test1 > num1+0.5 || Test1*Test1 < num1-0.05){
			//test1^2 is more than num1+.5 or test1^2 is less than num1+.5
		double sqr =((num1/Test1 + Test1)*.5);
		//initialize sqr as num1 divided by 2(test1) times .5
			Test1 = (sqr);
		}
		return round2(Test1);
	}

	public static String quadform (int a, int b, int c) {
		double base = (double) (sqrt(discriminant(a,b,c)));
		if (discriminant(a,b,c)<0) {
			return ("no real roots");
		}
		//sqrt of the discriminant
		double XOne = (double) ((-b+(base))/(2*a));
		//adding base in the quad form
		double XTwo = (double) ((-b-(base))/(2*a));
		//subracting the base in the quad form
		double rXOne = round2(XOne);
		double rXTwo = round2(XTwo);
		//rounds roots 2 decimal places
		if (rXOne==rXTwo) {
			return (rXOne+ "");
		//if there is only one root, return that
		}else{
		double SX1 = min(rXOne, rXTwo);
		double LX1 = max(rXOne, rXTwo);
		//if there are two roots find which is min and max, then return it in that order
		return (SX1+ "and"+ LX1);
		}
	}	
	public static double min(double num1, double num2) {
		//returns the smaller of two numbers
		if (num1<num2) {
			return (num1);
		}else{
			return (num2);
		}	
	}
}


	

	
	

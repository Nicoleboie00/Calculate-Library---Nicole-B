/*This class is reponsible for all calculations
 * @author Nicole Boie
 * @Version October 5, 2018
 */
public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
	//opens
		if (a>0) {
			String open = ("Opens:" + "Up");	
		}else {
			String open= ("Opens:" + "Down");
			//return open
			//do i have to find if a = 0
		}
	//axis of symmetry
		double line = ((-b)/(2*a));
			String aos = ("Axis of Symmetry:" + line);
			//return aos
	//vertex
			double h = b/(2*a);
			//x value vertex equation
			double k = a*(h*h)+h+c;
	}
			//y value vertex equation/plug x into the equation
			//return (h,k)
			public static double discriminant(double a, double b, double c) {
				//returns the discriminant(the numbers under the root symbol in a quadratic formula) of three doubles
				return ((b*b)-4*a*c);
			}
			public static double round2(double num1) {
				//rounds to 2 decimal places
				double num2;
				if(num1>0) {
					num2= (num1+.005);
				}else {
					num2= (num1-.005);
				}
				//add .005 to num1
				double num3 = (num2*100);
				//multiply by 100 to be capable of turning into an int
				int num4= (int)num3;
				//turn num3 into an int and call it num4 cutting off any remaining decimal numbers
				double num5= (double)num4/100;
				//turn back into a double so it is able to return
				return (num5);
			}
				public static double sqrt (double num1) {
					//returns a  number squared
					if(num1<0)throw new IllegalArgumentException("Can't square a negative number");
					double Test1 = (num1/10);	
					while (Test1*Test1 > num1+0.05 || Test1*Test1 < num1-0.05){
						//test1^2 is more than num1+.5 or test1^2 is less than num1+.5
					double sqr =((num1/Test1 + Test1)*.5);
					//initialize sqr as num1 divided by 2(test1) times .5
						Test1 = (sqr);
					}
					return round2(Test1);
				}
				public static double max(double num1, double num2) {
					//returns the larger of two numbers
					if (num1<num2) {
						return (num2);
					} else { 
						return (num1);
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
	//x intercept
	public static String quadform (int a, int b, int c) {
			double top = (double) (sqrt(discriminant(a,b,c)));
			if (discriminant(a,b,c)<0) {
				return ("no real roots");
			}else if (discriminant(a,b,c)==0)	{
				return (-b/(2*a)+ "");
			}else{
			//the top both positive and negative parts
			double XOne = round2((-b+(top))/(2*a));
			//adding top in the quad form
			double XTwo = round2((-b-(top))/(2*a));
			//returning if there is one root
			if (XOne==XTwo) {
				return (XOne+ "");
			//min max of roots
			}else{
			double SX1 = min(XOne, XTwo);
			double LX1 = max(XOne, XTwo);
			//if there are two roots find which is min and max, then return it in that order
			return (SX1+ " and "+ LX1);
			String XINT = ("x-intercept(s):" + SX1+ " and "+ LX1);
			}
	//y intercept
			String YINT = 
			
		}	
	}
	return 
}

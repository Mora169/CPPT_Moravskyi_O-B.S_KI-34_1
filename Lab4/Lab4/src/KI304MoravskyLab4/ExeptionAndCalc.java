package KI304MoravskyLab4;

/**
 *EquationsApp is a straightforward Java application designed to compute the outcome of the equation 
 *y = ctg(x)/tg(x) and save the result to a user-specified file.
 *
 *The application prompts the user to input a file name and an integer value for 'x'. 
 *Subsequently, it computes the equation result using the provided 'x' value. The program is 
 *equipped to manage exceptions related to both file operations and equation calculations.
 * 
 * @author Moravsky
 * @version 1.0
 */
public class ExeptionAndCalc extends ArithmeticException {
    public ExeptionAndCalc() {}
    public ExeptionAndCalc(String cause) {
        super(cause);
    }
}

class Equations {
	/**
     * Calculate the square of the cotangent (ctg^2) of the given angle 'x' (in degrees).
     *
     * @param x The input angle in degrees.
     * @return The square of the cotangent of 'x'.
     * @throws CalcException If 'x' is an invalid value for cotangent calculation.
     */
    public double calculate(int x) throws ExeptionAndCalc {
        double y, rad;
        int i=1;
        if(x>360) {
        	for(i=1 ;x<i*360;i++) {}
        	x=x-(i*360);
        }
        rad = Math.toRadians(x);
        try {
            double tanValue = Math.tan(rad);
            if (rad==Math.PI ||x==0 ||x==360||x==90||x==270) {
                throw new ArithmeticException();
            }
            y = 1.0 / (tanValue * tanValue);
        } catch (ArithmeticException ex) {
                throw new ExeptionAndCalc("Exception the value of X " +x+ " is error");
        }
        return y;
    }
}

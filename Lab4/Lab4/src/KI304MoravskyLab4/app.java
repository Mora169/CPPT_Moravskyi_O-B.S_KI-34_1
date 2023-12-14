
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
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

 class app {

    public static void main(String[] args) {
        out.print("Enter file name: ");
        Scanner in = new Scanner(System.in);
        String fName = in.nextLine();

        PrintWriter fout = null;

        try {
            fout = new PrintWriter(new File(fName));

            Equations eq = new Equations();

            out.print("Enter X: ");
            int x = in.nextInt();

            double result = eq.calculate(x);
            System.out.println(result);
            fout.print(result);
            fout.flush();
            fout.close();
        } catch (FileNotFoundException ex) {
            out.print("Exception reason: File not found");
        } catch (ExeptionAndCalc ex) {
            out.print(ex.getMessage());
        } finally {
            if (fout != null) {
                fout.close();
            }
        }
    }
}

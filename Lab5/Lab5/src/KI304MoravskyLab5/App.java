package KI304MoravskyLab5;
import java.io.*;
import java.util.*;
/**
 *EquationsApp is a straightforward Java application designed to compute the outcome of the equation 
 *y = ctg(x)/tg(x) and save the result to a user-specified file.
 *
 * @author Moravsky
 * @version 1.0
 */
public class App {
    public static void main(String[] args) {
        Calc equation = new Calc();
        FileUtils fileUtils = new FileUtils();
        double result;
        double fileResult;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        try {
            int x = scanner.nextInt();
            result = equation.calculate(x);
            System.out.println("Result is " + result);
            // Write the result to a text file
            fileUtils.writeResTxt("E:\\REPOS\\CPPT_LABS\\Lab5/textRes.txt", result);
            // Write the result to a binary file
            fileUtils.writeResBin("E:\\REPOS\\CPPT_LABS\\Lab5/binRes.bin", result);
            // Read the result from the binary file
            fileResult = fileUtils.readResBin("E:\\REPOS\\CPPT_LABS\\Lab5/binRes.bin");
            System.out.println("Result from binary file is: " + fileResult);
            // Read the result from the text file
            fileResult = fileUtils.readResTxt("E:\\REPOS\\CPPT_LABS\\Lab5/textRes.txt");
            System.out.println("Result from txt file is: " + fileResult);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

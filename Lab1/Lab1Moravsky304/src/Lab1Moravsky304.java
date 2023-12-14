import java.io.*;
import java.util.*;
/**
 * Клас LAB_1_Moravsky304 реалізує виведення масиву згідно з завданням варіанту №11
 * @author Moravsky 304 
 * @version 1.0
 * @since version 1.0
 */

public class Lab1Moravsky304 {


	  /**
	   *  this program will output a cog array:
	   *  01
	   *  10
	   * @param args
	   * @throws FileNotFoundException
	   */
	    public static void main(String[] args) throws FileNotFoundException {
	    	
	        Scanner in = new Scanner(System.in);
	        //створення файлу 
	        PrintWriter fout = new PrintWriter ("MyFile.txt");
	        //змінні
	        char[][] arr;
	        int n__ROWS;
	        String symbol;
	        System.out.println("Введіть розмір квадратної матриці: ");
	        
	        n__ROWS = in.nextInt();
	        
	        fout.print("Розмір квадратної матриці: " + n__ROWS +"\n");
	        /**
	         * перевірка на додантність
	         * checking for positiveness
	         */
	        if( n__ROWS < 0 ) {
	        	
	        	
	        	n__ROWS *= -1;
	        	
	        	System.out.print("розмір квадратної матриці є відємний тому ми перевкдем його в додатній. "+ n__ROWS +"\n");
	        	
	        	fout.print("розмір квадратної матриці є відємний тому ми перевкдем його в додатній " + n__ROWS + "\n");
	        }
	        /**
	         * перевірка на парність
	         * parity checking
	         */
	        if( n__ROWS %2 != 0 ) {
	        	
	        	System.out.print("розмір квадратної матриці збільшений на 1.\n");
	        	
	        	n__ROWS += 1;
	        	
	        	fout.print("Розмір квадратної збільшений до: " + n__ROWS + "\n");
	        }

	        
	        System.out.println("Введіть символ-заповнювач: \n");
	        
	        in.nextLine();
	        
	        symbol = in.nextLine();
	        
	        fout.print("символ-заповнювача: " + symbol +"\n");
	        /**
	         * перевірка на правельність елемента
	         * checing the correctness of the element
	         */
	        if (symbol.length() != 1)
	        {
	        	System.out.print("\nСимвол-заповнювач введено невірно.");
	        	
	        	fout.print("\nСимвол-заповнювач введено невірно");
	        	
	            System.exit(0);
	        }
	        
	        arr = new char[n__ROWS][];
	        
	        /**
	         * Цикл заповнення та вивидення масиву
	         * Array filling and sorting cycle
	         */
	        
	        int checking__of__the__array = 0;
	        
	        for (int i = 0; i <n__ROWS; i++)
	        {
	        	if(checking__of__the__array < n__ROWS/2) {
	        		for (int midle__of__rows = n__ROWS/2; midle__of__rows > 0; midle__of__rows--) {
	        			System.out.print("\t");
	        			fout.write("\t");
	        		}

	        		arr[i] = new char[n__ROWS/2];

	        		for (int j = 0; j < n__ROWS/2; j++)
	        		{
	        			arr[i][j] = (char)symbol.codePointAt(0);
	        			System.out.print(arr[i][j] + "\t");
	        			fout.write(arr[i][j] + "\t");
	        		}
	        		System.out.println();
	        		fout.println();
	        	}
	        	else {
	        		
	        		arr[i] = new char[n__ROWS/2];
	        		for (int j = 0; j < n__ROWS/2; j++)
	        		{
	        			arr[i][j] = (char)symbol.codePointAt(0);
	        			System.out.print(arr[i][j] + "\t");
	        			fout.write(arr[i][j] + "\t");
	        		}
	        		
	        		System.out.println();
	        		fout.println();
	        	}
	        	
	        checking__of__the__array +=1;
	        }
	        
	        fout.close();
	        in.close();
	        System.out.close();
	    }
	    }

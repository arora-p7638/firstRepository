import java.util.Scanner;

/**
 * 
 */

/**
 * @author parva
 *
 */
public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int varA,varB;
	int result;
	System.out.println("Enter variable A");
	varA=sc.nextInt();
	System.out.println("Enter variable B");
	varB=sc.nextInt();
	result=varA+varB;
	System.out.println("The sum is :"+result);
	result=varA-varB;
	System.out.println("The differnce is :"+result);
	// git is on branch b1
	//adding some more lines to test
	System.out.println("The above program shows simple addition and subtraction");
	result=varA*varB;
	System.out.println("The product is :"+result);
}
}

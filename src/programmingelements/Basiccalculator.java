package programmingelements;
import java.util.Scanner;
public class Basiccalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1");
		double number1=sc.nextDouble();
		System.out.println("Enter the number 2");
		double number2=sc.nextDouble();
		double addition=number1+number2;
		double subtraction=number1-number2;
		double multiplication=number1*number2;
		double division=number1/number2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers"+ number1+"and "+number2+" is"+
				addition+" , " +subtraction+" , "+ multiplication +"and "+ division);
	}
}

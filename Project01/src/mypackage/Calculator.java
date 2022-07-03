package mypackage;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char operator;
Double num1, num2, result;
Scanner input = new Scanner(System.in);
System.out.println("choose an operator : +,-,* or /");
operator = input.next().charAt(0);
System.out.println("Enter your first number");
num1 = input.nextDouble();
System.out.println("Enter your second number");
num2 = input.nextDouble();

switch (operator) {

case '+':
	result = num1+num2;
	System.out.println(num1 +  "+" + num2 + " = "  +result);
	break;
	
case '-':
	result = num1-num2;
	System.out.println(num1 + "-" + num2 +" = "  +result);
	break;
	
case '*':
	result = num1*num2;
	System.out.println(num1 + "*" + num2 +" = "  +result);
	break;
	
case '/':
	result = num1/num2;
	System.out.println(num1 + "/" + num2 +" = "  +result);
	break;
	
	default :
		System.out.println("invalid choice!");
		break;
		
}
input.close();

	}

}

import java.util.*;

public class Problem1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=5;
		int b=2;
		char operator;
		double answer=5.2;
		
		Scanner scanObject= new Scanner(System.in);
		
		System.out.println("Please enter a");
		a = scanObject.nextInt();
		System.out.println("Please enter b");
		b = scanObject.nextInt();
		System.out.println("What operation? ");
		operator = scanObject.next().charAt(0);
	
		switch (operator) {
		case '+': answer = a + b;
		break;
		case '-': answer = a - b;
		break;
		case '*': answer = a * b;
		break;
		case '/': answer = a / b;
		break;
		}
		
		System.out.println(a+" "+operator+" "+b+"="+answer);

	}

}

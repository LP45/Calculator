package arithmaticCalc;
import java.util.Scanner;

public class Math {
	
	 public static double add(double one, double two) {
		return one + two;
	}
	 static double subtract(double one, double two) {
			return one - two;
		}
	 static double multiply(double one, double two) {
			return one * two;
		}
	 public static double divide(double one, double two) {
		 return one / two;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Would you like to Add, Divide, Multiply or Subtract");
		String option = scan.next().toLowerCase();
				System.out.println("Please Pick your 1st number");
				double num1 = scan.nextDouble();
				System.out.println("Please Pick your 2nd number");
				double num2 = scan.nextDouble();
				if(num1 >=1 && num2>=1 && num1<=5 && num2<=5) {
					System.out.println("Invalid Entry, Try Again!");
				}
				else {	
					switch(option) {
				case "add": System.out.println(add(num1, num2));
					  break;
				
				case "subtract": System.out.println(subtract(num1, num2));
				  	  break;
			
				case "multiply": System.out.println(multiply(num1, num2));
				  break;
				  
				case "divide": System.out.println(divide(num1, num2));
				  break;
			
				default: undefined : System.out.println("");
					break;
				
		}
			
		
		}

	
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

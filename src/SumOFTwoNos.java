import java.util.Scanner;

public class SumOFTwoNos {

	public static void main(String[] args) {
	//Sum without taking input from user
		 int num1 = 5, num2 = 15, sum, sums;
	      sum = num1 + num2;

	      System.out.println("Sum of these numbers: "+sum);
	      
	      
	//Sum by taking input form user
	      Scanner sc= new Scanner(System.in);   
	      System.out.print("Enter first number- ");  
	      int a= sc.nextInt();  
	      
	      Scanner hc= new Scanner(System.in);    
	      System.out.print("Enter Second number- ");  
	      int b= sc.nextInt(); 
	      
	      sums = a + b;
	      System.out.println("Sum of these numbers: "+sums);
	}

}

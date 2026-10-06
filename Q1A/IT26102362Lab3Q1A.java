import java.util.Scanner;

public class IT26102362Lab3Q1A{
	public static void main(String[]args){
		float  priceOf1kg, numOfKilograms, totalAmount;
		Scanner input=new Scanner(System.in);
	
		System.out.print("Enter the price of 1kg of rice: ");
		priceOf1kg = input.nextFloat();
	
		System.out.print("Enter the number of kilograms you want to buy: ");
		numOfKilograms= input.nextFloat();
	
		totalAmount= priceOf1kg * numOfKilograms;
		System.out.println("The total amount is: " + totalAmount);
	}
}
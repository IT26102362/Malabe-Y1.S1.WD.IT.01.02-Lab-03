import java.util.Scanner;

public class IT26102362Lab3Q1B{
	public static void main(String[]args){
		float  priceOf1kg, numOfKilograms, totalAmount, discount, totalAmountWithDiscount;
		Scanner input=new Scanner(System.in);
	
		System.out.print("Enter the price of 1kg of rice: ");
		priceOf1kg = input.nextFloat();
	
		System.out.print("Enter the number of kilograms you want to buy: ");
		numOfKilograms= input.nextFloat();
	
		totalAmount= priceOf1kg * numOfKilograms;
		discount= (totalAmount/100)*10;
		totalAmountWithDiscount= totalAmount-discount;
		System.out.print("\n\nThe total amount with 10% discount is: " + totalAmountWithDiscount);
	}
}
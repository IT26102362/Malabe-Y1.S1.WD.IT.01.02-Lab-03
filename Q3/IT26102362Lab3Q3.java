import java.util.Scanner;

public class IT26102362Lab3Q3{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		int amount = 0;
		
		int note5000;
		int note1000;
		int note500;
		int note200;
		int note100;
		int note50;
		int note20;
		int Coins10;
		int Coins5;
		int Coins2;
		int Coins1;
		
		System.out.print("Enter the rupee amount: ");
		amount= input.nextInt();
		
		note5000= amount/5000;
		amount= amount%5000;
		
		note1000= amount/1000;
		amount= amount%1000;
		
		note500= amount/500;
		amount= amount%500;
		
		note200= amount/200;
		amount= amount%200;
		
		note100= amount/100;
		amount= amount%100;
		
		note50= amount/50;
		amount= amount%50;
		
		note20= amount/20;
		amount= amount%20;
		
		Coins10= amount/10;
		amount= amount%10;
		
		Coins5= amount/5;
		amount= amount%5;
		
		Coins2= amount/2;
		amount= amount%2;
		
		Coins1= amount/1;
		amount= amount%1;
		
		System.out.println("\n5000 Notes - "+ note5000);
		System.out.println("1000 Notes - "+ note1000);
		System.out.println("500 Notes - "+ note500);
		System.out.println("200 Notes - "+ note200);
		System.out.println("100 Notes - "+ note100);
		System.out.println("50 Notes - "+ note50);
		System.out.println("20 Notes - "+ note20);
		System.out.println("10 Coins - "+ Coins10);
		System.out.println("5 Coins - "+ Coins5);
		System.out.println("2 Coins - "+ Coins2);
		System.out.println("1 Coins - "+ Coins1);
	}
}
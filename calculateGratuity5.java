//ÂÀÐã·É 2019118535121 2020/9/18 17:15

package Chapter2;

import java.util.Scanner;

public class calculateGratuity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity_rate = input.nextDouble();
		
		double gratuity = subtotal * (gratuity_rate/100);
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total + ".");
	}

}

//ÂÀĞã·É 2019118535121 2020/9/25 12:48

package Chapter3;

import java.util.Scanner;

public class TextISBN9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int number = input.nextInt();
		
		int sum = 0;
		int old = number;
		for(int i = 9;i >= 1;i--) {
			sum += number % 10 * i;
			number /= 10;
		}
		int endnumber = sum % 11;
		System.out.printf("The ISBN-10 number is %09d" ,old);
		if(endnumber == 10)
			System.out.println("X");
		else
			System.out.println(endnumber);
	}

}

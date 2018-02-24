import java.util.Scanner;

public class TempFToC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Would you like to know the Temperature in (F)ahrenheit or (C)elsius?");
		char temp = input.nextLine().toLowerCase().trim().charAt(0);

		if (temp == ('c')) {

			System.out.print("Input Temp in Fahrenheit: ");
			int fahrenheit = input.nextInt();
			System.out.println((fahrenheit - 32) * 5 / 9 + " Degrees Celsius");

		} else if (temp == ('f')) {
			System.out.print("Input Temp in Celsius: ");
			int celsius = input.nextInt();
			System.out.println((celsius * 9 / 5) + 32 + " Degrees Fahrenheit");

		} else {
			System.out.println(
					"Please enter Fahrenheit or F if your known Temperature is in Celsius, and Celsius or C if your known Temperature is in Fahrenheit");
		}

		input.close();
	}
}

import java.util.Scanner;

public class TempConverterInterface {

	private static Scanner kbrd = new Scanner(System.in);
	private static String input;
	private static double numForConversion;

	public static void main(String[] args) {

		ConversionMethods c = new ConversionMethods();

		System.out.println("Welcome to Temp Converter!");
		conversionMenu();
		
		while (true) {

			switch (input) {
			case "c>f":
				System.out.println("Please enter degrees in Celcius.");
				numForConversion = kbrd.nextDouble();
				System.out.println(numForConversion + " Celsius is equal to "
						+ c.celciusToFaranheit(numForConversion)
						+ " degrees Fahrenheit.");
				System.out.println();
				conversionMenu();
				break;
			case "f>c":
				System.out.println("Please enter degrees in Fahrenheit.");
				numForConversion = kbrd.nextDouble();
				System.out.println(numForConversion
						+ " Fahrenheit is equal to "
						+ c.fahrenheitToCelcius(numForConversion)
						+ " degrees Celcius.");
				System.out.println();
				conversionMenu();
				break;
			case "q":
				System.exit(0);
				break;
			default:
				System.out.println("Incorrect Input.");
				System.out.println();
				conversionMenu();
				break;
			}
		}
	}

	public static void conversionMenu() {
		System.out.println("Please enter a command.");
		System.out.println("c>f: convert celcius to fahrenheit");
		System.out.println("f>c: convert fahrenheit to celcius");
		System.out.println("q: quit program");
		input = kbrd.next();
	}
}
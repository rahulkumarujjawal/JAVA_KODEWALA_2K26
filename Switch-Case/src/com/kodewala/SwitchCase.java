package com.kodewala;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("SwitchCase.main()");
		
		int day = Integer.parseInt(args[0]);
		
		String output = SwitchCase.indetifyDay(day);
		System.out.println(output);
	}

	public static String indetifyDay(int number) {
		String day = null;

		switch (number) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;

		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;

		default:

			day = "unknown";
			break;
		}
		return day;
	}
}

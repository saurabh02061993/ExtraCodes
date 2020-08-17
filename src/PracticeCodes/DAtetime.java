package PracticeCodes;
import java.time.LocalDate;
import java.util.Calendar;

public class DAtetime {

	static void printweekOrWeekend(String day) {
		String dayString;

		switch (day) {
		case "MONDAY":
			dayString = "Weekday";
			break;
		case "TUESDAY":
			dayString = "Weekday";
			break;
		case "WEDNESDAY":
			dayString = "Weekday";
			break;
		case "THURSDAY":
			dayString = "Weekday";
			break;
		case "FRIDAY":
			dayString = "Weekday";
			break;
		case "SATURDAY":
			dayString = "Weekend";
			break;
		case "SUNDAY":
			dayString = "Weekend";
			break;
		default:
			dayString = "Invalid day";
			break;
		}
		System.out.println(dayString);
	}

	public static void main(String[] args) {
		String k = LocalDate.now().getDayOfWeek().name();
		printweekOrWeekend(k);

	}

}

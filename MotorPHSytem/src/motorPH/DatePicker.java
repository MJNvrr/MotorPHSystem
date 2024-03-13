package motorPH;

import java.util.Calendar;
import java.util.Vector;

public class DatePicker {
	public static Vector<String> getDates(int month, int year) {
        Vector<String> dates = new Vector<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // Note: Months are 0-based in Calendar class
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int day = 1; day <= daysInMonth; day++) {
            dates.add(String.format("%02d/%02d/%d", day, month, year));
        }

        return dates;
    }
}


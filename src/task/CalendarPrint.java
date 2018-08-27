package task;

import java.util.Calendar;

public class CalendarPrint {

	Calendar Wal = Calendar.getInstance();

	String[] CWeek = { "Sun", "Mon", "Thu", "Wed", "Thu", "Fri", "Sat" };
	String[][] CDay = new String[6][7];

	int width = 7;
	int startDay;
	int lastDay;
	private int inputDate = 1;

	public CalendarPrint(int year, int month) throws Exception {
		if (month < 1 || month > 12) {
			System.out.println("월은 1~12사이의 수입니다");
			throw new Exception();
		} else {

			Wal.set(Calendar.YEAR, year);
			Wal.set(Calendar.MONTH, month - 1);
			Wal.set(Calendar.DATE, 1);

			startDay = Wal.get(Calendar.DAY_OF_WEEK);
			lastDay = Wal.getActualMaximum(Calendar.DATE);

			int row = 0;
			for (int i = 1; inputDate <= lastDay; i++) {
				if (i < startDay)
					CDay[row][i - 1] = "";
				else {
					CDay[row][(i - 1) % width] = Integer.toString((inputDate));
					inputDate++;

					if (i % width == 0)
						row++;
				}
			}
		}

	
	}

	public void printCal() {
		for (int i = 0; i < width; i++) {
			System.out.print(CWeek[i] + "\t");
		}
		System.out.println();
		int row = 0;

		for (int j = 1; j < lastDay + startDay; j++) {
			System.out.print(CDay[row][(j - 1) % width] + "\t");
			if ((j - 1) % width == width - 1) {
				System.out.println();
				row++;
			}
		}
	}
}
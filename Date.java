/**
* created by @ann_icel on 9/14/16
*/



public class Date {
	private int year; // month is from[1000, 9999];
	private int month; // month is from[1, 12];
	private int day; //day is from [1, 31];

	public Date() {
		year = 1000;
		month = 1;
		day = 1;
	}

	public Date(int year, int month, int day) {
		setDate(year, month, day);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 12) {
            throw new IllegalArgumentException("There are only twelve months in a year!");
        } else if (month < 1) {
        	throw new IllegalArgumentException("There's no negative month.");
        }
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day < 1) {
			throw new IllegalArgumentException("There's no such negative day!");
		}
	else if (day > 31) {
            throw new IllegalArgumentException("One month has a maximum number of 31 days!");
        } else if (this.month == 2 && !((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) && day > 28) {
            throw new IllegalArgumentException("This year is not a leap year. We only have 28 days in February.");
        } 
        else if (this.month == 2 && ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) && day > 29) {
            throw new IllegalArgumentException("We only have 29 days in February when it is leap year!");
        }
        else if ((this.month <= 7) && (this.month % 2 == 0) && (day > 30)) {
            throw new IllegalArgumentException("That month has only 30 days!");
        }
        else if ((this.month > 7) && (this.month % 2 != 0) && (day > 30)) {
            throw new IllegalArgumentException("That month has only 30 days!");
        }
		this.day = day;
	}

	public void setDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public String toString() {
		return String.format("%02d/%02d/%d\n ", this.day, this.month, this.year);
	}

}

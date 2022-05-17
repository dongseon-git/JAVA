package com.pcwk.oop02;

public class MyDate {

	private int day;// 일
	private int month;// 월
	public int year;// 년도

	public MyDate() {
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<1 || month>13) {
			System.out.println("월을 확인하세요");
		}else {
		this.month = month;
		}
		}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year<1 || year>9999) {
			System.out.println("연도를 확인하세요");
		}else {
		
		this.year = year;
	}
	}
	public MyDate(int day, int month, int year) {
		super();
		//this.day = day;
	    setDay(day);
	    setMonth(month);
	    setYear(year);
		
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {

		if (day == 2) {
			if (day < 1 || day > 29) {
				System.out.println("일수를 확인하세요");
			} else {
				this.day = day;
			}
		}
	}

}

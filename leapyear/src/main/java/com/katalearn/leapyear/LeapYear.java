package com.katalearn.leapyear;

public class LeapYear {

	public boolean isLeapYear(int year) {

		if (year%400 == 0)
			return true;
		return false;
	}

}

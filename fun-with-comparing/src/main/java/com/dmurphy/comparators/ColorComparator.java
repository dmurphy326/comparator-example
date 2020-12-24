package com.dmurphy.comparators;

import java.util.Comparator;

import com.dmurphy.Diamond;

public class ColorComparator implements Comparator<Diamond> {

	@Override
	public int compare(Diamond d1, Diamond d2) {
		if(d1.getColor() < d2.getColor()) return -1;
		if(d1.getColor() > d2.getColor()) return 1;
		return 0;
	}

}

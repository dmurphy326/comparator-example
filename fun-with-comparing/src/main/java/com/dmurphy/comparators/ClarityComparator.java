package com.dmurphy.comparators;

import java.util.Comparator;

import com.dmurphy.Diamond;

public class ClarityComparator implements Comparator<Diamond> {

	@Override
	public int compare(Diamond d1, Diamond d2) {
		if(d1.getClarity().getRank() < d2.getClarity().getRank()) return -1;
		if(d1.getClarity().getRank() > d2.getClarity().getRank()) return 1;
		return 0;
	}

}

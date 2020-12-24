package com.dmurphy;

public enum Clarity {
	VVS(1),
	VS(2),
	SI(3);
	
	Clarity(int rank) {
		this.rank = rank;
	}
	
	private int rank;

	public int getRank() {
		return rank;
	}
	
	public static Clarity getClarityByRank(int rank) {
		for(Clarity clarity: Clarity.values()) {
			if(rank == clarity.rank) {
				return clarity;
			}
		}
		return null;
	}
}

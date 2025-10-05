package com.hdfc.core;

public enum AccountType {
	SAVING,CURRENT;
	
	@Override
	public String toString() {
		return name();
	}

}


package com.sms.constant;

public enum Coursefield {
	CORE_JAVA(45, 120), DBT(50,80), PYTHON(60, 70), MERN(60, 60), WEB_JAVA(60, 60), DEV_OPS(60, 60);

	private int minMarks;

	private int maxCapacity;

	private Coursefield(int minMarks, int maxCapacity) {
		this.minMarks = minMarks;
		this.maxCapacity = maxCapacity;
	}

	public int getMinMarks() {
		return minMarks;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}


	public void setMinMarks(int minMarks) {
		this.minMarks = minMarks;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
	}


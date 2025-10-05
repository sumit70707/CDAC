package com.cms.core;

public enum ServicePlan {
		SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private int planCost;
	
	private ServicePlan(int cost) {
		this.planCost=cost;
	}
	
	public int getPlanCost() {
		return this.planCost;
	}
	
	public void setPlanCost(int cost) {
		this.planCost=cost;
	}
	
	@Override
	public String toString() {
		return name()+" Cost "+this.planCost;
	}
	

}

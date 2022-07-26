package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Response {

	private String customerName;
	private String month;

	private double rewardPoints;

	private double totalSpent;

	public Response() {

	}
	public Response(String customerName, String month, double rewardpoints, double totalSpent) {
		this.customerName = customerName;
		this.month = month;
		this.rewardPoints = rewardpoints;
		this.totalSpent = totalSpent;
	}

	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getRewardpoints() {
		return rewardPoints;
	}

	public void setRewardpoints(double rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public double getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(double totalSpent) {
		this.totalSpent = totalSpent;
	}

}

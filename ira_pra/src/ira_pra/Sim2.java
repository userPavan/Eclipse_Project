package ira_pra;

public class Sim2 {
	
	private int SimId;
	private String CustomerName;
	private double balance;
	private double ratePerSecond;
	private String circle;
	
	public Sim2(int simId, String customerName, double balance, double ratePerSecond, String circle) {
		super();
		SimId = simId;
		CustomerName = customerName;
		this.balance = balance;
		this.ratePerSecond = ratePerSecond;
		this.circle = circle;
	}

	public int getSimId() {
		return SimId;
	}

	public void setSimId(int simId) {
		SimId = simId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRatePerSecond() {
		return ratePerSecond;
	}

	public void setRatePerSecond(double ratePerSecond) {
		this.ratePerSecond = ratePerSecond;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}
}

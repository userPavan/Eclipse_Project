package ira_pra;

public class TravelAgency {
	
	private int regNo;
	private String agencyName;
	private String pakageType;
	private int price;
	private boolean flightFacility;
	
	public TravelAgency(int regNo, String agencyName, String pakageType, int price, boolean flightFacility) {
		super();
		this.regNo = regNo;
		this.agencyName = agencyName;
		this.pakageType = pakageType;
		this.price = price;
		this.flightFacility = flightFacility;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getPakageType() {
		return pakageType;
	}

	public void setPakageType(String pakageType) {
		this.pakageType = pakageType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isFlightFacility() {
		return flightFacility;
	}

	public void setFlightFacility(boolean flightFacility) {
		this.flightFacility = flightFacility;
	}

	
}

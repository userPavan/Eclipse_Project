package ira_pra;

public class AutonomusCar {

	private int carId;
	private String brand;
	private int noOFTestConducted;
	private  int noOfTestPassed;
	private String environment;
	private String grade;
	
	public AutonomusCar(int carId, String brand, int noOFTestConducted, int noOfTestPassed, String environment) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.noOFTestConducted = noOFTestConducted;
		this.noOfTestPassed = noOfTestPassed;
		this.environment = environment;
		//this.grade = grade;
	}


	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNoOFTestConducted() {
		return noOFTestConducted;
	}

	public void setNoOFTestConducted(int noOFTestConducted) {
		this.noOFTestConducted = noOFTestConducted;
	}

	public int getNoOfTestPassed() {
		return noOfTestPassed;
	}

	public void setNoOfTestPassed(int noOfTestPassed) {
		this.noOfTestPassed = noOfTestPassed;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String string) {
		this.grade = string;
	}
	
	

}

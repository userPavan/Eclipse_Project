package ira_pra;

public class Institution {

	
	private int institutionId;
	private String inistitutionName;
	private int noOfStudentsPlaced;
	private int noOfStudentsCleared;
	private String location;
	private String grade;
	
	public Institution(int institutionId, String inistitutionName, int noOfStudentsPlaced, int noOfStudentsCleared,
			String location) {
		super();
		this.institutionId = institutionId;
		this.inistitutionName = inistitutionName;
		this.noOfStudentsPlaced = noOfStudentsPlaced;
		this.noOfStudentsCleared = noOfStudentsCleared;
		this.location = location;
		//this.grade = grade;
	}

	public int getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}

	public String getInistitutionName() {
		return inistitutionName;
	}

	public void setInistitutionName(String inistitutionName) {
		this.inistitutionName = inistitutionName;
	}

	public int getNoOfStudentsPlaced() {
		return noOfStudentsPlaced;
	}

	public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
		this.noOfStudentsPlaced = noOfStudentsPlaced;
	}

	public int getNoOfStudentsCleared() {
		return noOfStudentsCleared;
	}

	public void setNoOfStudentsCleared(int noOfStudentsCleared) {
		this.noOfStudentsCleared = noOfStudentsCleared;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	

}


public class Salary {
	private String salaryNum;
	private int basicMoney;
	private int nightClock;
	private int familyNum;
	private char nameCode;
	private char hoCode;
	
//	public Salary() {}
	
	public Salary(String salaryNum, int basicMoney, int nightClock, int familyNum) {
		this.salaryNum = salaryNum;
		this.basicMoney = basicMoney;
		this.nightClock = nightClock;
		this.familyNum = familyNum;
	}

	public String getSalaryNum() {
		return salaryNum;
	}
	public void setSalaryNum(String salaryNum) {
		this.salaryNum = salaryNum;
	}
	public int getBasicMoney() {
		return basicMoney;
	}
	public void setBasicMoney(int basicMoney) {
		this.basicMoney = basicMoney;
	}
	public int getNightClock() {
		return nightClock;
	}
	public void setNightClock(int nightClock) {
		this.nightClock = nightClock;
	}
	public int getFamilyNum() {
		return familyNum;
	}
	public void setFamilyNum(int familyNum) {
		this.familyNum = familyNum;
	}
	
	public char nameCode(String salaryNum) {
		char ch = salaryNum.charAt(0);
		return ch;
	}
	public char hoCode(String salaryNum) {
		char ch = salaryNum.charAt(1);
		return ch;
	}
	
}

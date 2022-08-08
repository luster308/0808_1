
public class Salary {
	private String salaryNum;
	private int basicMoney;
	private int nightClock;
	private int familyNum;
	private char nameCode;
	private char hoCode;
	private String buname;
	
	public String getBuname() {
		return buname;
	}

	public void setBuname(String buname) {
		this.buname = buname;
	}
	private int fiHoMoney;
	private int fiFaMoney;
	private int faNightMoney;
	private int fiTotMoney;
	private double fiRealMoney;
	
//	public Salary() {}
	
	public int getFiHoMoney() {
		return fiHoMoney;
	}

	public void setFiHoMoney(int fiHoMoney) {
		this.fiHoMoney = fiHoMoney;
	}

	public int getFiFaMoney() {
		return fiFaMoney;
	}

	public void setFiFaMoney(int fiFaMoney) {
		this.fiFaMoney = fiFaMoney;
	}

	public int getFaNightMoney() {
		return faNightMoney;
	}

	public void setFaNightMoney(int faNightMoney) {
		this.faNightMoney = faNightMoney;
	}

	public int getFiTotMoney() {
		return fiTotMoney;
	}

	public void setFiTotMoney(int fiTotMoney) {
		this.fiTotMoney = fiTotMoney;
	}

	public double getFiRealMoney() {
		return fiRealMoney;
	}

	public void setFiRealMoney(double fiRealMoney) {
		this.fiRealMoney = fiRealMoney;
	}

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

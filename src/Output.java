
public class Output {
	private Salary[] array;
	private String[] name = {"조성모", "이미자", "설운도"};
	public Output(Salary [] array) {
		this.array = array;
	}
	
	public void output() {
		this.printLabel();
	}
	

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	private void printLabel() {
		System.out.println("사원번호\t사원이름\t부서명\t기본급\t호급수당\t가족수당\t야간수당\t총금액\t실수령액");
		for(int i=0;i<3;i++) {
			Salary salary = this.array[i];
			System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
					salary.getSalaryNum(), name[i], salary.getBuname(), salary.getBasicMoney(),
					salary.getFiHoMoney(), salary.getFiFaMoney(), salary.getFaNightMoney(),
					salary.getFiTotMoney(), (int)salary.getFiRealMoney());
		}
	}
}

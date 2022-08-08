import java.util.Scanner;

public class Input {
	private Salary[] array;
	private Scanner sc;

	public Input(Salary[] array) {
		this.array = array;
		this.sc = new Scanner(System.in);
	}

	public void input() {
		String[] salaryNum = new String[3];
		for (int i = 0; i < array.length; i++) {
			System.out.print("사원번호 :");
			salaryNum[0] = this.sc.nextLine();
			salaryNum[1] = this.sc.nextLine();
			salaryNum[2] = this.sc.nextLine();
			System.out.print("기본급 :");
			int basicMoney = this.sc.nextInt();
			System.out.print("야간시간 :");
			int nightClock = this.sc.nextInt();
			System.out.print("가족수 :");
			int familyNum = this.sc.nextInt();
			this.sc.nextLine();
		}
	}
}

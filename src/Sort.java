
public class Sort {
	private int sortingNum(String salaryNum) {
		char ch = salaryNum.charAt(0);
		return ch;
	}
	private int sortingNum1(String salaryNum) {
		char ch = salaryNum.charAt(1);
		return ch;
	}
	private int sortingNum2(String salaryNum) {
		char ch = salaryNum.charAt(2);
		return ch;
	}
	private int sortingNum3(String salaryNum) {
		char ch = salaryNum.charAt(3);
		return ch;
	}
	
	void bubbleSorting(Salary[] array) {
//		int [] temp = new int[array.length];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
//				if (array[j].getSalaryNum() > array[j + 1].getSalaryNum()) {
					Salary temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}


public class Calc {
	private Salary[] array;
	
	public Calc(Salary[] array) {
		this.array = array;
	}
	
	public void calc() {
		Salary salary = this.array[3];
		for (int i = 0; i < array.length; i++) {
			
			String buName = this.buName(salary.hoCode(salary.getSalaryNum()));
			System.out.println(buName);
		}
			
		
	}
	
	private int hoMoney(char ch) {
		int[] homoney = new int[7];
		switch (ch) {
		case 1: homoney[0] = 900000;return homoney[0]; 
		case 2: homoney[1] = 400000;return homoney[1]; 
		case 3: homoney[2] = 600000;return homoney[2]; 
		case 4: homoney[3] = 800000;return homoney[3]; 
		case 5: homoney[4] = 300000;return homoney[4]; 
		case 6: homoney[5] = 800000;return homoney[5]; 
		case 7: homoney[6] = 800000;return homoney[6]; 
		}     
		return 0;
	}                                  
	private int faMoney(int init) {
		int famoney = 0;
		famoney = init*7000;
		return famoney;
	}
	private int niMoney(int init) {
		int nimoney = 0;
		switch (init) {
		case 1: return nimoney =1500;  
		case 2: return nimoney =2500;  
		case 3: return nimoney =3500;  
		case 4: return nimoney =4500;  
		}
		return 0;
	}
	private int totMoney(int homoney, int basicmoney, int nimoney, int famoney) {
		return homoney + basicmoney + nimoney + famoney;
	}
	private double realMoney(int totmoney, int homoney) {

		return totmoney - (homoney*0.1);
	}
//	private char nameCode(String salaryNum) {
//		char ch = salaryNum.charAt(0);
//		return ch;
//	}
//	private char hoCode(String salaryNum) {
//		char ch = salaryNum.charAt(1);
//		return ch;
//	}
	private String buName(char ch) {
		switch (ch) {
		case 'A': return "영업부";
		case 'B': return "업무부";
		case 'C': return "홍보부";
		case 'D': return "인사부";
		case 'E': return "경리부";
		case 'F': return "판촉부";
		case 'G': return "총무부";
		}
		return "0";
	}
}

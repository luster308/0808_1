
public class Calc {
	private Salary[] array;
	
	public Calc(Salary[] array) {
		this.array = array;
	}
	
	public void calc() {
//		Salary salary = this.array[3];
		for (int i = 0; i < array.length; i++) {
			Salary salary = this.array[i];
			
			String buName = this.buName(salary.nameCode(salary.getSalaryNum()));
			int hoMoney = this.hoMoney(salary.hoCode(salary.getSalaryNum()));
			int faMoney = this.faMoney(salary.getFamilyNum());
			int nightMoney = this.niMoney(salary.getNightClock());
			int totMoney = this.totMoney(hoMoney, basicNum(salary.getBasicMoney()), nightMoney, faMoney);
			double realMoney = this.realMoney(totMoney, hoMoney);
			
			salary.setFiHoMoney(hoMoney);
			salary.setFiFaMoney(faMoney);
			salary.setFaNightMoney(nightMoney);
			salary.setFiTotMoney(totMoney);
			salary.setFiRealMoney(realMoney);
			
//			System.out.printf("%d %d %d %d %d", hoMoney,faMoney,nightMoney,totMoney,(int)realMoney);
			
			
			
		}
			
		
	}
	
	private int hoMoney(char ch) {
		int[] homoney = new int[7];
		int num = 0;
//		System.out.println(ch);
		switch (ch) {
		case '1': homoney[0] = 900000; num = homoney[0];break; 
		case '2': homoney[1] = 400000; num = homoney[1];break; 
		case '3': homoney[2] = 600000; num = homoney[2];break; 
		case '4': homoney[3] = 800000; num = homoney[3];break; 
		case '5': homoney[4] = 300000; num = homoney[4];break; 
		case '6': homoney[5] = 800000; num = homoney[5];break; 
		case '7': homoney[6] = 800000; num = homoney[6];break; 
		}     
		return num;
	}                                  
	private int faMoney(int init) {
		int famoney = 0;
		famoney = init*7000;
		return famoney;
	}
	private int niMoney(int init) {
		int nimoney = 0;
		int num = 0;
		switch (init) {
		case 1: nimoney = 1500;num = nimoney; break; 
		case 2: nimoney = 2500;num = nimoney; break;  
		case 3: nimoney = 3500;num = nimoney; break;  
		case 4: nimoney = 4500;num = nimoney; break;  
		}
		return num;
	}
	private int totMoney(int homoney, int basicmoney, int nimoney, int famoney) {
		return homoney + basicmoney + nimoney + famoney;
	}
	private double realMoney(int totmoney, int homoney) {

		return totmoney - (homoney*0.1);
	}

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
	
	private int basicNum(int bnum) {
		int num = 0;
		switch (bnum) {
		case 1: num = 15000; break;
		case 2: num = 25000; break;
		case 3: num = 35000; break;
		case 4: num = 45000; break;
		}
		return num;
	}
}


package defnew;


public class Outputclass2{
	
	
	public void printError(int errorCode) {
		if (errorCode == Forvalue.ERR_USD) {
			System.out.print("달러 ");
		} else if (errorCode == Forvalue.ERR_EUR) {
			System.out.print("유로 ");
		} else if (errorCode == Forvalue.ERR_JPY) {
			System.out.print("앤화 ");
		}
		System.out.println("보유 잔액이 부족합니다.");
	}

	public void outputUsd(int[] unit_dollar, int realdollar) {	
			System.out.println("달러로 환전 결과:" + realdollar + "달러");
			for (int j = 0; j < unit_dollar.length; j++) {
				int cnt = realdollar / unit_dollar[j];
				System.out.println(unit_dollar[j] + "달러" + cnt + "장");
				realdollar = realdollar - unit_dollar[j] * cnt;
			}		
	}
	public void outputEuro(int[] unit_euro, int realeuro) {
		System.out.println("유로로 환전 결과:" + realeuro + "유로");
		for (int j = 0; j < unit_euro.length; j++) {
			int cnt = realeuro / unit_euro[j];
			System.out.println(unit_euro[j] + "유로" + cnt + "장");
			realeuro = realeuro - unit_euro[j] * cnt;
		}
	}

	public void outputYen(int[] unit_yen, int realyen) {
		System.out.println("엔화로 환전 결과:" + realyen + "엔화");
		for (int j = 0; j < unit_yen.length; j++) {
			int cnt = realyen / unit_yen[j];
			System.out.println(unit_yen[j] + "엔" + cnt + "장");
			realyen = realyen - unit_yen[j] * cnt;
		}
		
	}

	
	public void outputWon(int[] unit_won, int returnmoney) {
		System.out.println("거스름돈:" + returnmoney + "원");
		for (int j = 0; j < unit_won.length; j++) {
			int cnt = returnmoney / unit_won[j];
			System.out.println(unit_won[j] + "원" + cnt + "장");
			returnmoney = returnmoney - unit_won[j] * cnt;
		}
	}
	
}

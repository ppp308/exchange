package defnew;

public class Runexchange2 {
	Outputclass output = new Outputclass();

	private boolean checkUSD(int checkmoney) {
		if (checkmoney <= Forvalue.BALANCE_USD) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkEUR(int checkmoney) {
		if (checkmoney <= Forvalue.BALANCE_EUR) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkYEN(int checkmoney) {
		if (checkmoney <= Forvalue.BALANCE_JPY) {
			return true;
		} else {
			return false;
		}
	}

	int returndoll(int won) {
		double dollar = won / Forvalue.USD_EXCHANGE;
		int realdollar = (int) dollar;
		int returnmoney = (int) ((dollar - realdollar) * Forvalue.USD_EXCHANGE / 100) * 100;
		return returnmoney;
	}

	int returneuro(int won) {
		double euro = won / Forvalue.EURO_EXCHANGE;
		int realeuro = (int) euro;
		int returnmoney = (int) ((euro - realeuro) * Forvalue.EURO_EXCHANGE / 100) * 100;
		return returnmoney;
	}

	int returnyen(int won) {
		double yen = won / Forvalue.YEN_EXCHANGE;
		int realyen = (int) yen;
		int returnmoney = (int) ((yen - realyen) * Forvalue.YEN_EXCHANGE / 100) * 100;
		return returnmoney;
	}
	
	int remainusd (int realdollar) {
		Forvalue.BALANCE_USD = (int) (Forvalue.BALANCE_USD - realdollar);
		int remain =Forvalue.BALANCE_USD;
		return remain ;
	}
	int remaineuro (int realeuro) {
		Forvalue.BALANCE_EUR = (int) (Forvalue.BALANCE_EUR - realeuro);
		int remain =Forvalue.BALANCE_EUR;
		return remain ;
	}
	int remainyen (int realyen) {
		Forvalue.BALANCE_JPY = (int) (Forvalue.BALANCE_JPY - realyen);
		int remain =Forvalue.BALANCE_JPY;
		return remain ;
	}

	public int changeUSD(int won) {
		double dollar = won / Forvalue.USD_EXCHANGE;
		int realdollar = (int) dollar;

		if (checkUSD(realdollar)) {
			int returnmoney = (int) ((dollar - realdollar) * Forvalue.USD_EXCHANGE / 100) * 100;
			int[] unit_dollar = { 100, 50, 10, 5, 1 };
			int[] unit_won = { 10000, 5000, 1000, 500, 100, 10 };
			System.out.println("환율:" + Forvalue.USD_EXCHANGE);
			output.outputUsd(unit_dollar, realdollar);
			output.outputWon(unit_won, returnmoney);
			Forvalue.BALANCE_USD = (int) (Forvalue.BALANCE_USD - realdollar);
			System.out.println(Forvalue.BALANCE_USD);
			System.out.println("달러 보유 잔액:" + Forvalue.BALANCE_USD);
		} else {
			output.printError(1);
		}
		return realdollar;

	}

	public int changeEUR(int won) {
		double euro = won / Forvalue.EURO_EXCHANGE;
		int realeuro = (int) euro;
		if (checkEUR(realeuro)) {// 돈이 있는 지 없는 지 체크
			int returnmoney = (int) ((euro - realeuro) * Forvalue.EURO_EXCHANGE / 100) * 100;
			int[] unit_euro = { 200, 100, 50, 10, 5, 1 };
			int[] unit_won = { 10000, 5000, 1000, 500, 100, 10 };
			System.out.println("환율:" + Forvalue.EURO_EXCHANGE);
			output.outputUsd(unit_euro, realeuro);
			output.outputWon(unit_won, returnmoney);
			Forvalue.BALANCE_EUR = (int) (Forvalue.BALANCE_EUR - realeuro);
			System.out.println("유로 보유 잔액:" + Forvalue.BALANCE_EUR);
		} else {
			output.printError(2);
		}
		return realeuro;
	}
	
	
	
	public int changeYEN(int won) {
		double yen = won / Forvalue.YEN_EXCHANGE;
		int realyen = (int) yen;
		if (checkYEN(realyen)) {
			int returnmoney = (int) ((yen - realyen) * Forvalue.YEN_EXCHANGE / 100) * 100;
			int[] unit_yen = { 10000, 5000, 1000, 100, 10, 1 };
			int[] unit_won = { 10000, 5000, 1000, 500, 100, 10 };
			System.out.println("환율:" + Forvalue.YEN_EXCHANGE);
			output.outputUsd(unit_yen, realyen);
			output.outputWon(unit_won, returnmoney);
			Forvalue.BALANCE_JPY = (int) (Forvalue.BALANCE_JPY - realyen);
			System.out.println("앤화 보유 잔액:" + Forvalue.BALANCE_JPY);
		} else {
			output.printError(3);
		}
		return realyen;
	}

}

package defnew;


public class Outputclass2{
	
	
	public void printError(int errorCode) {
		if (errorCode == Forvalue.ERR_USD) {
			System.out.print("�޷� ");
		} else if (errorCode == Forvalue.ERR_EUR) {
			System.out.print("���� ");
		} else if (errorCode == Forvalue.ERR_JPY) {
			System.out.print("��ȭ ");
		}
		System.out.println("���� �ܾ��� �����մϴ�.");
	}

	public void outputUsd(int[] unit_dollar, int realdollar) {	
			System.out.println("�޷��� ȯ�� ���:" + realdollar + "�޷�");
			for (int j = 0; j < unit_dollar.length; j++) {
				int cnt = realdollar / unit_dollar[j];
				System.out.println(unit_dollar[j] + "�޷�" + cnt + "��");
				realdollar = realdollar - unit_dollar[j] * cnt;
			}		
	}
	public void outputEuro(int[] unit_euro, int realeuro) {
		System.out.println("���η� ȯ�� ���:" + realeuro + "����");
		for (int j = 0; j < unit_euro.length; j++) {
			int cnt = realeuro / unit_euro[j];
			System.out.println(unit_euro[j] + "����" + cnt + "��");
			realeuro = realeuro - unit_euro[j] * cnt;
		}
	}

	public void outputYen(int[] unit_yen, int realyen) {
		System.out.println("��ȭ�� ȯ�� ���:" + realyen + "��ȭ");
		for (int j = 0; j < unit_yen.length; j++) {
			int cnt = realyen / unit_yen[j];
			System.out.println(unit_yen[j] + "��" + cnt + "��");
			realyen = realyen - unit_yen[j] * cnt;
		}
		
	}

	
	public void outputWon(int[] unit_won, int returnmoney) {
		System.out.println("�Ž�����:" + returnmoney + "��");
		for (int j = 0; j < unit_won.length; j++) {
			int cnt = returnmoney / unit_won[j];
			System.out.println(unit_won[j] + "��" + cnt + "��");
			returnmoney = returnmoney - unit_won[j] * cnt;
		}
	}
	
}

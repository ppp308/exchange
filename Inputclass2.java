package defnew;
import java.util.Scanner;
public class Inputclass2 {
	
	Scanner a = new Scanner(System.in);
	
	public int inpuFormwon() {
		System.out.print("��ȭ �Է� ���:");
		int won = a.nextInt();	
		return won;
	}
	
	
	public int inpuFormchoose() {
		System.out.println("� ������ ȯ��?");
		System.out.println("(1:USD, 2:EUR, 3:JPY):");
		int choose = a.nextInt();
		return choose;
	}
	
}

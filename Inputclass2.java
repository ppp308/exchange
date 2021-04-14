package defnew;
import java.util.Scanner;
public class Inputclass2 {
	
	Scanner a = new Scanner(System.in);
	
	public int inpuFormwon() {
		System.out.print("원화 입력 결과:");
		int won = a.nextInt();	
		return won;
	}
	
	
	public int inpuFormchoose() {
		System.out.println("어떤 돈으로 환전?");
		System.out.println("(1:USD, 2:EUR, 3:JPY):");
		int choose = a.nextInt();
		return choose;
	}
	
}

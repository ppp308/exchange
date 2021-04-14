package defnew;

import java.io.IOException;

public class exchange2 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
	
		int choose = 0;
		int won = 0;
	
		Runexchange2 runclass1 = new Runexchange2();	
		Inputclass2 inputclass = new Inputclass2();
		filewriteclass2 fileclass = new filewriteclass2();
		do {
			won = inputclass.inpuFormwon();
			choose = inputclass.inpuFormchoose();
			if (choose == Forvalue.CHANGE_TYPE_USD) {
				fileclass.savedollarfile(won);
			} else if (choose == Forvalue.CHANGE_TYPE_EURO) {
				fileclass.saveeurfile(won);
			} else if (choose == Forvalue.CHANGE_TYPE_YEN) {
				fileclass.saveyenfile(won);
			} else {
				System.out.println("error");
			}
		} while (won > 0);
	}
}
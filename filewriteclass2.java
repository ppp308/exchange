package defnew;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class filewriteclass2 {

	Runexchange2 runclass1 = new Runexchange2();
	Inputclass2 inputclass = new Inputclass2();
	SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
	SimpleDateFormat format1 = new SimpleDateFormat("HHmm");
	Date time = new Date();
	String time1 = format.format(time);
	String time2 = format1.format(time);
	int remain = 0;
	static int count = 0;

	public static void fileWrite(String result) throws IOException {
		BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("C:\\Users\\kopo\\Desktop\\out.txt", true), "MS949"));
		if (count == 0) {
			writer.write("날짜,시간,환전요청금액,타입,환전결과,거스름돈,외화보유잔고\n");
			writer.flush();
			writer.write(result + "\r\n");
			writer.flush();
		} else {
			writer.write(result + "\r\n");
			writer.flush();
		}
		count++;
	}

	public void savedollarfile(int won) throws IOException {
		int exchagendmon = runclass1.changeUSD(won);
		String type = "USD";
		int exchagendmon1 = runclass1.returndoll(won);
		int remain1 = runclass1.remainusd(remain);
		String result = time1 + "," + time2 + "," + won + "," + type + "," + exchagendmon + "," + exchagendmon1 + ","
				+ remain1;
		filewriteclass2.fileWrite(result);
	}

	public void saveeurfile(int won) throws IOException {
		int exchagendmon = runclass1.changeEUR(won);
		String type = "EUR";
		int exchagendmon1 = runclass1.returneuro(won);
		int remain1 = runclass1.remaineuro(remain);
		String result = time1 + "," + time2 + "," + won + "," + type + "," + exchagendmon + "," + exchagendmon1 + ","
				+ remain1;
		filewriteclass2.fileWrite(result);
	}

	public void saveyenfile(int won) throws IOException {
		int exchagendmon = runclass1.changeYEN(won);
		String type = "YEN";
		int exchagendmon1 = runclass1.returnyen(won);
		int remain1 = runclass1.remainyen(remain);
		String result = time1 + "," + time2 + "," + won + "," + type + "," + exchagendmon + "," + exchagendmon1 + ","
				+ remain1;
		filewriteclass2.fileWrite(result);
	}
}

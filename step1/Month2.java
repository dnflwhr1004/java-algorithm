package step1;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Random;
public class Month2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String.format(" %s ", "안녕");
		String now = sim.format(date);
		String num = now.substring(6,7);
		System.out.println(num);
		
	
		/*
		int month = 0;
		String eval = "";
	
		switch(month) {
		case 1: eval = "1월"; break;
		case 2: eval = "2월"; break;
		case 3: eval = "3월"; break;
		case 4: eval = "4월"; break;
		case 5: eval = "5월"; break;
		case 6: eval = "6월"; break;
		case 7: eval = "7월"; break;
		case 8: eval = "8월"; break;
		case 9: eval = "9월"; break;
		case 10: eval = "10월"; break;
		case 11: eval = "11월"; break;
		case 12: eval = "12월"; break;
		default : eval = "값이없습니다."; break;
		}
		System.out.println(eval);
		*/
		
	}

}

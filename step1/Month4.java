package step1;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Month4 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String today = sdf.format(date);
		String temp = today.substring(6,7);
		int flag = Integer.parseInt(temp);
		String eval = "";
		switch(flag){
		case 1 : eval = "1월입니다."; break;
		case 2 : eval = "2월입니다."; break;
		case 3 : eval = "3월입니다."; break;
		case 4 : eval = "4월입니다."; break;
		case 5 : eval = "5월입니다."; break;
		case 6 : eval = "6월입니다."; break;
		case 7 : eval = "7월입니다."; break;
		case 8 : eval = "8월입니다."; break;
		case 9 : eval = "9월입니다."; break;
		case 10 : eval = "10월입니다."; break;
		case 11 : eval = "11월입니다."; break;
		case 12 : eval = "12월입니다."; break;
		default : eval = "다시입력해주세요."; break;
		}
		System.out.println(eval);
		
		}
	}

package homework01;
import java.util.Random;
import java.util.Scanner;
public class Rock {

	public static void main(String[] args) {
		/*
		 * 가위바위보에서 
		 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
		 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
		 * 2이면 바위를 낸 것이고
		 * 3이면 보를 낸 것으로 할 때,
		 * 사용자측이 가위, 바위, 보를 냈을 때
		 * 승패를 결정하는 프로그램을 작성하시오
		 */
		
		Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("유저가 낸 가위바위보");
        String user = "";
        int com = 0;
        user = scan.next();
        com = ran.nextInt(3)+1;
        
        switch(com) {
        case 1 : if(user.equals("가위")){
        	System.out.println("컴퓨터가 가위를 냈습니다.");
        	System.out.println("비겼습니다.");break;
        }else if(user.equals("바위")){
        	System.out.println("컴퓨터가 가위를 냈습니다.");
        	System.out.println("유저가 이겼습니다.");break;
        }else{
        	System.out.println("컴퓨터가 가위를 냈습니다.");
        	System.out.println("유저가 졌습니다.");break;
        }
        case 2 : if(user.equals("가위")){
        	System.out.println("컴퓨터가 바위를 냈습니다.");
        	System.out.println("유저가 졌습니다.");break;
        }else if(user.equals("바위")){
        	System.out.println("컴퓨터가 바위를 냈습니다.");
        	System.out.println("비겼습니다.");break;
        }else{
        	System.out.println("컴퓨터가 바위를 냈습니다.");
        	System.out.println("유저가 이겼습니다.");break;
        }
        case 3 : if(user.equals("가위")){
        	System.out.println("컴퓨터가 보를 냈습니다.");
        	System.out.println("유저가 이겼습니다.");break;
        	
        }else if(user.equals("바위")){
        	System.out.println("컴퓨터가 보를 냈습니다.");
        	System.out.println("유저가 졌습니다.");break;
        }else if(user.equals("보")){
        	System.out.println("비겼습니다.");break;
        }
    }
        	System.out.println("게임종료");
	}

}
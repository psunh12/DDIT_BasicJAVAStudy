package ddit.chap08.sec01;

import java.io.IOException;

public class SchedularExample {

	public static void main(String[] args) { //throws IOException{//throws:던지다, 미루다-예외를 강제로 발생함,input output 나타냄
		System.out.println("전화상담의 분배방식 선택");
		System.out.println("R : RoundRobin");
		System.out.println("L : LeastJob");
		System.out.println("P : PriorityAllocation");
		System.out.print("선택>>");
		char c = ' ';
		
		
		
		try {//강요된 예외처리 된??????뭔?????
			c = (char)System.in.read();//원래 int인데 강제 형변환함.
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		Schedular schedular=null;//객체화 될수 없다.인터페이스는 객체화 불가능 ~ 그냥 변수만 만든거임.

		
		if(c =='R'||c=='r') {
			schedular = new RoundRobin();//대입하는 방식으로 업캐스트
		}else if(c =='L'||c=='l') {
			schedular = new LeastJob();
		}else if(c =='P'||c=='p') {
			schedular = new PriorityAllocation();
		}else {
			System.out.println("작업선택오류");
			System.exit(0);
		}
		schedular.getNextCall();
		schedular.sendCallToAgent();
	}

}

package ddit.chap08.sec01;

public class RoundRobin implements Schedular {

	@Override
	public void getNextCall() {//상담전화를 대기순서대로 가지고 옵니다
		System.out.println("상담전화를 대기열에서 차례대로 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("차례대로 다음 상담원에게 상담전화를 분배");
	}

}

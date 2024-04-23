package ddit.chap08.sec01;

public class PriorityAllocation implements Schedular {
	
	@Override
	public void getNextCall() {
		System.out.println("우선순쉬가 높은 상담전화를 대기열에서 차례대로 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill이 가장 우수한 상담원에게 대기열의 첫번째 상담전화를 분배");
	}

}
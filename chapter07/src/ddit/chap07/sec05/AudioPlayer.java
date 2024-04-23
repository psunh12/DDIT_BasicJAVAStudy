package ddit.chap07.sec05;

public abstract class AudioPlayer extends Player{//생성자 메서드 없으면 빨간줄, 있어도 없어지지않는데 아직 선언하지 않아서 그렇다?
	
	AudioPlayer(String mediaKind, int runningTime){//추상클래스
		super(mediaKind, runningTime);
	}

	@Override
	void play(int pos) {
		if(pos>=runningTime) {
			System.out.println("재생이 종료되었습니다");
		}else {
			System.out.println(pos+"분 위치부터 재생합니다..");
		}
	}

}


class Gomplayer extends AudioPlayer{

	Gomplayer(String mediaKind, int runningTime) {
		super(mediaKind, runningTime);//오버라이드 되지않은거 있으면 오류남
	}

	@Override
	void stop() {
		
	}
	

}



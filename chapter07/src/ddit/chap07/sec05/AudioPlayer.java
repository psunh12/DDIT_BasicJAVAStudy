package ddit.chap07.sec05;

public abstract class AudioPlayer extends Player{//������ �޼��� ������ ������, �־ ���������ʴµ� ���� �������� �ʾƼ� �׷���?
	
	AudioPlayer(String mediaKind, int runningTime){//�߻�Ŭ����
		super(mediaKind, runningTime);
	}

	@Override
	void play(int pos) {
		if(pos>=runningTime) {
			System.out.println("����� ����Ǿ����ϴ�");
		}else {
			System.out.println(pos+"�� ��ġ���� ����մϴ�..");
		}
	}

}


class Gomplayer extends AudioPlayer{

	Gomplayer(String mediaKind, int runningTime) {
		super(mediaKind, runningTime);//�������̵� ���������� ������ ������
	}

	@Override
	void stop() {
		
	}
	

}



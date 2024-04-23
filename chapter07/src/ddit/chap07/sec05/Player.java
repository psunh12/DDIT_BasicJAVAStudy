package ddit.chap07.sec05;

public abstract class Player {
	String mediaKind;
	int runningTime;

	Player(String mediaKind,int runningTime){
		this.mediaKind=mediaKind;
		this.runningTime=runningTime;
	}

	//�߻�޼��� �ΰ� ����
	abstract void play(int pos);
	abstract void stop();

	@Override
	public String toString() {
		return "�����ü : "+mediaKind+"\n�� ����ð� : "+runningTime;

	}
}
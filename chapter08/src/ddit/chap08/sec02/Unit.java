package ddit.chap08.sec02;

public class Unit {
	int hitPoint;
	final int MAX_HP;

	Unit(int hp) {
		MAX_HP = hp;// ������ �ƴ� ���
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);// �θ�Ŭ������
	}

}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);// �θ�Ŭ������
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;

	}

	@Override
	public String toString() {
		return "��ũ";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(50);
		hitPoint = MAX_HP;

	}

	@Override
	public String toString() {
		return "�غ�";
	}
}

class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(250);
		hitPoint = MAX_HP;

	}

	@Override
	public String toString() {
		return "���ۼ�";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(70);
		hitPoint = MAX_HP;

	}

	@Override
	public String toString() {
		return "��������";
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u+"������ ����Ǿ����ϴ�.");//tostring ��������
		}
	}
}
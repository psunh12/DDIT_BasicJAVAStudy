package ddit.chap08.sec02;

public class Unit {
	int hitPoint;
	final int MAX_HP;

	Unit(int hp) {
		MAX_HP = hp;// 변수가 아닌 상수
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);// 부모클래스꺼
	}

}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);// 부모클래스꺼
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;

	}

	@Override
	public String toString() {
		return "탱크";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(50);
		hitPoint = MAX_HP;

	}

	@Override
	public String toString() {
		return "해병";
	}
}

class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(250);
		hitPoint = MAX_HP;

	}

	@Override
	public String toString() {
		return "수송선";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(70);
		hitPoint = MAX_HP;

	}

	@Override
	public String toString() {
		return "수리공장";
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u+"수리가 종료되었습니다.");//tostring 생략가능
		}
	}
}
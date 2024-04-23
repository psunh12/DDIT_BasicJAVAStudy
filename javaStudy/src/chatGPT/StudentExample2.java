package chatGPT;

public class StudentExample2 {

	public static void main(String[] args) {
		Student2 s1=new Student2 ("앨리스",12345);
		s1.addSubjectScore(0, 80);
		s1.addSubjectScore(1, 86);
		s1.addSubjectScore(2, 90);
		s1.calculateAverage();
		
		System.out.println(s1.StudentInfo());
		
		Student2 s2=new Student2 ("마이콜",67890);
		s2.addSubjectScore(0, 70);
		s2.addSubjectScore(1, 82);
		s2.addSubjectScore(2, 80);
		s2.calculateAverage();
		
		System.out.println(s2.StudentInfo());		
		
	}

}


class Student2{
	String name;
	int studID;
	int[] subjects;
	double avg;
	
	Student2(String name, int studID){
		this.name=name;
		this.studID=studID;
		this.subjects =new int[5];
		this.avg=0;
		
	}
	
	public void addSubjectScore(int index, int score) {
		if(index >=0 && index<subjects.length) {
			subjects[index]=score;
		}
	}
	
	public void calculateAverage() {
		int sum=0;
		int count=0;
		
		for(int score :subjects) {
			if(score>0) {
				sum+=score;
				count++;
			}
		}
		
		if(count>0) {
			avg = (double)sum/count;
		}
	}
	
	String StudentInfo() {
		return "이름: "+name+"\n학번: "+studID+"\n평균: "+avg;
	}
}
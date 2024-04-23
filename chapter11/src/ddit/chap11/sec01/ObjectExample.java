package ddit.chap11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
//		int[] num= {10,20,30,40,50};
//		
//		int[] tar=num;
//		int[] res=num.clone();
//		
//		System.out.println("num="+num);//복사된건지 아닌지 확인
//		System.out.println("tar="+tar);//num과 같은주소를 갖고있음
//		System.out.println("res="+res);
		
		Book b1 = new Book("문과생의 과학공부",15000);
		Book b2=(Book)b1.clone();
		
		System.out.println(b1.bookTitle);
		
		
		//if(b1.bookTitle.equals(b2.bookTitle))과 같음. 아래는 줄여서 썼다.
		//b1.bookTitle 까지가 문자열.
		if(b1.equals(b2)) {
			System.out.println("같은 책입니다.");
		}else {
			System.out.println("다른책입니다");
		}
		System.out.println("b1의 주소="+b1.hashCode());//10진수 표현
		String strAddr=Integer.toHexString(b1.hashCode());//16진수로 전환
		System.out.println("16진수 주소="+strAddr);
		
		 z
		//절대주소
		//
//		System.out.println("b1 : "+b1);
//		System.out.println("b2 : "+b2);//같은값이지만 다른 주소값에 저장되어있음.clone 메서드를 통해!
	}
	
	//객체복사에 사용
	// 복사할 객체생성시 Cloneable interface를 implements해야하며
	// public Object clone() 메서드를 override해야함
	
	
	public static void cloneMethod() {
		
	}
}


//복사대상이 되는 클래스
class Book implements Cloneable{
	String bookTitle;
	int price;

	Book(String bookTitle,int price){
		this.bookTitle=bookTitle;
		this.price=price;
	}

	@Override
	public Object clone() {
		Object obj =null;
		try {
			obj=super.clone();
		}catch(Exception e) {}//Exception만 써도 됨
			return obj;
		}

//	@Override
//	public String toString() {
//		return "제목:"+bookTitle+"\n가격 : "+price;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book b=(Book)obj;//다운캐스트
			if(bookTitle.equals(b.bookTitle)) return true;//업캐스트 되었을때는 필드를 사용할 수 없다
		}
		return false;
		
	}
	@Override
	public int hashCode() {
		return price+hashCode();
	}


}

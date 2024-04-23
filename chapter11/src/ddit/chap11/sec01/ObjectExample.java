package ddit.chap11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
//		int[] num= {10,20,30,40,50};
//		
//		int[] tar=num;
//		int[] res=num.clone();
//		
//		System.out.println("num="+num);//����Ȱ��� �ƴ��� Ȯ��
//		System.out.println("tar="+tar);//num�� �����ּҸ� ��������
//		System.out.println("res="+res);
		
		Book b1 = new Book("�������� ���а���",15000);
		Book b2=(Book)b1.clone();
		
		System.out.println(b1.bookTitle);
		
		
		//if(b1.bookTitle.equals(b2.bookTitle))�� ����. �Ʒ��� �ٿ��� ���.
		//b1.bookTitle ������ ���ڿ�.
		if(b1.equals(b2)) {
			System.out.println("���� å�Դϴ�.");
		}else {
			System.out.println("�ٸ�å�Դϴ�");
		}
		System.out.println("b1�� �ּ�="+b1.hashCode());//10���� ǥ��
		String strAddr=Integer.toHexString(b1.hashCode());//16������ ��ȯ
		System.out.println("16���� �ּ�="+strAddr);
		
		 z
		//�����ּ�
		//
//		System.out.println("b1 : "+b1);
//		System.out.println("b2 : "+b2);//������������ �ٸ� �ּҰ��� ����Ǿ�����.clone �޼��带 ����!
	}
	
	//��ü���翡 ���
	// ������ ��ü������ Cloneable interface�� implements�ؾ��ϸ�
	// public Object clone() �޼��带 override�ؾ���
	
	
	public static void cloneMethod() {
		
	}
}


//�������� �Ǵ� Ŭ����
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
		}catch(Exception e) {}//Exception�� �ᵵ ��
			return obj;
		}

//	@Override
//	public String toString() {
//		return "����:"+bookTitle+"\n���� : "+price;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book b=(Book)obj;//�ٿ�ĳ��Ʈ
			if(bookTitle.equals(b.bookTitle)) return true;//��ĳ��Ʈ �Ǿ������� �ʵ带 ����� �� ����
		}
		return false;
		
	}
	@Override
	public int hashCode() {
		return price+hashCode();
	}


}

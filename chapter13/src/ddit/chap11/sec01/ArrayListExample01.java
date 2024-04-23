package ddit.chap11.sec01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//ArrayList - 1차원배열 구조
//			- 중복을 허락하고 순서화 제공(index를 사용하여 자료 구별)
//			- List 타입의 컬렉션
//  주요메서드
// . add(데이터) : ArrayList에 데이터 삽입
// 	 clear() : ArrayList에 존재하는 모든 데이터 삭제
//	 contains(Obiect obj) : ArrayList에 저장된 데이터에 'obj'가 있는지 판단. 있으면 true 없으면 false 반환.
//	  						있으면 true 없으면 false 반환
//	  get(int idx) : 'idx'번째 자료 반환
//	  iterator() : 반복자로 객체(또는 배열)에 저장된 자료를 맨 처음부터 맨 마지막까지 순차적으로 검색



public class ArrayListExample01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		System.out.println("저장된 자료 수:"+list1.size());
		
//		list1.add("홍길동");
//		list1.add(100);
		
//		for(int i=1;i<=16;i++) {
//			list1.add(i*1000);	
//		}
//		System.out.println(list1);
//		
//		System.out.println(list1.contains("홍길동"));
		
		list1.add(new Product("볼펜",1500));
		list1.add(new Product("매직키보드",90000));
//		list1.add("홍길동");
		
		System.out.println(list1);//리스트에 저장.
		System.out.println("저장된 자료 수:"+list1.size());
		
		
		for(int i=0; i<list1.size();i++) {
			Product p1 =(Product)list1.get(i);//반환타입이 오브젝트? 업캐스트로 들어가서 오류남. 쓰려면 다운캐스트 해야함
			System.out.println("제품가격 : "+p1.price);
		}
	//제네릭:해당되는 객체에 대해 입력타입 제한한다. 한종류의 데이터만 저장.
		List<Product> list2=new ArrayList<Product>();//List에는 produst가 아니면 안된다
		list2.add(new Product("볼펜",1500));
		list2.add(new Product("매직키보드",90000));
		list2.add(new Product("지우개",500));
		list2.add(new Product("마우스",25000));
		list2.add(new Product("USB허브",55000));
//		list2.add("홍길동");//오류남! :product type이 아니기 때문에 쓸수조차 없다		
		for(int i=0; i<list2.size();i++) {
			Product p2 =(Product)list2.get(i);//cast 연산자 생략
			System.out.println("제품가격 : "+p2.pName);
		}		
	//반복자를 이용한 검색
	//	<사용형식>
	//	Iterator <객체명> 변수 = 대상객체명.iterator(); <>:제네릭
	//	  hasNext() : 읽어올 자료가 있으면 true, 자료가 없으면 false 반환
	//	  next() : 현재 자료를 읽어옴	
		
		Iterator <Product> iter=list2.iterator();
		while(iter.hasNext()) {
			Product p = iter.next();
			System.out.println(p);
		}
		
	}

}


class Product{
	String pName;
	int price;

	Product(String pName, int price){
		this.pName=pName;
		this.price=price;
	}
	@Override
	public String toString() {
		return "제품명:"+pName+" => "+price+"원";
	}
}

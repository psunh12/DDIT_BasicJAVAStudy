package ddit.chap11.sec01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//ArrayList - 1�����迭 ����
//			- �ߺ��� ����ϰ� ����ȭ ����(index�� ����Ͽ� �ڷ� ����)
//			- List Ÿ���� �÷���
//  �ֿ�޼���
// . add(������) : ArrayList�� ������ ����
// 	 clear() : ArrayList�� �����ϴ� ��� ������ ����
//	 contains(Obiect obj) : ArrayList�� ����� �����Ϳ� 'obj'�� �ִ��� �Ǵ�. ������ true ������ false ��ȯ.
//	  						������ true ������ false ��ȯ
//	  get(int idx) : 'idx'��° �ڷ� ��ȯ
//	  iterator() : �ݺ��ڷ� ��ü(�Ǵ� �迭)�� ����� �ڷḦ �� ó������ �� ���������� ���������� �˻�



public class ArrayListExample01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		System.out.println("����� �ڷ� ��:"+list1.size());
		
//		list1.add("ȫ�浿");
//		list1.add(100);
		
//		for(int i=1;i<=16;i++) {
//			list1.add(i*1000);	
//		}
//		System.out.println(list1);
//		
//		System.out.println(list1.contains("ȫ�浿"));
		
		list1.add(new Product("����",1500));
		list1.add(new Product("����Ű����",90000));
//		list1.add("ȫ�浿");
		
		System.out.println(list1);//����Ʈ�� ����.
		System.out.println("����� �ڷ� ��:"+list1.size());
		
		
		for(int i=0; i<list1.size();i++) {
			Product p1 =(Product)list1.get(i);//��ȯŸ���� ������Ʈ? ��ĳ��Ʈ�� ���� ������. ������ �ٿ�ĳ��Ʈ �ؾ���
			System.out.println("��ǰ���� : "+p1.price);
		}
	//���׸�:�ش�Ǵ� ��ü�� ���� �Է�Ÿ�� �����Ѵ�. �������� �����͸� ����.
		List<Product> list2=new ArrayList<Product>();//List���� produst�� �ƴϸ� �ȵȴ�
		list2.add(new Product("����",1500));
		list2.add(new Product("����Ű����",90000));
		list2.add(new Product("���찳",500));
		list2.add(new Product("���콺",25000));
		list2.add(new Product("USB���",55000));
//		list2.add("ȫ�浿");//������! :product type�� �ƴϱ� ������ �������� ����		
		for(int i=0; i<list2.size();i++) {
			Product p2 =(Product)list2.get(i);//cast ������ ����
			System.out.println("��ǰ���� : "+p2.pName);
		}		
	//�ݺ��ڸ� �̿��� �˻�
	//	<�������>
	//	Iterator <��ü��> ���� = ���ü��.iterator(); <>:���׸�
	//	  hasNext() : �о�� �ڷᰡ ������ true, �ڷᰡ ������ false ��ȯ
	//	  next() : ���� �ڷḦ �о��	
		
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
		return "��ǰ��:"+pName+" => "+price+"��";
	}
}

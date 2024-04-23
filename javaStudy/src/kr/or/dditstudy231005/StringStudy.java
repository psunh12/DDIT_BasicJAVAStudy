package kr.or.dditstudy231005;

import java.io.File;

public class StringStudy {

	public static void main(String[] args) {
		StringStudy ss = new StringStudy();
//		ss.test();
//		ss.test1();
//		ss.test2();
//		ss.test3();
//		ss.test4();
//		ss.test5();
//		ss.test6();
//		ss.test7();
		ss.test8();
		
	}
	private void test8() {
		String str = "��������������";//null�� ���� �޼ҵ尡 ������ ��������. ���� ���忡 null�� �����ʴ´ٴ� �� ����
		if(str !=null && !str.isEmpty()) {//null�� ������ �տ� ��������!
			System.out.println("�� ���ڿ�");
		}
		str="";
		if(str.isEmpty()) {
			System.out.println("�� ���ڿ�");
		}
	}
	
	private void test7() {
		//substring: ���ڿ� �ڸ���
		String str= "1, 2, 3�Դϴ�.";
		System.out.println(str);
//		str=str.substring(3);
//		System.out.println(str);
		str=str.substring(3,5);
		System.out.println(str);
	}
	
	private void test6() {
		String str= "1, 2, 3�Դϴ�.";
		System.out.println(str);
		
		String arr[] = str.split("\n");//�������� �ڸ�. �ٹٲ��ҋ� ���� ���
		for(String a : arr) {
			System.out.println(a.trim());
		}
	}
	private void test5() {
		//replace:Ư�� ���ڸ� �ٲ۴�
		//replace all: ��ü�ٲ�?
		String str= "���ڿ� test test �Դϴ�.";
		System.out.println(str);
		
		//���ʿ� �ٲ� ����, ���ʿ� �ٲٰ���� ����
		str=str.replace("test","�ٲ� ���ڿ�");
		System.out.println(str);
		
	    str = str.replace("�Դϴ�.","");
	    System.out.println(str);
		
	}
	
	private void test4() {
		//��������
		String test = "            ����    ���� \n    \r     \r\n    ";
		System.out.println("------------------------");
		System.out.println(test);
		System.out.println("------------------------");
		test = test.trim();//ex)ȸ�����Խ� �����Է� ����
		
		System.out.println(test);//���忡 �ִ� ����� ������� ����.
		System.out.println("------------------------");
	}
	
	private void test3() {
		//�ҹ��ڸ� �빮�ڷ� ����, �빮�ڸ� �ҹ��ڷ� ����
		String test = "�ҹ��� ���ڿ� abcdef �Դϴ�.";
		System.out.println(test);
	
		test = test.toUpperCase();
		System.out.println(test);
		test = test.toLowerCase();
		System.out.println(test);
	}
	
	//startsWith:���� ������ ���. ex)22�⵵ ���ڸ� ����Ҷ� ���.
	//endsWith:Ȯ���� �����Ҷ� ��� ex)���� ���ϸ� ���.
	private void test2() {
		String test = "���ڿ� test �Դϴ�.";
		if(test.startsWith("���ڿ�")) {//���ڿ� ����
			System.out.println("���ڿ��� �����մϴ�.");
		}
		if(test.endsWith("�Դϴ�.")) {//���ڿ� ��
			System.out.println("�Դϴ�.�� �����ϴ�.");
		}
		
		int cnt =0;
		File dir =new File("���ϰ��");//����import
		for(String fName : dir.list()) {
			if(fName.startsWith("2023")) {
				
			}
			
			else {
				continue;//break�� ���� ���� continue�� ��� �����Ѵٴ� �ǹ� ex)2023�� ������ �ƴϸ� if���� �������� �ʰ� �ٽ� ã���� ��. 
			}
			if(fName.endsWith(".xls")||fName.endsWith(".xlsx")) {
				cnt++;
			}
	}
	System.out.println("2023���� ���۵Ǵ� ���� ���� ����: "+cnt);
	
	}
	
	private void test1() {
		String test = "���ڿ� test �Դϴ�.";
		String search = "test";
		if(test.contains(search)) {//���� �ִ��� �˻�
			System.out.println(search+" ���� ���ԵǾ� �ֽ��ϴ�.");
		}
		if(test.equals(search)) {//�񱳿���
			System.out.println(search+" ���� �����մϴ�.");
		}
	}
	
	private void test() {
		String test = "���ڿ� test �Դϴ�.";
		char[] charArray = test.toCharArray();
		for(char c :test.toCharArray()) {//�迭�� ����Ʈ�� ���Ե� Ÿ���� �������ָ� int i�����ϴ°Ͱ� ����
			System.out.println(c);
		}
		for(int i=0; i<test.length();i++) {
			System.out.println(test.charAt(i));
		}
	}
}

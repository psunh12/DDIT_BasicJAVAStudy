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
		String str = "ㅇㅇㅇㅇㅇㅇㅇ";//null이 오면 메소드가 실행이 되지않음. 다음 문장에 null값 받지않는다는 말 쓰기
		if(str !=null && !str.isEmpty()) {//null값 문장은 앞에 먼저쓰기!
			System.out.println("빈 문자열");
		}
		str="";
		if(str.isEmpty()) {
			System.out.println("빈 문자열");
		}
	}
	
	private void test7() {
		//substring: 문자열 자르기
		String str= "1, 2, 3입니다.";
		System.out.println(str);
//		str=str.substring(3);
//		System.out.println(str);
		str=str.substring(3,5);
		System.out.println(str);
	}
	
	private void test6() {
		String str= "1, 2, 3입니다.";
		System.out.println(str);
		
		String arr[] = str.split("\n");//기준으로 자름. 줄바꿈할떄 많이 사용
		for(String a : arr) {
			System.out.println(a.trim());
		}
	}
	private void test5() {
		//replace:특정 문자를 바꾼다
		//replace all: 전체바뀜?
		String str= "문자열 test test 입니다.";
		System.out.println(str);
		
		//앞쪽에 바꿀 문자, 뒤쪽에 바꾸고싶은 문자
		str=str.replace("test","바뀐 문자열");
		System.out.println(str);
		
	    str = str.replace("입니다.","");
	    System.out.println(str);
		
	}
	
	private void test4() {
		//공백제거
		String test = "            공백    제거 \n    \r     \r\n    ";
		System.out.println("------------------------");
		System.out.println(test);
		System.out.println("------------------------");
		test = test.trim();//ex)회원가입시 공백입력 방지
		
		System.out.println(test);//문장에 있는 띄어쓰기는 사라지지 않음.
		System.out.println("------------------------");
	}
	
	private void test3() {
		//소문자를 대문자로 변경, 대문자를 소문자로 변경
		String test = "소문자 문자열 abcdef 입니다.";
		System.out.println(test);
	
		test = test.toUpperCase();
		System.out.println(test);
		test = test.toLowerCase();
		System.out.println(test);
	}
	
	//startsWith:파일 읽을때 사용. ex)22년도 문자만 사용할때 사용.
	//endsWith:확장자 추출할때 사용 ex)엑셀 파일만 사용.
	private void test2() {
		String test = "문자열 test 입니다.";
		if(test.startsWith("문자열")) {//문자열 시작
			System.out.println("문자열로 시작합니다.");
		}
		if(test.endsWith("입니다.")) {//문자열 끝
			System.out.println("입니다.로 끝납니다.");
		}
		
		int cnt =0;
		File dir =new File("파일경로");//파일import
		for(String fName : dir.list()) {
			if(fName.startsWith("2023")) {
				
			}
			
			else {
				continue;//break는 포문 종료 continue는 계속 실행한다는 의미 ex)2023년 파일이 아니면 if문을 종료하지 않고 다시 찾으러 감. 
			}
			if(fName.endsWith(".xls")||fName.endsWith(".xlsx")) {
				cnt++;
			}
	}
	System.out.println("2023으로 시작되는 엑셀 문서 개수: "+cnt);
	
	}
	
	private void test1() {
		String test = "문자열 test 입니다.";
		String search = "test";
		if(test.contains(search)) {//값이 있는지 검색
			System.out.println(search+" 값이 포함되어 있습니다.");
		}
		if(test.equals(search)) {//비교연산
			System.out.println(search+" 값이 동일합니다.");
		}
	}
	
	private void test() {
		String test = "문자열 test 입니다.";
		char[] charArray = test.toCharArray();
		for(char c :test.toCharArray()) {//배열과 리스트에 포함된 타입을 선언해주면 int i선언하는것과 동일
			System.out.println(c);
		}
		for(int i=0; i<test.length();i++) {
			System.out.println(test.charAt(i));
		}
	}
}

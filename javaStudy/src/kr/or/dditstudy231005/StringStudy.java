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
		String str = "ししししししし";//null戚 神檎 五社球亜 叔楳戚 鞠走省製. 陥製 庚舌拭 null葵 閤走省澗陥澗 源 床奄
		if(str !=null && !str.isEmpty()) {//null葵 庚舌精 蒋拭 胡煽床奄!
			System.out.println("朔 庚切伸");
		}
		str="";
		if(str.isEmpty()) {
			System.out.println("朔 庚切伸");
		}
	}
	
	private void test7() {
		//substring: 庚切伸 切牽奄
		String str= "1, 2, 3脊艦陥.";
		System.out.println(str);
//		str=str.substring(3);
//		System.out.println(str);
		str=str.substring(3,5);
		System.out.println(str);
	}
	
	private void test6() {
		String str= "1, 2, 3脊艦陥.";
		System.out.println(str);
		
		String arr[] = str.split("\n");//奄層生稽 切硯. 匝郊嘩拝�� 弦戚 紫遂
		for(String a : arr) {
			System.out.println(a.trim());
		}
	}
	private void test5() {
		//replace:働舛 庚切研 郊菓陥
		//replace all: 穿端郊会?
		String str= "庚切伸 test test 脊艦陥.";
		System.out.println(str);
		
		//蒋楕拭 郊蝦 庚切, 及楕拭 郊荷壱粛精 庚切
		str=str.replace("test","郊駕 庚切伸");
		System.out.println(str);
		
	    str = str.replace("脊艦陥.","");
	    System.out.println(str);
		
	}
	
	private void test4() {
		//因拷薦暗
		String test = "            因拷    薦暗 \n    \r     \r\n    ";
		System.out.println("------------------------");
		System.out.println(test);
		System.out.println("------------------------");
		test = test.trim();//ex)噺据亜脊獣 因拷脊径 号走
		
		System.out.println(test);//庚舌拭 赤澗 句嬢床奄澗 紫虞走走 省製.
		System.out.println("------------------------");
	}
	
	private void test3() {
		//社庚切研 企庚切稽 痕井, 企庚切研 社庚切稽 痕井
		String test = "社庚切 庚切伸 abcdef 脊艦陥.";
		System.out.println(test);
	
		test = test.toUpperCase();
		System.out.println(test);
		test = test.toLowerCase();
		System.out.println(test);
	}
	
	//startsWith:督析 石聖凶 紫遂. ex)22鰍亀 庚切幻 紫遂拝凶 紫遂.
	//endsWith:溌舌切 蓄窒拝凶 紫遂 ex)植漆 督析幻 紫遂.
	private void test2() {
		String test = "庚切伸 test 脊艦陥.";
		if(test.startsWith("庚切伸")) {//庚切伸 獣拙
			System.out.println("庚切伸稽 獣拙杯艦陥.");
		}
		if(test.endsWith("脊艦陥.")) {//庚切伸 魁
			System.out.println("脊艦陥.稽 魁崖艦陥.");
		}
		
		int cnt =0;
		File dir =new File("督析井稽");//督析import
		for(String fName : dir.list()) {
			if(fName.startsWith("2023")) {
				
			}
			
			else {
				continue;//break澗 匂庚 曽戟 continue澗 域紗 叔楳廃陥澗 税耕 ex)2023鰍 督析戚 焼艦檎 if庚聖 曽戟馬走 省壱 陥獣 達生君 姶. 
			}
			if(fName.endsWith(".xls")||fName.endsWith(".xlsx")) {
				cnt++;
			}
	}
	System.out.println("2023生稽 獣拙鞠澗 植漆 庚辞 鯵呪: "+cnt);
	
	}
	
	private void test1() {
		String test = "庚切伸 test 脊艦陥.";
		String search = "test";
		if(test.contains(search)) {//葵戚 赤澗走 伊事
			System.out.println(search+" 葵戚 匂敗鞠嬢 赤柔艦陥.");
		}
		if(test.equals(search)) {//搾嘘尻至
			System.out.println(search+" 葵戚 疑析杯艦陥.");
		}
	}
	
	private void test() {
		String test = "庚切伸 test 脊艦陥.";
		char[] charArray = test.toCharArray();
		for(char c :test.toCharArray()) {//壕伸引 軒什闘拭 匂敗吉 展脊聖 識情背爽檎 int i識情馬澗依引 疑析
			System.out.println(c);
		}
		for(int i=0; i<test.length();i++) {
			System.out.println(test.charAt(i));
		}
	}
}

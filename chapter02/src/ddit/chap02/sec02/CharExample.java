package ddit.chap02.sec02;

public class CharExample {

	public static void main(String[] args) {
		//char : 2byte
		//		  Ç¥Çö ¹üÀ§ : 0~65535
		//		 byte => char ÇüÀ¸·Î º¯È¯µÉ ¼ö ¾øÀ½(charÀº À½¼ö°¡ ¾øÀ½)
		//		 ' ' ¾È¿¡ Ç¥Çö
		
		char alpha = 'a';
		
		System.out.println(alpha);
		System.out.println(alpha+1
				0);//aÀÇ ASCII ÄÚµå °ª Ãâ·Â
		System.out.println((char)(alpha+10));//°­Á¦ Çüº¯È¯
		
		char ch1='´ë';//'´ëÇÑ¹Î±¹'Àº 4±ÛÀÚ¶ó¼­ ¿À·ù³²
		System.out.println(ch1+0);//ch1ÀÇ ASCII ÄÚµå °ª Ãâ·Â
		
		System.out.println((int)'°¡');
		System.out.println((int)'ÆR');
		
		//'ABCD...Z' Ãâ·Â
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i);
		}
		
	}

}

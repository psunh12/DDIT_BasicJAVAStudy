package ddit.chap04.sec02;
//1-10까지 합을 구하는 프로그램
public class WhileStatementExample01 {

	public static void main(String[] args) {
//		whileMethod01();
//		whileMethod02();
		whileMethod03();
	}
	public static void whileMethod01() {
		//class 만들지 않고 바로 사용가능.프로젝트때는 class 선언해서 쓰기!
		//while문 안에서 조건에 사용할 변수를 선언을 하려면 밖에서 선언하기
		int sum=0;//합이 저장
		int cnt=0;//1-10까지의 숫자가 저장
		
		while(cnt<=10) {
			sum+=cnt;
			cnt++;
		}
		System.out.println("합="+sum);
	}
	//1-2+3-4...10=?
	public static void whileMethod02() {
		int sum=0;//결과
		int cnt=1;//1-10까지의 숫자
		int sign=-1;//부호
		
		while(cnt<=10) {
			sign=sign*(-1);
			sum=sum+(sign*cnt);
			if(sign>0 && cnt !=1){
				System.out.print("+"+cnt);//1이아닌 양수인지?
			}else {
				System.out.print(sign*cnt);
			}
			cnt++;
			
		}
		System.out.print("="+sum);
		
	}
	//첫날에 100원, 그 다음날부터 전날의 2배씩 저축을 할떄 최초로 100만원을 넘는 날과 
	//그날까지 저축한 액수를 구하시오.
	public static void whileMethod03() {
		//변수 갯수 생각하기: 수익금, 날짜, 그날그날 저금하는 액수
		
		int sum =0;//저금통
		int amount = 100;//100원을 기본값으로 저장
		int days=0;//0으로 초기화.
		
		while(sum<=1000000) {
			sum=sum+amount;
			amount=2*amount;
			days++;
		}
		System.out.println("날수 = "+days);
		System.out.println("저축액 = "+sum);
		
	}
	
	
	
}

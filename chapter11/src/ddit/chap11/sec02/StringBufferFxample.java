package ddit.chap11.sec02;
//StringBuffer 클래스
// - String class의 고정된 성질(immutable) 단점을 개선한 문자열 조작 기능제공
// - 주요메서드
// .append()-현재 버퍼 끝에 매개변수로 제공된 데이터를 추가
// .delete(int start, int end) : start 위치부터 end-1 위에있는 자료를 삭제
// .indexOf(String str) : str문자열의 시작 위치값 반환
// .insert(int offset, 데이터) : offset 위치에 '데이터'를 삽입
// .toString() : 결과를 문자열(String) 타입으로 변환
// SELECT  MEMBER.MEM_NAME AS "회원명"
//,   MEMBER.MEM_JOB AS "직업"
//,   MEMBER.MEM_MILEAGE AS "마일리지"
//FROM MEMBER
//WHERE MEMBER.MEM_JOB <> '공무원'
//AND MEMBER.MEM_MILEAGE>ANY(SELECT MEMBER.MEM_MILEAGE
//                FROM MEMBER
//                WHERE MEMBER.MEM_JOB='공무원');
public class StringBufferFxample {

	public static void main(String[] args) {
		String sql ="SELECT MEMBER.MEM_NAME, \n";//공백 한칸 후 역슬러시
		sql=sql+"MEMBER.MEM_JOB, \n";
		sql=sql+"MEMBER.MEM_MILEAGE \n";
		sql=sql+"FROM MEMBER \n";
		sql=sql+"WHERE MEMBER.MEM_JOB <> '공무원' \n";
		sql=sql+"AND MEMBER.MEM_MILEAGE>ANY(SELECT MEMBER.MEM_MILEAGE \n";
		sql=sql+"FROM MEMBER \n";
		sql=sql+"WHERE MEMBER.MEM_JOB <> '공무원'";
		
		System.out.println(sql);
		
		StringBuffer sb=new StringBuffer();
		sb.append("SELECT MEMBER.MEM_NAME, \n");
		sb.append("MEMBER.MEM_JOB, \n");
		sb.append("MEMBER.MEM_MILEAGE \n");
		sb.append("FROM MEMBER \n");
		
		System.out.println(sb);
	}

}

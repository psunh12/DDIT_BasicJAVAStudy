package dbtest;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBExample01 {

	public static void main(String[] args) {
		DBConnection dbconn =new DBConnection();
//		dbconn.connection();
//		dbconn.selectOne();
//		if(dbconn.insert()>0) {
//			System.out.println("회원등록 성공");
//		}else{
//			System.out.println("회원등록 실패");
//		}
//		int delCount=dbconn.delete();
//		if(delCount>0) {
//			System.out.println(delCount+"명의 자료를 삭제했습니다.");
//			
//		}else {
//			System.out.println("자료삭제 실패");
//		}
		
		int updateCount=dbconn.update();
		if(updateCount>0) {
			System.out.println(updateCount+"명의 자료를 수정했습니다.");
			
		}else {
			System.out.println("자료수정 실패");
		}

	}

}

class DBConnection {

	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "PC01";
	private String passwd = "java";
	
	//변수설정,null초기화
	private Connection conn=null;
	private Statement stmt=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	
	Scanner sc =new Scanner(System.in);

	public void connection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			//System.out.println("DB연결 성공");
			
			String sql="SELECT *FROM tbl_mem ";//조건부여:조건처리를 할 때 조건이 부여된 값이 확정된 경우
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("회원번호\t회원명\t마일리지");
			System.out.println("--------------------------");
			
			while(rs.next()) {
				String mid=rs.getString("MEM_ID");
				String mname=rs.getString("MEM_NAME");//컬럼번호를 적어도 되나 잘 안씀
				int mile=rs.getInt("MEM_MILEAGE");
				
				System.out.println(mid+"\t"+mname+"\t"+mile);
			}
			System.out.println("--------------------------");
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver 파일을 찾을수 없습니다.");
		
		}catch(SQLException e) {
			System.out.println("DB연결에 실패했습니다.");
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
	}
	public void selectList(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//.으로 기술되어있는 패키지에서 .OracleDriver가 존재하는지?(존재하지 않으면 오류)
			conn=DriverManager.getConnection(url,user,passwd);
			//System.out.println("DB연결 성공");
			
			String sql="SELECT *FROM tbl_mem ";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("회원번호\t회원명\t마일리지");
			System.out.println("--------------------------");
			
			while(rs.next()) {
				String mid=rs.getString("MEM_ID");
				String mname=rs.getString("MEM_NAME");//컬럼번호를 적어도 되나 잘 안씀
				int mile=rs.getInt("MEM_MILEAGE");
				
				System.out.println(mid+"\t"+mname+"\t"+mile);
			}
			System.out.println("--------------------------");
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver 파일을 찾을수 없습니다.");
		
		}catch(SQLException e) {//stmt나 rs오류
			System.out.println("DB연결에 실패했습니다.");
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}//close()자원할당
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
	}
	
	public void selectOne(){
		try {
			System.out.print("회원명 : ");
			String name=sc.nextLine();

			System.out.print("회원번호 : ");
			String mid=sc.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			//System.out.println("DB연결 성공");
			
			String sql="SELECT *FROM tbl_mem WHERE mem_name =? AND mem_id=? ";//물음표에 값을 넣어야함, 하나 더 넣고싶다면 물음표 추가
			
//			String sql="SELECT *FROM tbl_mem WHERE mem_name ='"+name"'";//물음표 대신 name 입력, 
			

			
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);//쿼리완성-'?'안의 값
			pstmt.setString(2, mid);//쿼리완성-'?'안의 값
			
			
			rs=pstmt.executeQuery();
			
			
//			while(rs.next()) {
//				String mid =rs.getString("MEM_ID");
//				int mile=rs.getInt("MEM_MILEAGE");
//				
//				System.out.println("회원번호 : "+mid);
//				System.out.println("회원명 : "+name);
//				System.out.println("마일리지 : "+mile);
//				System.out.println("--------------------------");
//			}
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver 파일을 찾을수 없습니다.");
		
		}catch(SQLException e) {
			System.out.println("DB연결에 실패했습니다.");
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
	}
	
	//자료입력 
	public boolean selectOne(String id){
		boolean result = false;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			
			String sql="SELECT *FROM tbl_mem WHERE mem_id=? ";//물음표에 값을 넣어야함, 하나 더 넣고싶다면 물음표 추가
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			conn.commit();
			
			
			if(rs.next()==false) {
				result=true;
			}
		
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver 파일을 찾을수 없습니다.");
		
		}catch(SQLException e) {
			System.out.println("DB연결에 실패했습니다.");
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
		return result;
//		if(rs==null) {//데이터가 없다면
//			return true;//신규회원번호로 사용가능
//		}else {
//			return false;//이미 있으면 사용 불가능
//		}
	}
	
	//자료입력메서드
	public int insert(){
		
		int count=0;
		
		System.out.println("회원번호:");
		String id=sc.next();

		System.out.println("회원명:");
		String name=sc.next();
		

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			
		
			String sql ="INSERT INTO tbl_mem(mem_id,mem_name,mem_mileage)";
		    sql = sql+"VALUES(?,?,0)";//0으로 셋팅된건 마일리지
		    
			pstmt=conn.prepareStatement(sql);
			
			//물음표 갯수대로 setString
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			//역시나 전화번호 생략
			count=pstmt.executeUpdate();//executeUpdate:반환값이 정수(행의 수 반환)
			
			
		
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver 파일을 찾을수 없습니다.");
		
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
		return count;
//전화번호 생략:사유)데이터 없음		
	}
	public int delete() {
		int count=0;
		System.out.println("회원번호:");
		String id=sc.next();
		
		if 

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			
			
			String sql ="DELETE FROM tbl_mem WHERE MEM_ID=?";
				    
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			count=pstmt.executeUpdate();//executeUpdate:반환값이 정수(행의 수 반환)

			if(count!=0) conn.commit();
			
		
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver 파일을 찾을수 없습니다.");
		
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
		return count;

		
	}
	
	
	public int update() {
		int count=0;

		System.out.println("회원번호:");
		String id=sc.next();
		
		if(selectOne(id)) {
			System.out.println("존재하지 않는 회원입니다");
			return count;
		}
		
		
		try {

//			if(selectOne(id)) {
//				System.out.println("존재하지 않는 회원입니다");
//				return count;
//			}

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			
//			if(selectOne(id)) {
//				System.out.println("존재하지 않는 회원입니다.");
//				return count;
//			}else{
			 
			
			String sql ="UPDATE tbl_mem ";
			sql=sql+" SET ";
			
			//이름변경
			System.out.println("이름을 변경하겠습니까(y/n)?");
			String YesNo=sc.next();
			
			if(YesNo.equalsIgnoreCase("y")) {
				System.out.println("회원명 : ");
				String name =sc.next();
				sql=sql+"MEM_NAME= '"+name+"',";
			}

			//전화번호 변경 생략(사유:없음)
//			System.out.println("전화번호를 변경하겠습니까(y/n)?");
//			String YesNo=sc.next();
//			
//			if(YesNo.equalsIgnoreCase("y")) {
//				System.out.println("전화번호 : ");
//				String name =sc.next();
//				sql=sql+"MEM_HP= '"+hp+"',";
//			}

			//마일리지변경
			System.out.println("마일리지를 변경하겠습니까(y/n)?");
			YesNo=sc.next();
			
			if(YesNo.equalsIgnoreCase("y")) {
				System.out.println("마일리지 : ");
				int mile =sc.nextInt();
				sql=sql+"MEM_MILEAGE= "+mile+",";
			}
			
			sql=sql.substring(0,sql.length()-2);
			sql=sql+"WHERE MEM_ID = ?";
			//System.out.println(sql);
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			count=pstmt.executeUpdate();//executeUpdate:반환값이 정수(행의 수 반환)

			if(count!=0) conn.commit();
			
		
			
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver 파일을 찾을수 없습니다.");
		
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
		return count;

		
	}

}

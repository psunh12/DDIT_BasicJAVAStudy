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
//			System.out.println("ȸ����� ����");
//		}else{
//			System.out.println("ȸ����� ����");
//		}
//		int delCount=dbconn.delete();
//		if(delCount>0) {
//			System.out.println(delCount+"���� �ڷḦ �����߽��ϴ�.");
//			
//		}else {
//			System.out.println("�ڷ���� ����");
//		}
		
		int updateCount=dbconn.update();
		if(updateCount>0) {
			System.out.println(updateCount+"���� �ڷḦ �����߽��ϴ�.");
			
		}else {
			System.out.println("�ڷ���� ����");
		}

	}

}

class DBConnection {

	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "PC01";
	private String passwd = "java";
	
	//��������,null�ʱ�ȭ
	private Connection conn=null;
	private Statement stmt=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	
	Scanner sc =new Scanner(System.in);

	public void connection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			//System.out.println("DB���� ����");
			
			String sql="SELECT *FROM tbl_mem ";//���Ǻο�:����ó���� �� �� ������ �ο��� ���� Ȯ���� ���
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("ȸ����ȣ\tȸ����\t���ϸ���");
			System.out.println("--------------------------");
			
			while(rs.next()) {
				String mid=rs.getString("MEM_ID");
				String mname=rs.getString("MEM_NAME");//�÷���ȣ�� ��� �ǳ� �� �Ⱦ�
				int mile=rs.getInt("MEM_MILEAGE");
				
				System.out.println(mid+"\t"+mname+"\t"+mile);
			}
			System.out.println("--------------------------");
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver ������ ã���� �����ϴ�.");
		
		}catch(SQLException e) {
			System.out.println("DB���ῡ �����߽��ϴ�.");
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
	}
	public void selectList(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//.���� ����Ǿ��ִ� ��Ű������ .OracleDriver�� �����ϴ���?(�������� ������ ����)
			conn=DriverManager.getConnection(url,user,passwd);
			//System.out.println("DB���� ����");
			
			String sql="SELECT *FROM tbl_mem ";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("ȸ����ȣ\tȸ����\t���ϸ���");
			System.out.println("--------------------------");
			
			while(rs.next()) {
				String mid=rs.getString("MEM_ID");
				String mname=rs.getString("MEM_NAME");//�÷���ȣ�� ��� �ǳ� �� �Ⱦ�
				int mile=rs.getInt("MEM_MILEAGE");
				
				System.out.println(mid+"\t"+mname+"\t"+mile);
			}
			System.out.println("--------------------------");
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver ������ ã���� �����ϴ�.");
		
		}catch(SQLException e) {//stmt�� rs����
			System.out.println("DB���ῡ �����߽��ϴ�.");
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}//close()�ڿ��Ҵ�
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
	}
	
	public void selectOne(){
		try {
			System.out.print("ȸ���� : ");
			String name=sc.nextLine();

			System.out.print("ȸ����ȣ : ");
			String mid=sc.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			//System.out.println("DB���� ����");
			
			String sql="SELECT *FROM tbl_mem WHERE mem_name =? AND mem_id=? ";//����ǥ�� ���� �־����, �ϳ� �� �ְ�ʹٸ� ����ǥ �߰�
			
//			String sql="SELECT *FROM tbl_mem WHERE mem_name ='"+name"'";//����ǥ ��� name �Է�, 
			

			
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);//�����ϼ�-'?'���� ��
			pstmt.setString(2, mid);//�����ϼ�-'?'���� ��
			
			
			rs=pstmt.executeQuery();
			
			
//			while(rs.next()) {
//				String mid =rs.getString("MEM_ID");
//				int mile=rs.getInt("MEM_MILEAGE");
//				
//				System.out.println("ȸ����ȣ : "+mid);
//				System.out.println("ȸ���� : "+name);
//				System.out.println("���ϸ��� : "+mile);
//				System.out.println("--------------------------");
//			}
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver ������ ã���� �����ϴ�.");
		
		}catch(SQLException e) {
			System.out.println("DB���ῡ �����߽��ϴ�.");
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
	}
	
	//�ڷ��Է� 
	public boolean selectOne(String id){
		boolean result = false;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			
			String sql="SELECT *FROM tbl_mem WHERE mem_id=? ";//����ǥ�� ���� �־����, �ϳ� �� �ְ�ʹٸ� ����ǥ �߰�
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			conn.commit();
			
			
			if(rs.next()==false) {
				result=true;
			}
		
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver ������ ã���� �����ϴ�.");
		
		}catch(SQLException e) {
			System.out.println("DB���ῡ �����߽��ϴ�.");
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
		return result;
//		if(rs==null) {//�����Ͱ� ���ٸ�
//			return true;//�ű�ȸ����ȣ�� ��밡��
//		}else {
//			return false;//�̹� ������ ��� �Ұ���
//		}
	}
	
	//�ڷ��Է¸޼���
	public int insert(){
		
		int count=0;
		
		System.out.println("ȸ����ȣ:");
		String id=sc.next();

		System.out.println("ȸ����:");
		String name=sc.next();
		

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			
		
			String sql ="INSERT INTO tbl_mem(mem_id,mem_name,mem_mileage)";
		    sql = sql+"VALUES(?,?,0)";//0���� ���õȰ� ���ϸ���
		    
			pstmt=conn.prepareStatement(sql);
			
			//����ǥ ������� setString
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			//���ó� ��ȭ��ȣ ����
			count=pstmt.executeUpdate();//executeUpdate:��ȯ���� ����(���� �� ��ȯ)
			
			
		
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver ������ ã���� �����ϴ�.");
		
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(stmt!=null) try {stmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}

		}
		return count;
//��ȭ��ȣ ����:����)������ ����		
	}
	public int delete() {
		int count=0;
		System.out.println("ȸ����ȣ:");
		String id=sc.next();
		
		if 

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			
			
			String sql ="DELETE FROM tbl_mem WHERE MEM_ID=?";
				    
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			count=pstmt.executeUpdate();//executeUpdate:��ȯ���� ����(���� �� ��ȯ)

			if(count!=0) conn.commit();
			
		
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver ������ ã���� �����ϴ�.");
		
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

		System.out.println("ȸ����ȣ:");
		String id=sc.next();
		
		if(selectOne(id)) {
			System.out.println("�������� �ʴ� ȸ���Դϴ�");
			return count;
		}
		
		
		try {

//			if(selectOne(id)) {
//				System.out.println("�������� �ʴ� ȸ���Դϴ�");
//				return count;
//			}

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,passwd);
			
//			if(selectOne(id)) {
//				System.out.println("�������� �ʴ� ȸ���Դϴ�.");
//				return count;
//			}else{
			 
			
			String sql ="UPDATE tbl_mem ";
			sql=sql+" SET ";
			
			//�̸�����
			System.out.println("�̸��� �����ϰڽ��ϱ�(y/n)?");
			String YesNo=sc.next();
			
			if(YesNo.equalsIgnoreCase("y")) {
				System.out.println("ȸ���� : ");
				String name =sc.next();
				sql=sql+"MEM_NAME= '"+name+"',";
			}

			//��ȭ��ȣ ���� ����(����:����)
//			System.out.println("��ȭ��ȣ�� �����ϰڽ��ϱ�(y/n)?");
//			String YesNo=sc.next();
//			
//			if(YesNo.equalsIgnoreCase("y")) {
//				System.out.println("��ȭ��ȣ : ");
//				String name =sc.next();
//				sql=sql+"MEM_HP= '"+hp+"',";
//			}

			//���ϸ�������
			System.out.println("���ϸ����� �����ϰڽ��ϱ�(y/n)?");
			YesNo=sc.next();
			
			if(YesNo.equalsIgnoreCase("y")) {
				System.out.println("���ϸ��� : ");
				int mile =sc.nextInt();
				sql=sql+"MEM_MILEAGE= "+mile+",";
			}
			
			sql=sql.substring(0,sql.length()-2);
			sql=sql+"WHERE MEM_ID = ?";
			//System.out.println(sql);
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			count=pstmt.executeUpdate();//executeUpdate:��ȯ���� ����(���� �� ��ȯ)

			if(count!=0) conn.commit();
			
		
			
		
		}catch(ClassNotFoundException e) {
			System.out.println("OracleDriver ������ ã���� �����ϴ�.");
		
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

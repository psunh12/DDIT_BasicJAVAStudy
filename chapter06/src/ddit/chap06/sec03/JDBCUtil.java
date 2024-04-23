package ddit.chap06.sec03;

import java.util.List;
import java.util.Map;

public class JDBCUtil {
	   public Employee selectOne(List<Object> param){
		      String sql = "SELECT*FROM employee WHERE empID = ? AND empName = ?";
		      return executeQuery(sql);
		      
		   }

		   public List<Map<String,Object>> selectList(){
		      String sql = "SELECT*FROM employee WHERE deptName = ?";
		      return executeQuery(sql);
		   }

		   public List<Map<String,Object>> selectList(String str){
		      String sql = "SELECT*FROM employee WHERE deptName = '"+str+"'";
		      return executeQuery(sql);
		   }
}
 
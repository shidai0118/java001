import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class Test01
{
	public static void main(String[] args){
	Connection conn=null;
	Statement stmt=null;
	Driver driver=new com.mysql.jdbc.Driver();
	DriverManager.registerDriver(driver);
	String url="jdbc:mysql://127.0.0.1:3306/bjpowernode";
	String user="root";
	String password="118";
	System.out.printin("���ݿ�i���Ӷ���Ϊ"+conn);
	stmt=conn.createStatement();
	String sql="insert into dept(deptno,dname,loc) values(50,'����','����')";
	int count=stmt.executeUpdate(sql);
	System.out.println(count==1 ? "����ɹ�" : "����ʧ��");
	try{
	}catch(SQLException e){
	e.printStackTrace();
	}finally{
		try{
		if(stmt !=null){
		stmt.close();
		}
		}catch(SQLException e){
		e.printStackTrace();
		}
		try{
		if(conn !=null){
		conn.close();
		}
		}catch(SQLException e){
		e.printStackTrace();
		}
	}
	}
}

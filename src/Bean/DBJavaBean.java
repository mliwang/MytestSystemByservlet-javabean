package Bean;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
public class DBJavaBean {
	public Connection con=null;
	 public ResultSet rs=null;
	 private String drivername="com.mysql.jdbc.Driver";
	 private String url="jdbc:mysql://localhost:3306/ks?useUnicode=true&characterEncoding=gbk";
	 private String user="root";
	 private String password="";
	 private Statement st=null;
	 public Statement getStatement(){
		 try {
				Class.forName(getDrivername());
				this.con=DriverManager.getConnection(getUrl(),getUser(),getPassword());
				return con.createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				message("�޷�������ݿ�����ӻ����޷���������");
				return null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		
	 }
	 /**
	  * �����ݿ��������
	  * @param sql
	  * @return
	  */
	 public boolean update(String sql){
		 
		 try {
			 st=getStatement();
			int row = st.executeUpdate(sql);
		
			if(row==1){
				st.close();
				con.close();
				return true;
			}
			else{
				st.close();
				con.close();
				return false;}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message("�޷���������insert()����");
			return false;
		}
	 }
	 /**
	  * ��ѯ������Ϣ
	  * @param sql
	  * @return
	  */
	 public ResultSet select(String sql){
		 try {
			 st=getStatement();
			return st.executeQuery(sql);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message("�޷���ѯ����select()����");
			return null;
		}
		 
	 }
	 
	 public  static void message(String msg){
		 JOptionPane.showMessageDialog(null, msg,"��Ϣ��ʾ",JOptionPane.YES_NO_OPTION);
	 }
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Statement getSt() {
		return st;
	}
	public void setSt(Statement st) {
		this.st = st;
	}
	 /**
	  * �ֶ��ر����ݿ���Դ  * @param stmt
	  * @param conn
	  * @param rs
	  */
	public static void release(Statement stmt,Connection conn,ResultSet rs ){
		if(rs != null){
			try {
				rs.close() ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(stmt != null){
			try {
				stmt.close() ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn != null){
			try {
				conn.close() ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	 
	 


}

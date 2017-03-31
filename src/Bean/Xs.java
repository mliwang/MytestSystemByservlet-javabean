package Bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * 学生表（学号、姓名、密码、性别、班级、QQ、电话、是否通过申请）
 * @author Administrator
 *
 */
public class Xs {
    private Integer sno;//学号

    private String sname;//姓名

    private String spassword;//密码

    private String ssex;//性别

    private String banji;//班级

    private String qq;//QQ

    private Integer phone;//电话

    private Boolean passed;//是否通过申请
    
    public Xs() {
		
	}
   
    public Xs(Integer sno, String sname, String spassword, String ssex,
			String banji, String qq, Integer phone, Boolean passed) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.spassword = spassword;
		this.ssex = ssex;
		this.banji = banji;
		this.qq = qq;
		this.phone = phone;
		this.passed = passed;
	}
    /**
    * 存储校验不通过时给用户的错误提示信息
    */
    private Map<String, String> errors = new HashMap<String, String>();
    public Map<String, String> getErrors() {
    return errors;
    }
    public void setErrors(Map<String, String> errors) {
    this.errors = errors;
    }
    public boolean validate() {
    boolean isOk = true;
    return isOk;
    }
    public static boolean islegeal(Integer sno,String spassword){
    	boolean isOk = false;
    	Xs xs = findXs(sno);//找到当前学生
    	if(xs!=null){
    		if(xs.getSpassword().equals(spassword)){isOk= true;}
    		else{
    			
    		}
    	}
    	return isOk;
    	
    }

    /**
     * 根据学号查找学生的信息
     * @param sno
     * @return
     */
    public static Xs findXs(Integer sno){
    	DBJavaBean db = new DBJavaBean();
    	
    	String sql="SELECT* FROM xs WHERE xs.sno ="+sno;
    	System.out.println(sql);
    	try {
			ResultSet rs = db.select(sql);
			Xs xs = new Xs();
			while(rs.next()){
	    	xs.setSno(sno);
	    	xs.setSname(rs.getString("sname"));
			xs.setSpassword(rs.getString("spassword"));
			xs.setBanji(rs.getString("banji"));
			xs.setSsex(rs.getString("ssex"));
			xs.setQq(rs.getString("qq"));
			xs.setPhone(Integer.parseInt(rs.getString("phone")));
			xs.setPassed(Boolean.parseBoolean(rs.getString("passed")));}
			rs.close();

			return xs;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
    	
    }
    /**
     * 添加学生
     */
	public void addXS(){
    	DBJavaBean db = new DBJavaBean();
    	String sql="INSERT INTO `xs` (`sno`, `sname`, `spassword`, `ssex`, `banji`, `qq`, `phone`, `passed`) "
    			+ "VALUES ("+this.sno+", '"+this.sname+"', '"+this.spassword+"', '"+this.ssex+"', '"+this.banji+"', '"+
    			this.qq+"', "+this.phone+", "+false+")";
    	System.out.println(sql);
    	boolean b = db.update(sql);
    	if(!b){
    		db.message("学生注册失败");
    		
    	}
    	else{
    		db.message("学生注册成功");
    	}
    	
    }
	/**
	 * 修改学生信息
	 */
	public void UpdateXS(){
    	DBJavaBean db = new DBJavaBean();
    	String sql="UPDATE `xs`SET  "
    			+ "`sname`='"+this.sname+"', "
    			+ "`spassword`='"+this.spassword+"', "
    			+ "`ssex`='"+this.ssex+"', "
    			+ "`banji`='"+this.banji+"', "
    			+ "`qq`='"+this.qq+"', "
    			+ "`phone`="+this.phone
    			+ " WHERE (`sno`="+this.sno+")";
    	System.out.println(sql);
    	boolean b = db.update(sql);
    	if(!b){
    		db.message("修改学生信息失败");
    		
    	}
    	else{
    		db.message("修改学生信息成功");
    	}
    	
    }
	

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword == null ? null : spassword.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji == null ? null : banji.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Boolean getPassed() {
        return passed;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }
}
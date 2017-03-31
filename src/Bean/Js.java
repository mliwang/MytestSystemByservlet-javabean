package Bean;
/**
 * 教师类
 * @author Administrator
 *
 */
public class Js {
    private Integer jno;//教师编号

    private String jname;//教师姓名

    private String jpassword;//密码

    public Integer getJno() {
        return jno;
    }

    public void setJno(Integer jno) {
        this.jno = jno;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname == null ? null : jname.trim();
    }

    public String getJpassword() {
        return jpassword;
    }

    public void setJpassword(String jpassword) {
        this.jpassword = jpassword == null ? null : jpassword.trim();
    }
}
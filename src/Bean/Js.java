package Bean;
/**
 * ��ʦ��
 * @author Administrator
 *
 */
public class Js {
    private Integer jno;//��ʦ���

    private String jname;//��ʦ����

    private String jpassword;//����

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
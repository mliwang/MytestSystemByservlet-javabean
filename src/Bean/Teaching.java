package Bean;
/**
 * 教师任课类
 * @author Administrator
 *
 */

public class Teaching {
    private Integer id;//序号

    private Integer jno;//教师编号

    private String banji;//班级

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJno() {
        return jno;
    }

    public void setJno(Integer jno) {
        this.jno = jno;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji == null ? null : banji.trim();
    }
}
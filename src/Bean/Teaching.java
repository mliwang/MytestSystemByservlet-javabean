package Bean;
/**
 * ��ʦ�ο���
 * @author Administrator
 *
 */

public class Teaching {
    private Integer id;//���

    private Integer jno;//��ʦ���

    private String banji;//�༶

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
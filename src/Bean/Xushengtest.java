package Bean;

import java.util.Date;
/**
 * ѧ�����Ա���š�ѧ��ѧ�š���Ŀ��š�ѧ���𰸡��Ƿ���ȷ������ʱ�䣩
 * @author Administrator
 *
 */

public class Xushengtest {
    private Integer id;//���

    private Integer sno;//ѧ��ѧ��

    private Integer questionnumber;//��Ŀ���

    private String studentanswer;//ѧ����

    private Boolean isright;//�Ƿ���ȷ

    private String compeledtime;//����ʱ��

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public Integer getQuestionnumber() {
        return questionnumber;
    }

    public void setQuestionnumber(Integer questionnumber) {
        this.questionnumber = questionnumber;
    }

    public String getStudentanswer() {
        return studentanswer;
    }

    public void setStudentanswer(String studentanswer) {
        this.studentanswer = studentanswer == null ? null : studentanswer.trim();
    }

    public Boolean getIsright() {
        return isright;
    }

    public void setIsright(Boolean isright) {
        this.isright = isright;
    }

    public String getCompeledtime() {
        return compeledtime;
    }

    public void setCompeledtime(String compeledtime) {
        this.compeledtime = compeledtime;
    }
}
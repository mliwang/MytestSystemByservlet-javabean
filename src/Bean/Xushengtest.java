package Bean;

import java.util.Date;
/**
 * 学生测试表（序号、学生学号、题目序号、学生答案、是否正确、日期时间）
 * @author Administrator
 *
 */

public class Xushengtest {
    private Integer id;//序号

    private Integer sno;//学生学号

    private Integer questionnumber;//题目序号

    private String studentanswer;//学生答案

    private Boolean isright;//是否正确

    private String compeledtime;//日期时间

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
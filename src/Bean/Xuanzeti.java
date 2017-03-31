package Bean;
/**
 * 选择题表（序号、章节、题干、答案）
 * @author Administrator
 *
 */

public class Xuanzeti {
    private Integer questionnumber;//题号

    private String zhangjie;//章节

    private String answer;//正确答案

    private String tigan;//题干

    public Integer getQuestionnumber() {
        return questionnumber;
    }

    public void setQuestionnumber(Integer questionnumber) {
        this.questionnumber = questionnumber;
    }

    public String getZhangjie() {
        return zhangjie;
    }

    public void setZhangjie(String zhangjie) {
        this.zhangjie = zhangjie == null ? null : zhangjie.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getTigan() {
        return tigan;
    }

    public void setTigan(String tigan) {
        this.tigan = tigan == null ? null : tigan.trim();
    }
}
package Bean;
/**
 * ѡ�������š��½ڡ���ɡ��𰸣�
 * @author Administrator
 *
 */

public class Xuanzeti {
    private Integer questionnumber;//���

    private String zhangjie;//�½�

    private String answer;//��ȷ��

    private String tigan;//���

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
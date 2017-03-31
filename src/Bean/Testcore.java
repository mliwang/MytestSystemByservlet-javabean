package Bean;

import java.sql.ResultSet;
import java.util.ArrayList;
/**
 * ���Է�������š�ѧ��ѧ�š��½ڡ�����������ʱ�䣩
 * @author Administrator
 *
 */

public class Testcore {
    private Integer ttnumber;//���
    private Integer sno;//ѧ��ѧ��
    private String sname;//����
	private String zhangjie;//�½�
	private Float score;//����
    private String compeledtime;//����ʱ��
    public static ArrayList<Testcore> findTestcore(){
    DBJavaBean db = new DBJavaBean();
    	String sql="SELECT testcore.ttnumber,testcore.sno,testcore.zhangjie,testcore.score,"
    			+"testcore.compeledtime,xs.sname FROM testcore"
        +" INNER JOIN xs ON testcore.sno = xs.sno"
        +" ORDER BY testcore.ttnumber DESC";
    	System.out.println(sql);
    	try {
			ResultSet rs = db.select(sql);
			ArrayList<Testcore> list = new ArrayList<Testcore>();
			
			while(rs.next()){
				Testcore testcore = new Testcore();
				testcore.setSno(Integer.parseInt(rs.getString("testcore.sno")));
				testcore.setSname(rs.getString("xs.sname"));
				testcore.setTtnumber(Integer.parseInt(rs.getString("testcore.ttnumber")));
				testcore.setZhangjie((rs.getString("testcore.zhangjie")));
				testcore.setScore(Float.parseFloat((rs.getString("testcore.score"))));
				testcore.setCompeledtime((rs.getString("testcore.compeledtime")));
				list.add(testcore);
			}
			rs.close();
			return list;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
    	
    	
    }
    public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}


    public Integer getTtnumber() {
        return ttnumber;
    }

    public void setTtnumber(Integer ttnumber) {
        this.ttnumber = ttnumber;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getZhangjie() {
        return zhangjie;
    }

    public void setZhangjie(String zhangjie) {
        this.zhangjie = zhangjie == null ? null : zhangjie.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getCompeledtime() {
        return compeledtime;
    }

    public void setCompeledtime(String compeledtime) {
        this.compeledtime = compeledtime;
    }
}
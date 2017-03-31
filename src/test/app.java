package test;

import java.util.ArrayList;

import Bean.Testcore;
import Bean.Xs;

public class app {

	public static void main(String[] args) {
		/*Xs xs = new Xs(201111, "王武", "123", "男", "信工一班", "634537", 5326457, true);
		//xs.addXS();
		xs.setSpassword("666666");
		xs.UpdateXS();
		Xs xs2 = Xs.findXs(6565656);
		System.out.println(xs2.getSno());
		System.out.println(xs2.getSname());
		System.out.println(xs2.getSpassword());
		System.out.println(xs2.getBanji());
		System.out.println(xs2.getQq());
		System.out.println(xs2.getSsex());
		System.out.println(xs2.getPhone());
		System.out.println(xs2.getPassed());*/
		ArrayList<Testcore> list = Testcore.findTestcore();
		for (Testcore testcore : list) {
			System.out.print(testcore.getTtnumber()+"**");
			System.out.print(testcore.getSno()+"**");
			System.out.print(testcore.getSname()+"**");
			System.out.print(testcore.getZhangjie()+"**");
			System.out.print(testcore.getScore()+"**");
			System.out.print(testcore.getCompeledtime()+"**");
			System.out.println();
			
			
			
		}
	}

}

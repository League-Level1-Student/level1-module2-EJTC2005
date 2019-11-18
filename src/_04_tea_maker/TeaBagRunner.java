package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class TeaBagRunner {

	
	
	
	public static void main(String[]Args){
		TeaBag teabag = new TeaBag("mint");
		Kettle kettle = new Kettle();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(teabag, kettle.getWater());
		
	}
}

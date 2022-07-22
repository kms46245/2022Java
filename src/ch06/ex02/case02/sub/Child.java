package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent{
	public void play() {
		//this.getRegNum; 			//private
		this.getName();				//public
		this.getMoney();			//protected
		//this.addMoney(1000);		//default
	}	
}

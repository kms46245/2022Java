package ch07.ex01.case09;

public class Shooter {
	//dependency type은 interface로 둔다(확장성)
	private Gun gun; 
	
	public void fire() {
		this.gun.fire();
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}

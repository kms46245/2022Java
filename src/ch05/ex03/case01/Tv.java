package ch05.ex03.case01;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isPower() {			// boolean type = get(X) -> is~
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}	
}

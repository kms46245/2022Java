package ch05.ex08.case01;

public class Baby {
	private String name;

	public Baby() { }			// 생성자 - 입력하지않은경우 이 형태를 컴파일러가 자동으로 입력한다.
	public Baby(String name) {  // 파라미터가 있는 생성자 - 필요한 파라미터값을 넣으면서 생성할 수 있다.
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

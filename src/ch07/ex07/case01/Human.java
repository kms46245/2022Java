package ch07.ex07.case01;

@FunctionalInterface    // lambda
public interface Human {
	void say();
	//void tell();  // 람다선언시 method를 단 하나만 쓸 수 있다.
}

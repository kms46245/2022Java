package ch07.ex06.case06;

// A이하의 모든 원소에 대한 generic type으로 한정된다.
public class Cabinet<T extends A> {
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	//C이하의 원소에대한 generic type
	public <S extends C> S getFinalVal(S[] arr){
		return arr[arr.length - 1];		
	}
}
